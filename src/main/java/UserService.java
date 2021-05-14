import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Objects;

import org.dizitart.no2.Nitrite;
import org.dizitart.no2.objects.ObjectRepository;


public class UserService  {

    private static ObjectRepository<User> userRepository;

    public static void initDatabase() {
        FileServices.initDirectory();
        Nitrite database = Nitrite.builder()
                .filePath(FileServices.getPathToFile("users.db").toFile())
                .openOrCreate("test", "test");

        userRepository = database.getRepository(User.class);
    }

    public static List<User> getAllUsers() {
        return userRepository.find().toList();
    }

    public static void addUser(String username, String password, String role) throws UsernameAlreadyExists{
        checkUserDoesNotAlreadyExist(username);
        userRepository.insert(new User(username, encodePassword(username, password), role));
    }

    static void checkUserDoesNotAlreadyExist(String username) throws UsernameAlreadyExists {
        for (User user : userRepository.find()) {
            if (Objects.equals(username, user.getUsername()))
                throw new UsernameAlreadyExists(username);
        }
    }

    static String encodePassword(String salt, String password) {
        MessageDigest md = getMessageDigest();
        md.update(salt.getBytes(StandardCharsets.UTF_8));

        byte[] hashedPassword = md.digest(password.getBytes(StandardCharsets.UTF_8));

        // This is the way a password should be encoded when checking the credentials
        return new String(hashedPassword, StandardCharsets.UTF_8)
                .replace("\"", ""); //to be able to save in JSON format
    }

    private static MessageDigest getMessageDigest() {
        MessageDigest md;
        try {
            md = MessageDigest.getInstance("SHA-512");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("SHA-512 does not exist!");
        }
        return md;
    }
    public static String getUserRole(String username, String password) throws AccountException {
        for (User user : userRepository.find()) {
            if (Objects.equals(username, user.getUsername()))
            {
                if (Objects.equals(encodePassword(username,password), user.getPassword()))
                    return user.getRole();
                else
                    throw new IncorrectPassword(password);
            }
        }
        throw new UsernameNotExists(username);
    }



}

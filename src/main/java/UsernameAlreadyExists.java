

public class UsernameAlreadyExists extends Exception {

    private String username;

    public UsernameAlreadyExists(String username) {
        super(String.format("Un cont cu numele de utilizator: %s exista!", username));
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}

public class UsernameNotExists extends AccountException{

    private String username;

    public UsernameNotExists(String username) {
        super(String.format("Un cont cu numele de utilizator :%s nu exista!", username));
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}


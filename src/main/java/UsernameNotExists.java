public class UsernameNotExists extends AccountException{

    private String username;

    public UsernameNotExists(String username) {
        super(String.format("An account with the username %s doesn't exist!", username));
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}


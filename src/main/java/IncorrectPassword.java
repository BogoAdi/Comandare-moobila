public class IncorrectPassword extends AccountException {

    private String password;

    public IncorrectPassword(String password) {
        super(String.format("Incorrect password!", password));
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}


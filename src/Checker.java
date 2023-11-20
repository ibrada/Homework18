public interface Checker {


    void checkLogin(String login) throws WrongLoginExeption;

    void checkPassword(String password) throws WrongPasswordExeption;

    void checkConfirmPassword(String password, String confirmPassword) throws WrongPasswordExeption;

}

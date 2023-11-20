public class Check {

     private static Checker checker = new Checking();

    private Check() {
    }

    public static void check(String login, String password, String confirmPassword) throws WrongLoginExeption, WrongPasswordExeption {

        checker.checkLogin(login);
        checker.checkPassword(password);
        checker.checkConfirmPassword(password, confirmPassword);

    }


}

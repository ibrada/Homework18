public class Checking implements Checker {

    private static final String ABC = "abcdefghijklmnopqrstuvwxyz0123456789_";

    @Override
    public void checkLogin(String login) throws WrongLoginExeption {
        if (login.length()<1 && login.length() > 20) {
            throw new WrongLoginExeption("Длина логина не больше 20 символов");
        }
        for (int i = 0; i < login.length(); i++) {
            if (!ABC.contains(String.valueOf(login.charAt(i)))) {
                throw new WrongLoginExeption("Неверный логин");
            }
        }
    }

    @Override
    public void checkPassword(String password) throws WrongPasswordExeption {
        if (password.length()<1 && password.length() > 20) {
            throw new WrongPasswordExeption("Длина пароля не больше 20 символов");
        }
        for (int i = 0; i < password.length(); i++) {
            if (!ABC.contains(String.valueOf(password.charAt(i)))) {
                throw new WrongPasswordExeption("Неверный пароль");
            }
        }
    }

    @Override
    public void checkConfirmPassword(String password, String confirmPassword) throws WrongPasswordExeption {
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordExeption("Пароли не совпадают");
        }
    }
}

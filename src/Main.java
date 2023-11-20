import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите логин: ");
            String login = scanner.nextLine();
            System.out.println("Введите пароль: ");
            String password = scanner.nextLine();
            System.out.println("Введите пароль повторно: ");
            String confirmPassword = scanner.nextLine();

            try {
                Check.check(login, password, confirmPassword);
                System.out.println("Вход выполнен успешно");
            } catch (WrongLoginExeption | WrongPasswordExeption e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
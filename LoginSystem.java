package first;

import java.util.Scanner;
import java.util.Vector;

public class LoginSystem {
    private static Vector<User> users = new Vector<>();

    public static void main(String[] args) {

        users.add(new User("user1", "password1"));
        users.add(new User("user2", "password2"));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the login system!");


        boolean isLoggedIn = false;
        while (!isLoggedIn) {
            System.out.print("Enter username: ");
            String username = scanner.nextLine();
            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            isLoggedIn = login(username, password);

            if (!isLoggedIn) {
                System.out.println("Invalid username or password. Please try again.");
            }
        }

        System.out.println("Login successful! Welcome, " + scanner + "!");

    }
}

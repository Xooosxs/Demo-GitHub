package first;

import java.util.Scanner;
import java.util.Vector;

public class LoginSystem {

    public static int main(String[] args){
        Sysytem.out.println("Test");
    }

    public static boolean login(String username, String password) {

        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user.getPassword().equals(password);
            }
        }
        return false;
    }
    
}

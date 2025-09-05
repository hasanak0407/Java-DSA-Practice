package Day1;

import java.util.Scanner;

public class LoginCredential {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String key1 = "Admin";
        String key2 = "Pass123";
        while (true) {
            System.out.print("Enter your Username: ");
            String username = sc.nextLine();

            if (username.equals(key1)) {
                while (true) {
                    System.out.print("Enter your Password: ");
                    String password = sc.nextLine();
                    if (password.equals(key2)) {
                        System.out.println("Access Granted");
                        break;
                    } else {
                        System.out.println("Password is Wrong");
                    }
                }break;
            }else {
                System.out.println("Username is wrong");
                System.out.println("Enter Username Again");
            }
        }
    }


}

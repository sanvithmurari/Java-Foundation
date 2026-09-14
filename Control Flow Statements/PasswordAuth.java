import java.util.Scanner;
public class PasswordAuth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String password;
        String correctPassword = "Java@123";
        int attempts = 0;
        do {
            System.out.print("Enter Password: ");
            password = in.nextLine();
            attempts++;
            if (password.equals(correctPassword)) {
                System.out.println("Access Granted");
                break;
            } else {
                if (attempts < 3) {
                    System.out.println("Incorrect Password.");
                    System.out.println("Remaining Attempts: " + (3 - attempts));
                }
            }
        } while (attempts < 3);
        if (!password.equals(correctPassword)) {
            System.out.println("Access Denied");
        }
        in.close();
    }
}
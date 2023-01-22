import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();
        int strength = checkPasswordStrength(password);
        if (strength == 1) {
            System.out.println("Your password is weak.");
        } else if (strength == 2) {
            System.out.println("Your password is moderate.");
        } else if (strength == 3) {
            System.out.println("Your password is strong.");
        }
    }
    public static int checkPasswordStrength(String password) {
        int strength = 0;
        if (password.length() < 8) {
            return 1;
        }
        if (password.matches("(?=.*[0-9]).*")) {
            strength++;
        }
        if (password.matches("(?=.*[a-z]).*")) {
            strength++;
        }
        if (password.matches("(?=.*[A-Z]).*")) {
            strength++;
        }
        if (password.matches("(?=.*[@#$%^&+=]).*")) {
            strength++;
        }
        return strength;
    }
}


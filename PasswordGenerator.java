import java.util.Scanner;
import java.util.Random;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the desired length of the password: ");
        int length = scanner.nextInt();
        System.out.print("Include upper case letters in the password? (y/n): ");
        boolean includeUpperCase = scanner.next().equals("y");
        System.out.print("Include lower case letters in the password? (y/n): ");
        boolean includeLowerCase = scanner.next().equals("y");
        System.out.print("Include symbols in the password? (y/n): ");
        boolean includeSymbols = scanner.next().equals("y");
        String password = generatePassword(length, includeUpperCase, includeLowerCase, includeSymbols);
        System.out.println("Your new password is: " + password);
    }

    public static String generatePassword(int length, boolean includeUpperCase, boolean includeLowerCase, boolean includeSymbols) {
        StringBuilder password = new StringBuilder();
        Random random = new Random();
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String symbols = "!@#$%^&*()_+-=[]{}|;':\"<>,.?/\\";

        while (password.length() < length) {
            if (includeUpperCase) {
                int index = random.nextInt(upperCase.length());
                password.append(upperCase.charAt(index));
            }
            if (includeLowerCase) {
                int index = random.nextInt(lowerCase.length());
                password.append(lowerCase.charAt(index));
            }
            if (includeSymbols) {
                int index = random.nextInt(symbols.length());
                password.append(symbols.charAt(index));
            }
        }
 //shuffle the password
 char[] passwordChars = password.toString().toCharArray();
 for (int i = 0; i < passwordChars.length; i++) {
     int randomIndex = random.nextInt(passwordChars.length);
     char temp = passwordChars[i];
     passwordChars[i] = passwordChars[randomIndex];
     passwordChars[randomIndex] = temp;
 }
 return new String(passwordChars);
}
}

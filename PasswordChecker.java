import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();
        int strength = checkPasswordStrength(password);
        if (strength >= 0 && strength <= 21) {
            System.out.println("Your password is weak.");
        } else if (strength > 21 && strength <= 30) {
            System.out.println("Your password is moderate.");
        } else {
            System.out.println("Your password is strong.");
        }
    }


    public static int checkPasswordStrength(String password) {
        int strength = 0;

        for(int i = 0; i < password.length(); i++){
            char c = password.charAt(i);
            if (Character.isDigit(c)) {
                strength += 2;
            } else if (Character.isLowerCase(c)) {
                strength++;
            } else if (Character.isUpperCase(c)) {
                strength += 2;
            } else if (c == '@' || c == '#' || c == '$' || c == '%' || c == '^' || c == '&' || c == '+') {
                strength += 3;
            }
        }
        
        double entropy = 0.0;
        int[] charCounts = new int[Character.MAX_CODE_POINT + 1]; // Unicode characters can have a maximum value of Character.MAX_CODE_POINT
        for (int i = 0; i < password.length(); i++) {
            charCounts[password.codePointAt(i)]++;
        }
        for (int i = 0; i <= Character.MAX_CODE_POINT; i++) {
            if (charCounts[i] > 0) {
                double probability = (double) charCounts[i] / password.length();
                entropy += probability * (Math.log(probability) / Math.log(2));
            }
        }
        entropy = -entropy;
   
        if(entropy >= 3){
        strength += 5;
    }
        return strength;
    }
}


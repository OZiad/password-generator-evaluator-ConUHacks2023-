import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();
        System.out.println(checkPasswordscore(password));
    }


    public static String checkPasswordscore(String password) {
        int score = 0;
        String strength;

        for(int i = 0; i < password.length(); i++){
            char c = password.charAt(i);
            if (Character.isDigit(c)) {
                score += 2;
            } else if (Character.isLowerCase(c)) {
                score++;
            } else if (Character.isUpperCase(c)) {
                score += 2;
            } else if (c == '@' || c == '#' || c == '$' || c == '%' || c == '^' || c == '&' || c == '+') {
                score += 3;
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
        score += 5;
    }
        if (score >= 0 && score <= 21) {
           strength = ("Weak.");
        } else if (score > 21 && score <= 30) {
            strength = ("Moderate.");
        } else {
            strength = ("Strong.");
        }
    
        return strength;
    }
}


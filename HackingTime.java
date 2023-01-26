import java.util.Scanner;
import java.util.Random;

public class HackingTime extends FatherPassword {

    private static final String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
    private static final String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String symbols = "!@#$%^&*_=+-/";
    private static final String numbers = "0123456789";
    private static final Scanner scan = new Scanner(System.in);
    private static final Random rnd = new Random();
   


public static String passwordGenerator(int length, boolean useUpperCase, boolean useLowerCase, boolean useNumbers, boolean useSymbols){
    StringBuilder password = new StringBuilder();

    String allChars = "";
    if (useUpperCase) {
        allChars += upperCaseLetters;
        password.append(upperCaseLetters.charAt(rnd.nextInt(upperCaseLetters.length())));   //Appending an variable to string password.
            length--;
    }
    if (useLowerCase) {
        allChars += lowerCaseLetters;
        password.append(lowerCaseLetters.charAt(rnd.nextInt(lowerCaseLetters.length())));
            length--;
    }
    if (useNumbers) {
        allChars += numbers;
        password.append(numbers.charAt(rnd.nextInt(numbers.length())));
            length--;
    }
    if (useSymbols) {
        allChars += symbols;
        password.append(symbols.charAt(rnd.nextInt(symbols.length())));
        length--;
    }

    for (int i = 0; i < length; i++) {
        int index = rnd.nextInt(allChars.length());
        password.append(allChars.charAt(index));
    }
    return password.toString();
}

public static void main(String[] args) {
    int passwordLength;
    boolean useUpperCase, useLowerCase, useNumbers, useSpecialSymbols;
    System.out.print("Enter the length of the password: ");
    passwordLength = scan.nextInt();
    System.out.print("Use uppercase letters? (true/false): ");
    useUpperCase = scan.nextBoolean();
    System.out.print("Use lowercase letters? (true/false): ");
    useLowerCase = scan.nextBoolean();
    System.out.print("Use numbers? (true/false): ");
    useNumbers = scan.nextBoolean();
    System.out.print("Use special symbols? (true/false): ");
    useSpecialSymbols = scan.nextBoolean();

    String password = passwordGenerator(passwordLength, useUpperCase, useLowerCase, useNumbers, useSpecialSymbols);
    System.out.println("Generated password: " + password);

    

        int score = 0;
        if (passwordLength >= 8) {
            score++;
        }
        if (useUpperCase) {
            score++;
        }
        if (useLowerCase) {
            score++;
        }
        if (useNumbers) {
            score++;
        }
        if (useSpecialSymbols) {
            score++;
        }
        if(FatherPassword.randomness(password) >= 3){
            score++;
        }

       
        

        System.out.println("Password Strength: ");
        if (score == 5) {
            System.out.println("Strong");
        } else if (score >= 3) {
            System.out.println("Moderate");
        } else {
            System.out.println("Weak");
        }
    }
}




  
    



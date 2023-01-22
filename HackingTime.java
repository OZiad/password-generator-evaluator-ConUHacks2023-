import java.util.Scanner;

public class HackingTime {

    private static final String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
    private static final String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String symbols = "[\\<\\(\\[\\{\\\\\\^\\-\\=\\$\\!\\|\\]\\}\\)\\?\\*\\+\\.\\>\\]\\,\\\\$0";
    private static final String numbers = "123456789";
    private static int nbOfCharacters;
    private String password;
    Scanner scan = new Scanner(System.in);



public void passwordCrackEstimator(String password){

    password = scan.next();
    

    for(int i = 0; i < password.length(); i++){
        nbOfCharacters = password.charAt(i);
    }

    System.out.println(nbOfCharacters);

    if(password == null){
        System.out.println("Password must contain at least 1 character.");

      }
       else if(password.contains(nbOfCharacters < 6) == true){
          System.out.println("Password is weak.");
       }
   
       else if(password.contains(nbOfCharacters == 7) && password.contains()){
           password = "Password is weak";
       }
   
      else()
       System.out.println("Password is strong");
      
    }
    
   
}

public static void main(String args[]){

System.out.println(nbOfCharacters);

}
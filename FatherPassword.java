public class FatherPassword {
   
    public static double randomness (String password){
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
        return entropy;
    }


    public static void passwordChecker(String password){
        //if(randomness(password)
    }
public static void main(String[] args) {
    System.out.print(randomness("asd81aj2jabj1j33befjak2j_1n3123^#84"));
    }
}





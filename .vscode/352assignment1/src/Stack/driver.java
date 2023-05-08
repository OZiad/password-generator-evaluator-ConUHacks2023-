package Stack;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class driver {
    public static void main(String args[]) {
        ArithmeticCalculator ac = new ArithmeticCalculator();
        Scanner sc = null;
        try {
            sc = new Scanner(new FileInputStream("Equations"));
        } catch (FileNotFoundException e) {
            System.out.println("NAHH");
            e.printStackTrace();
        }
        String eqn;
        int i = 1;
        while (sc.hasNextLine()) {
            ac = new ArithmeticCalculator();
            eqn = sc.nextLine();
            String result = ac.evalExp(eqn);
            System.out.println(i + ": " + result);
            i++;

        }
    }
}
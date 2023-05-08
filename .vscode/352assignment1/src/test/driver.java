package test;
public class driver {
    public static void main(String args[]) {
        String s = "4+(2-4+3)";
        calculate calc = new calculate();
        System.out.print(calc.calculater(s));
    }
}
package Stack;
public class ArithmeticCalculator {
    private ArrayStack<String> opStk = new ArrayStack<>();
    private ArrayStack<Double> valStk = new ArrayStack<>();
    private boolean isEquality = false;

    private int doOp() {
        double x = valStk.pop();
        double y = valStk.pop();
        String op = opStk.pop();

        switch (op) {
            case "*":
                valStk.push(y * x);
                return 0;
            case "/":
                valStk.push(y / x);
                return 0;
            case "+":
                valStk.push(y + x);
                return 0;
            case "-":
                valStk.push(y - x);
                return 0;
            case "^":
                valStk.push(Math.pow(y, x));
                return 0;
            case ">":
                opStk.push(String.valueOf(y > x));
                return -1;
            case "<":
                opStk.push(String.valueOf(y < x));
                return -1;
            case "<=":
                opStk.push(String.valueOf(y <= x));
                return -1;
            case ">=":
                opStk.push(String.valueOf(y >= x));
                return -1;
            case "==":
                opStk.push(String.valueOf(y == x));
                return -1;
            case "!=":
                opStk.push(String.valueOf(y != x));
                return -1;
            default:
                return 0;
        }
    }

    private int precedenceLevel(String op) {
        switch (op) {
            case "$":
                return -1;
            case "<":
            case "<=":
            case ">":
            case ">=":
            case "==":
            case "!=":
                return 0;
            case "+":
            case "-":
                return 1;
            case "*":
            case "/":
                return 2;
            case "^":
                return 3;
            default:
                throw new IllegalArgumentException("Operator unknown: " + op);
        }
    }

    // While loop that only executes when lower precedence operator is found and
    // executes the top most operator in operator stack
    private void repeatOps(String op) {
        while (valStk.size() > 1 && precedenceLevel(op) <= precedenceLevel(opStk.top())) {
            isEquality = (doOp() == -1);
        }
    }

    public String evalExp(String s) {
        String[] splitStr = s.split("\\s+");
        for (int i = 0; i < splitStr.length; i++) {
            String z = splitStr[i];

            // Try and catch block to check if String is a number
            try {
                valStk.push(Double.parseDouble(z));
            } catch (NumberFormatException e) {
                repeatOps(z);
                opStk.push(z);
            }
        }
        repeatOps("$");

        // Once and Equality is found the boolean value is returned
        if (isEquality)
            return opStk.pop();
        return String.valueOf(valStk.top());
    }


}
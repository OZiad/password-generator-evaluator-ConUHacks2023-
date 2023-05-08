package test;
import java.util.Stack;

public class calculate{
public int calculater(String s) {
    int sum = 0;
    int sign = 1;
    Stack<Integer> stack = new Stack<>();
    for(int i = 0;i<s.length();i++){
        char ch = s.charAt(i);
        if(Character.isDigit(ch)){
            int val = 0;
            while(i < s.length() && Character.isDigit(s.charAt(i))){
                val = val * 10 + (s.charAt(i) - '0');
                i++;
            }
            sum += (val * sign);
            sign = 1;
            i--;
        }else if(ch == ')'){
            int poppedSign = stack.pop();
            int preSum = stack.pop();
            sum  = (sum * poppedSign) + preSum;
        }else if(ch == '('){
            stack.push(sum);
            stack.push(sign);
            sum = 0;
            sign = 1;
        }else if(ch == '-'){
            sign *= -1;
        }
        
    }
    
    return sum;
}
}
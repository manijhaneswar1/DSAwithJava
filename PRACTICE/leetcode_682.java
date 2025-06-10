import java.util.Objects;
import java.util.Stack;

public class leetcode_682 {
    public static void main(String[] args) {
        String[] ops = {"5","-2","4","C","D","9","+","+"};
        System.out.println(calPoints(ops));
    }
    public static int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < operations.length; i++){
            if(Objects.equals(operations[i], "D")){
                int item = stack.peek() * 2;
                stack.push(item);
            }else if(Objects.equals(operations[i], "C")){
                stack.pop();
            }else if(Objects.equals(operations[i], "+")){
                int top = stack.pop();
                int newTop = top + stack.peek();
                stack.push(top);
                stack.push(newTop);
            }else{
                stack.push( Integer.valueOf(operations[i] ));
            }
        }
        int sum = 0;
        for( int i = 0; i < stack.size(); i++){
            sum += stack.elementAt(i);
        }
        return sum;
    }
}

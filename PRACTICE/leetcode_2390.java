import java.util.Stack;

public class leetcode_2390 {
    public static void main(String[] args) {
        String s = "leet**cod*e";
        System.out.println(removeStars(s));
    }
    public static String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for( int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if( ch == '*'){
                stack.pop();
            }else{
                stack.push(ch);
            }
        }
        StringBuilder str = new StringBuilder();
        while(!stack.isEmpty()){
            str.append(stack.peek());
            stack.pop();
        }
        return rev(str.toString());
    }
    public static String rev(String s){
        StringBuilder str = new StringBuilder();
        for( int i = s.length() - 1; i >= 0; i--){
            str.append(s.charAt(i));
        }
        return str.toString();
    }
}

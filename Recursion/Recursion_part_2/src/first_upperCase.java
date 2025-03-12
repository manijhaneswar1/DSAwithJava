public class first_upperCase {
    public static void main(String[] args) {
        String str = "microP";
        System.out.println(first(str, 0, ' '));
    }
    static char first(String str, int i, char ch){
        if(ch != ' '){
            return ch;
        }
        if(Character.isUpperCase(str.charAt(i))){
            ch = str.charAt(i);
        }
        return first(str,i + 1, ch);
    }
}

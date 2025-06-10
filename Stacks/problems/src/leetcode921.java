public class leetcode921 {
    public static void main(String[] args) {
        String s = "()))((";
        System.out.println(minAddToMakeValid(s));
    }
    public static int minAddToMakeValid(String s) {
        int equal = 0 ;
        int add = 0 ;

        for( char ch : s.toCharArray()){
            if( ch == '('){
                equal++;
            }else if( equal > 0 && ch == ')'){
                equal--;
            }else{
                add++;
            }
        }
        return add + equal;
    }
}

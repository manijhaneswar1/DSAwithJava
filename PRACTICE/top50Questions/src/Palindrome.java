public class Palindrome {
    public static void main(String[] args) {
        String s = "madam";
        System.out.println(isPalindrome(s));
        System.out.println(isPanRev("malayalam"));
    }
    // Using Two Pointers
    public static boolean isPalindrome(String s){
        int i = 0;
        int j = s.length() - 1;
        while( i < j){
            if( s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    // using reverse of String
    public static boolean isPanRev(String s){
        StringBuilder str = new StringBuilder();

        for (int i = s.length() - 1; i > -1 ; i--) {
            str.append(s.charAt(i));
        }
        return s.contentEquals(str);
    }
}

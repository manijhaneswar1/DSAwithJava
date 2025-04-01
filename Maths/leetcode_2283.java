public class leetcode_2283 {
    public static void main(String[] args) {
        System.out.println(ans("030"));
    }
    static boolean ans(String num){
        for(int i = 0; i < num.length(); i++){
            if ( count(i, num) != Character.getNumericValue((num.charAt(i)))){
                return false;
            }
        }
        return true;
    }
    static int count(int i, String num){
        int c = 0;
        for(int a = 0; a < num.length(); a++){
            int ch = Character.getNumericValue(num.charAt(a));

            if(ch == i){
                c++;
            }
        }
        return c;
    }
}

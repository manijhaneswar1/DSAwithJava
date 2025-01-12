public class Palindrome {
    public static void main(String[] args) {
        String str= "malayalam";
        System.out.println(isPlaindrome(str));
    }
    static boolean isPlaindrome(String str){
        if(str==null || str.isEmpty()){
            return true;
        }
        char[] ch=str.toCharArray();
        int i=0;
        int j=ch.length-1;
        while(i < j){
            if(ch[i] == ch[j]){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    }
}

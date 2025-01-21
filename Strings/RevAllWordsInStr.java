public class RevAllWordsInStr {
    public static void main(String[] args) {
        String s="a good   example";
        System.out.println(reverseWords(s));
    }
    static String reverseWords(String s) {
        String str=s.trim();
        StringBuilder ans=new StringBuilder();
        int j=str.length();
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)==' '){
                if(str.charAt(i+1) != ' ') {
                    ans.append(str, i+1, j).append(" ");
                }
                j=i;
            }
            if(i ==0 ){
                ans.append(str, i, j);
            }
        }
        return ans.toString().trim();
    }
}

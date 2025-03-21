public class fancyStr {
    public static void main(String[] args) {
        System.out.println(makeFancyString("llleeetcode"));
    }
       static String makeFancyString(String s) {
            StringBuilder ans = new StringBuilder();

            for(int i = 0; i < s.length(); i++){
                char ch = s.charAt(i);
                ans.append(ch);
                if(i + 2 < s.length() && ch == s.charAt(i + 1) && ch == s.charAt(i + 2)){
                    ans.deleteCharAt(ans.length()- 1);
                }
            }
            return ans.toString();
        }
}

public class StringParseIntegration {
    public static void main(String[] args) {
        String s="G()(al)";
        System.out.println(parseOf(s));
    }
    /*
        You own a Goal Parser that can interpret a string command.
        The command consists of an alphabet of "G", "()" and/or "(al)" in some order.
        The Goal Parser will interpret "G" as the string "G", "()" as the string "o", and "(al)" as the string "al".
        The interpreted strings are then concatenated in the original order.
        Given the string command, return the Goal Parser's interpretation of command.
     */
    static String parseOf(String s){
        StringBuilder ans=new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'G'){
                ans.append("G");
            }else if(s.charAt(i) == '(' && s.charAt(i+1) == ')'){
                ans.append("o");
                i++;
            }else{
                ans.append("al");
                i += 3;
            }
        }
        //return String.valueOf(ans);
        return new String(ans);
    }
}

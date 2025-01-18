public class lenOfLastWord {
    public static void main(String[] args) {
        String str="   fly me ";
        System.out.println(len(str));
    }
    static int len(String str){
        String s="";
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i) != ' '){
                s += str.charAt(i);
            }
            if(str.charAt(i) == ' ' && s.length()>0){
                break;
            }
        }
        return s.length();
    }
}

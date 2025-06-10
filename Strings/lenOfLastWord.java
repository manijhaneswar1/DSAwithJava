public class lenOfLastWord {
    public static void main(String[] args) {
        String str="hello 1.6180339";
        System.out.println(len(str));
    }
    static int len(String str){
        int len = 0;
        for(int i = str.length() - 1; i >= 0; i--){
            if(str.charAt(i) != ' '){
                len++;
            }
            if(len > 0 && str.charAt(i) == ' '){
                break;
            }
        }
        return len;
    }
}

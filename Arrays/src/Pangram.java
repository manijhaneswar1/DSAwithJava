
public class Pangram {
    public static void main(String[] args) {
        String str="thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(str));
    }
    static boolean checkIfPangram(String sentence) {
        boolean[] arr=new boolean[26];
        int index=0;
        sentence=sentence.toLowerCase();
        for(int i=0;i<sentence.length();i++){
            char ch=sentence.charAt(i);
            if(ch >='a' && ch <='z'){
                index= ch - 'a';
            }
            arr[index++]=true;
        }
        for (boolean b : arr) {
            if (!b) {
                return false;
            }
        }
        return true;
    }
}
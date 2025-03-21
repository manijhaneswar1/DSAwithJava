public class subset_subsequence {
    public static void main(String[] args) {
        subsets("aba", "");
    }
    static void subsets(String s, String ans){
        if(s.isEmpty()){
            System.out.print(ans + " ");
            return;
        }
        char ch = s.charAt(0);
        subsets(s.substring(1), ans + ch );
        subsets(s.substring(1),ans);
    }
}

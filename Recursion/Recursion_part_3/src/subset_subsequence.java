import java.util.ArrayList;
import java.util.Arrays;

public class subset_subsequence {
    public static void main(String[] args) {
        subsets("aba", "");
        System.out.println();
        System.out.println(subsets2("aba",""));
    }
    // printing Directly
    static void subsets(String s, String ans){
        if(s.isEmpty()){
            System.out.print(ans + " ");
            return;
        }
        char ch = s.charAt(0);
        subsets(s.substring(1), ans + ch );
        subsets(s.substring(1),ans);
    }
    // adding into an ArrayList
    static ArrayList<String> subsets2(String s, String ans){
        if(s.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        char ch = s.charAt(0);
        ArrayList<String> left = subsets2(s.substring(1), ans + ch);
        ArrayList<String> right = subsets2(s.substring(1), ans);

        left.addAll(right);
        return left;
    }
}

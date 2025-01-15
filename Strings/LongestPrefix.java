import java.util.Arrays;

public class LongestPrefix {
    public static void main(String[] args) {
        String[] strArr={"flower","mani","flight"};
        System.out.println(longestCommonPrefix2(strArr));
    }

    static String longestCommonPrefix(String[] strs) {
        // edge cases
        if (strs.length==0 && strs.length==1) return "";
        // main case
        String preFix=strs[0];
        for(int i=1;i<strs.length;i++){
            while (strs[i].indexOf(preFix) != 0) {
                preFix = preFix.substring(0, preFix.length() - 1);
            }
        }
        return preFix;
    }

    // another method to solve problem
    static String longestCommonPrefix2(String[] strs) {
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        int index = 0;
        while(index < s1.length() && index<s2.length()){
            if(s1.charAt(index)==s2.charAt(index)){
                index++;
            }
            else{
                break;
            }
        }
        return s1.substring(0,index);
    }
}

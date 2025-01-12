import java.util.Arrays;

public class TwoStringsEquivalent {
    public static void main(String[] args) {
        String[] word1={"ab", "c"};
        String[] word2={"a", "bc"};
        System.out.println(arrayStringsAreEqual(word1,word2));
        System.out.println(secApproach(word1,word2));
    }
    static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder str1=new StringBuilder();
        StringBuilder str2=new StringBuilder();
        for(String word : word1){
            String lo=word.toLowerCase();
            str1.append(lo);
        }
        for(String ele : word2){
            String low=ele.toLowerCase();
            str2.append(low);
        }
        if(str1.toString().equals(str2.toString())){
            return true;
        }
        return false;
    }
    // Second Approach
    static boolean secApproach(String[] word1, String[] word2){
        String str1="";
        String str2="";
        for(String word : word1){
            str1 += word;
        }
        for(String word : word2){
            str2 += word;
        }
        if(str1.equals(str2)){
            return true;
        }
        return false;
    }
}

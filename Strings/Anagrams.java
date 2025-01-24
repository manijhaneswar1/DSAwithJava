import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagrams {
    public static void main(String[] args) {
        String[] strs={"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }
    static List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> ans = new ArrayList<>();

        for(int i=0;i<strs.length;i++){
            boolean flag=false;
            for(List<String> grp : ans){
                if(grp.contains(strs[i])){
                    flag=true;
                    break;
                }
            }

            if(flag) continue;

            ArrayList<String> tempArr=new ArrayList<>();
            tempArr.add(strs[i]);
            for(int j=0;j<strs.length;j++){
                if(i != j && Anagram(strs[i],strs[j])){
                    tempArr.add(strs[j]);
                }
            }
            ans.add(tempArr);
        }
        return ans;
    }
    static boolean Anagram(String str1,String str2){
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }
}

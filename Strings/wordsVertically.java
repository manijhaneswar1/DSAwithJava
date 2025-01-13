import java.util.ArrayList;
import java.util.List;

public class wordsVertically {
    public static void main(String[] args) {
        String str3="HOW ARE YOU";
        String str2="CONTEST IS COMING";
        String str="TO BE OR NOT TO BE";
        System.out.println(printVertically(str));
        System.out.println(printVertically(str2));
        System.out.println(printVertically(str3));
    }
    static List<String> printVertically(String s) {
        String[] strArr = s.split(" ");
        List<String> ans=new ArrayList<>();
        int maxLen=0;
        for(int i=0;i<strArr.length;i++){
            if(strArr[i].length()>maxLen){
                maxLen=strArr[i].length();
            }
        }
        for(int i=0;i<maxLen;i++){
            String word= "";
            for (String str : strArr) {
                if(i < str.length()){
                    word += str.charAt(i);
                }else{
                    word += ' ';
                }
            }
            // trim last ' ' empty part of word
            while(word.length()>0 && word.charAt(word.length()-1) == ' '){
                word = word.substring(0,word.length()-1);
            }
            // add to to our Arraylist is word is empty
            if(!word.isEmpty()){
                ans.add(word);
            }
        }
        return ans;
    }
}

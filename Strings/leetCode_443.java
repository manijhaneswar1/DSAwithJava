import java.util.ArrayList;
import java.util.Objects;

public class leetCode_443 {
    public static void main(String[] args) {
        String[] chars ={"a","b","b","b","c","d","f"};
        System.out.println(compress(chars));
    }
    static int compress(String[] chars) {
        if(chars.length == 1) return 1;
        if(chars.length == 0) return 0;

        ArrayList<String> charArr = new ArrayList<>();
        String letter = chars[0];
        int count = 1;

        for(int i=0;i<chars.length;i++){
            count++;
            if(i + 1 == chars.length || !Objects.equals(chars[i+1], letter)){
                charArr.add(letter);
                if(count > 1){
                    for(char digit : String.valueOf(count).toCharArray()){
                        charArr.add(String.valueOf(digit));
                    }
                }
            }
            if(i+1 < chars.length) letter = chars[i+1];
            count = 0;
        }
        return charArr.size();
    }
}

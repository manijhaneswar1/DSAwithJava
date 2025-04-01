import java.util.ArrayList;
import java.util.List;

public class leetcode_17 {
    public static void main(String[] args) {
        System.out.println(phoneNumber("","7"));;
    }
    static List<String> phoneNumber(String p, String up) {
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';
        ArrayList<String> ans = new ArrayList<>();
        for(int i = (digit - 1) * 3; i < digit * 3 ; i++){
            char ch = (char) ( 'a' + i - ((digit == 7 || digit == 9 ) ? 4 : 3) );
            ans.addAll(phoneNumber(p + ch, up.substring(1)));
        }
        return ans;
    }
}

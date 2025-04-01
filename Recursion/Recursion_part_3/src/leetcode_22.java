import java.util.ArrayList;
import java.util.List;

public class leetcode_22 {
    public static void main(String[] args) {
        List<String> result = new ArrayList<>();
        generate(result, "", 0, 0, 2);
        System.out.println(result);
    }
    static void generate(List<String> result, String current, int open, int close, int max) {

        if (current.length() == max * 2) {
            result.add(current);
            return;
        }

        if (open < max) {
            generate(result, current + "(", open + 1, close, max);
        }

        if (close < open) {
            generate(result, current + ")", open, close + 1, max);
        }
    }
}

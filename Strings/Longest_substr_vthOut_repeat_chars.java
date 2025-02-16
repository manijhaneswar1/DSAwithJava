import java.util.HashSet;
import java.util.Set;

public class Longest_substr_vthOut_repeat_chars {
    public static void main(String[] args) {
        String s = "tmmzuxt";
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int len = 0; // Initialize to 0
        int start = 0;
        int end = 0;
        Set<Character> charSet = new HashSet<>();

        while (start < n && end < n) {
            if (!charSet.contains(s.charAt(end))) {
                charSet.add(s.charAt(end));
                end++;
                len = Math.max(len, end - start);
            } else {
                charSet.remove(s.charAt(start));
                start++;
            }
        }
        return len;
    }
}

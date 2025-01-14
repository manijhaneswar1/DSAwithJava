import java.util.*;

public class CamelCaseMatch {
    public static void main(String[] args) {
        String[] queries = {"FooBar", "FooBarTest", "FootBall", "FrameBuffer", "ForceFeedBack"};
        String pattern = "FB";
        System.out.println(camelMatch(queries, pattern));
    }

    public static List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> ans = new ArrayList<>();

        for (String query : queries) {
            ans.add(matchesPattern(query, pattern));
        }
        return ans;
    }
    private static boolean matchesPattern(String query, String pattern) {
        int i = 0;
        for (char ch : query.toCharArray()) {
            if (i < pattern.length() && ch == pattern.charAt(i)) {
                i++;
            } else if (Character.isUpperCase(ch)) {
                return false;
            }
        }
        return i == pattern.length();
    }
}

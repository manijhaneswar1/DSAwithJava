import java.util.ArrayList;
import java.util.List;

public class CamelCaseMatch {
    public static void main(String[] args) {
        String[] arr={"FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"};
        String pat="FB";
        System.out.println(camelMatch(arr,pat));
    }
    static List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> ans = new ArrayList<>();
            for (String query : queries) {
            ans.add(isMatch(query, pattern));
        }
        return ans;
    }

    static boolean isMatch(String query, String pattern) {
        int queryLength = query.length();
        int patternLength = pattern.length();
        int i = 0, j = 0;

        while (j < patternLength) {
            while (i < queryLength && query.charAt(i) != pattern.charAt(j) && Character.isLowerCase(query.charAt(i))) {
                i++;
            }
            if (i == queryLength || query.charAt(i) != pattern.charAt(j)) {
                return false;
            }
            i++;
            j++;
        }

        while (i < queryLength && Character.isLowerCase(query.charAt(i))) {
            i++;
        }

        return i == queryLength;
    }
}

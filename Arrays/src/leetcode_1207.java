import java.util.HashMap;
import java.util.HashSet;

public class leetcode_1207 {
    public static void main(String[] args) {
     int[] arr = {1,2,2,1,1,3,2};
        System.out.println(uniqueOccurrences(arr));
    }
    static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> hash = new HashMap<>();

        for (int num : arr) {
            hash.put(num, hash.getOrDefault(num, 0) + 1);
        }

        HashSet<Integer> uniqueCounts = new HashSet<>();

        for (int count : hash.values()) {
            if (!uniqueCounts.add(count)) {
                return false;
            }
        }
        return true;
    }
}

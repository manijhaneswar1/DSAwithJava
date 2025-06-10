import java.util.Arrays;
import java.util.HashMap;

public class Anagrams {
    public static void main(String[] args) {
        String s1 = "mani";
        String s2 = "main";
        System.out.println(isAnagram(s1, s2));
        System.out.println(isAna(s1, s2));
    }
    // using hashmap
    public static boolean isAnagram(String s1, String s2){
        if( s1.length() != s2.length() ) return false;

        HashMap<Character, Integer> h1 = new HashMap<>();
        HashMap<Character, Integer> h2 = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);

            h1.put(ch1, h1.getOrDefault(ch1, 0) + 1);
            h2.put(ch2, h2.getOrDefault(ch2, 0) + 1);
        }
        // now i have to compare string and hashmap
        return h1.equals(h2);
    }
    // using sorting and Arrays
    public static boolean isAna(String s1, String s2){
        if( s1.length() != s2.length() ) return false;

        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        return Arrays.equals(a1, a2);
    }
}

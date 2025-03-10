public class leetcode_6 {
    public static void main(String[] args) {
        System.out.println(convert("MANIJHANESWAR",3));
    }
    public static String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) return s;

        StringBuilder ans = new StringBuilder();
        int cycleLen = 2 * numRows - 2;

        for (int i = 0; i < numRows; i++) {
            int j = i;
            while (j < s.length()) {
                ans.append(s.charAt(j));
                int diagonal = j + cycleLen - 2 * i;
                if (i != 0 && i != numRows - 1 && diagonal < s.length()) {
                    ans.append(s.charAt(diagonal));
                }
                j += cycleLen;
            }
        }
        return ans.toString();
    }
}

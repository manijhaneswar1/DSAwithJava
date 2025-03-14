public class leetcode_1945 {
    public static void main(String[] args) {
        System.out.println(getLucky("leetcode", 2));
    }
    static int getLucky(String s, int k) {
        StringBuilder str = new StringBuilder();

        for(char ch : s.toCharArray()){
            str.append(ch - 'a' + 1);
        }
        int num = 0;
        for(char ch : str.toString().toCharArray()){
            num += ch - '0';
        }
        int ans = 0;
        int i = 1;
        while(i < k){
            while(num != 0){
                int rem = num % 10;
                ans += rem;
                num /= 10;
            }
            i++;
            num = ans;
        }
        return ans;
    }
}

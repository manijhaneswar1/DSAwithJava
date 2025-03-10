public class leetcode_1404 {
    public static void main(String[] args) {
        System.out.println(numSteps("1101"));
    }
    static int numSteps(String s) {
        int num = decimal(s);
        return recursion(num , 0);
    }
    static int recursion(int num , int count){
        if(num == 1){
            return count;
        }
        if(num % 2 == 0){
            num /= 2;
            count++;
        }else if(num % 2 != 0){
            num += 1;
            count++;
        }
        return recursion(num , count);
    }
    static int decimal(String s){
        StringBuilder str = new StringBuilder();
        str.append(s);
        str.reverse();

        int ans = 0;
        int inc = 0;
        for(int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);
            int digit = (int) Math.pow(2, inc) * Integer.parseInt(String.valueOf(ch));
            ans += digit;
            inc++;
        }
        return ans;
    }
}

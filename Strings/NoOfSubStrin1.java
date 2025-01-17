public class NoOfSubStrin1 {
    public static void main(String[] args) {
        String s="0110111";
        System.out.println(numSub(s));
    }
    static int numSub(String s) {
        long ans=0;
        int n=0;
        // logic
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                n++;
            }else{
                ans +=((long) (n + 1) * n )/2;
                n=0;
            }
        }
        ans += ((long) n * (n+1))/2;
        return (int) (ans % 1000000007);
    }
}

public class minLenAfterDel {
    public static void main(String[] args) {
        String s="cabacbac";
        System.out.println(minimumLength(s));
    }
    static int minimumLength(String s) {
        int j=s.length()-1;
        int i=0;
        int ans=s.length();
        while(i != j){
            if(s.charAt(i) != s.charAt(j)){
                return ans;
            }
            if(s.charAt(i) == s.charAt(j) && (s.charAt(i+1) != s.charAt(i) && s.charAt(j) != s.charAt(j-1))){
                i++;
                j--;
                ans -=2;
            }
            if(s.charAt(i+1) == s.charAt(i) && s.charAt(i)==s.charAt(j) && ans !=2){
                i++;
                ans--;
            }
            if(s.charAt(j)==s.charAt(j-1) && s.charAt(j)==s.charAt(i) && ans != 2){
                j--;
                ans--;
            }
            if(ans == 2 && s.charAt(i) != s.charAt(j)){
                return 2;
            }else if(ans == 2){
                return 0;
            }
        }
        return ans;
    }
}

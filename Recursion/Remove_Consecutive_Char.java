public class Remove_Consecutive_Char {
    public static void main(String[] args) {
        String s="aabb";
        int n=0;
        System.out.println(recursive(s,n));
        System.out.println(iterationSol(s));
    }
    // RECURSION SOLUTION
    static String recursive(String s,int n){
        // base condition
        if(n >= s.length()-1) return s;

        // change condition to how to remove char
        if(s.charAt(n) == s.charAt(n+1)){
            s = charRemoveAt(s,n+1);
            return recursive(s, n);
        }else{
            return recursive(s,n+1);
        }
    }

    static String charRemoveAt(String str, int p) {
        return str.substring(0, p) + str.substring(p + 1);
    }

    // ITERATION SOLUTION
    static String iterationSol(String str){
        StringBuilder ans= new StringBuilder();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            if(i+1 < n && str.charAt(i) != str.charAt(i+1)){
                ans.append(str.charAt(i));
            }
            if(i == n-1){
                ans.append(str.charAt(n-1));
            }
        }
        return ans.toString();
    }
}

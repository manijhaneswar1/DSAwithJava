public class HomogenousCountStr {
    public static void main(String[] args) {
        String str="abbcccaa";
        System.out.println(countSubStr(str));
    }
    static int countSubStr(String s){
        long totalCount=0;
        int tempCount=1;
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i) == s.charAt(i-1)){
                tempCount++;
            }else {
                tempCount=1;
            }
            totalCount += tempCount;
        }
        return (int) (totalCount + 1  % (1000000007)) ;
    }
}

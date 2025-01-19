public class withinBudget {
    public static void main(String[] args) {
        String s="abcd";
        String t="bcdf";
        int maxCost=3;
        System.out.println(strWithinBudget(s,t,maxCost));
    }
    static int strWithinBudget(String s,String t,int maxCost){
        int n=s.length();
        int ans=0;
        int j=0;
        int tempCost=0;
        for (int i = 0; i < s.length(); i++) {
            tempCost += Math.abs(s.charAt(i)-t.charAt(i));

            while(tempCost > maxCost){
                tempCost -= Math.abs(s.charAt(j)-t.charAt(j));
                j++;
            }

            ans=Math.max(ans,i-j +1);
        }
        return ans;
    }
}

public class AlphaToInt {
    public static void main(String[] args) {
        String str="1326#";//1326# 10#11#12
        System.out.println(freqAlphabets(str));
    }
    static String freqAlphabets(String s) {
        String allAlp="abcdefghijklmnopqrstuvwxyz";
        String ans="";
        for(int i=0;i<s.length();i++){
            if(i+2<s.length() && s.charAt(i+2)=='#'){
                String subStr = s.substring(i,i+2);
                ans += allAlp.charAt(Integer.parseInt(subStr)-1);
                i = i+2;
            }else {
                ans += allAlp.charAt(Character.getNumericValue(s.charAt(i))-1);
            }
        }
        return ans;
    }
}

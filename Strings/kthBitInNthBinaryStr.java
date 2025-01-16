public class kthBitInNthBinaryStr {
    public static void main(String[] args) {
        int n=20;
        int k=32944;
        System.out.println(findKthBit(n,k));
    }
    static char findKthBit(int n, int k) {
        StringBuilder ans=new StringBuilder("0");

        for(int i=2;i<=n;i++){
            String temp=ans.toString();
            String finalStr=temp + "1" + reverse(invert(temp));
            ans.append(finalStr);
        }

        return ans.charAt(k);
    }
    static String reverse(String str){
        return new StringBuilder(str).reverse().toString();
    }
    static String invert(String str){
        StringBuilder revStr=new StringBuilder();
        for(int i=0;i<str.length();i++){
            revStr.append(str.charAt(i)=='0'?'1':'0');
        }
        return revStr.toString();
    }
}

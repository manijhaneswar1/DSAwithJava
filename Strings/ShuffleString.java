public class ShuffleString {
    public static void main(String[] args) {
        int[] inidices={4,5,6,0,1,2,3};
        String s="tajRuhi";
        System.out.println(restoreString(s,inidices));
    }
    static String restoreString(String s, int[] indices) {
        char[] ans=new char[s.length()];
        for(int i=0;i<indices.length;i++){
            ans[indices[i]]=s.charAt(i);
        }
        return String.valueOf(ans);
        // or return new String(ans);
    }
}

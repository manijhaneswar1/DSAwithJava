public class ShiftLetters {
    public static void main(String[] args) {
        String str="abc";
        int[] arr={3,5,9};
        System.out.println(shiftingLetters(str,arr));
    }
    static String shiftingLetters(String s, int[] shifts) {
       /* StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char temp=s.charAt(i);
            char c='\u0000';
            for(int j=i;j<shifts.length;j++){
                c = shift(temp,shifts[j]);
                temp=c;
            }
            ans.append(c);
        }
        return ans.toString(); */
        /*StringBuilder ans=new StringBuilder();
        int totalSum=0;
        for(int i=0;i<shifts.length;i++){
            totalSum+=shifts[i];
        }

        for (int j = 0; j < s.length(); j++) {
            ans.append(shift(s.charAt(j),totalSum));
            totalSum -= shifts[j];
        }
        return ans.toString();
         */
        StringBuilder ans = new StringBuilder();
        int X = 0;
        for (int shift: shifts)
            X = (X + shift) % 26;

        for (int i = 0; i < s.length(); ++i) {
            int index = s.charAt(i) - 'a';
            ans.append((char) ((index + X) % 26 + 97));
            X = Math.floorMod(X - shifts[i], 26);
        }

        return ans.toString();
    }
    static char shift(char ch,int num){
        return (char) ((ch - 'a' + num) % 26 + 'a');
    }
}

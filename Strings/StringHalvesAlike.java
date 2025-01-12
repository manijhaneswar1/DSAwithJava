public class StringHalvesAlike {
    public static void main(String[] args) {
        String str="NmUOuOodeuUeEEoOOeiOxiOMoEeoItaoaUuoeEquoOouJa";
        System.out.println(secApproach(str));
    }
  /*
    static boolean halvesAreAlike(String s) {
        String s1=s.substring(0,s.length()/2);
        String s2=s.substring(s.length()/2);
        String vowels="aeiouAEIOU";
        int count1=0;
        for(int i=0;i<s1.length();i++){
            for(int j=0;j<vowels.length();j++){
                if(s1.charAt(i)==vowels.charAt(j)){
                    count1++;
                }
            }
        }
        int count2=0;
        for(int i=0;i<s2.length();i++){
            for(int j=0;j<vowels.length();j++){
                if(s2.charAt(i)==vowels.charAt(j)){
                    count2++;
                }
            }
        }
        return count1==count2;
    } */
    static boolean secApproach(String s){
        int mid=s.length()/2;
        String vowels="aeiouAEIOU";
        int c1 =0, c2 =0;
        for (int i = 0; i < mid; i++) {
            if(vowels.indexOf(s.charAt(i))!=-1){
                c1++;
            }
            if(vowels.indexOf(s.charAt(mid+i)) != -1){
                c2++;
            }
        }
        return c1==c2;
    }
}

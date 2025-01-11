public class shuffleSentence {
    public static void main(String[] args) {
        String s="is2 sentence4 This1 a3";
        
        String[] words=s.split(" ");
        String[] ans=new String[words.length];

        for(String word : words){
            int i=Character.getNumericValue(word.charAt(word.length()-1)-1);
            ans[i]=word.substring(0, word.length()-1);
        }
        System.out.println(String.join(" ",ans));

    }
}

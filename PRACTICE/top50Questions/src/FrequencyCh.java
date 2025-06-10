public class FrequencyCh {
    public static void main(String[] args) {
        String s = "Hello";
        boolean visited = false;
        for (int i = 0; i < s.length(); i++) {
            if( !visited ){
                System.out.println(s.charAt(i) + " appears " + howMany(s, s.charAt(i)) + " times ");
            }
        }
    }
    public static int howMany(String s, char ch){
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if( s.charAt(i) == ch){
                c++;
            }
        }
        return c;
    }
}

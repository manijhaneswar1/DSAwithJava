public class Reverse_String {
    public static void main(String[] args) {
        char[] s={'h','e','l','l','o'};
        reverseString(s);
        System.out.println(s);
    }
    static void reverseString(char[] s) {
        int st=0;
        int e=s.length-1;
        RS(s,st,e);
    }
    static char[] RS(char[] str,int st,int e){

        // base condition
        if(st >= e){
            return str;
        }

        //body
        char temp=str[st];
        str[st]=str[e];
        str[e]=temp;

        return RS(str,st+1,e-1);
    }
}

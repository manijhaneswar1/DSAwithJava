import java.util.Arrays;

public class AssignCookies {
    public static void main(String[] args) {
        int[] g={10,9,8,7};
        int[] s={5,6,7,8};
        System.out.println(assignCookies(g,s));
    }
    static int assignCookies(int[] g,int[] s){
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0;
        int j=0;
        while(i < g.length && j < s.length){
            if(s[j]>=g[i]){
                i++;
            }
            j++;
        }
        return i;
    }
}

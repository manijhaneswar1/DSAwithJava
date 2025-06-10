import java.util.Arrays;
import java.util.Scanner;

public class TwoStackGames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int x = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[m];
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }
            for (int j = 0; j < m; j++) {
                b[j] = sc.nextInt();
            }
            System.out.println(twoStack(x, a, b));
        }
    }
    public static int twoStack(int x, int[] s1, int[] s2 ){
        return TwoStackRec(x, s1, s2, 0, 0 ) -1;
    }
    public static int TwoStackRec(int x, int[] s1, int[] s2, int sum, int count){
        if(sum > x){
            return count;
        }

        if( s1.length == 0 || s2.length == 0){
            return count;
        }

        int ans1 = TwoStackRec(x, Arrays.copyOfRange(s1, 1, s1.length), s2, sum + s1[0], count+1);
        int ans2 = TwoStackRec(x, s1, Arrays.copyOfRange(s2, 1, s2.length), sum + s2[0], count+1);

        return Math.max(ans1, ans2);
    }
}

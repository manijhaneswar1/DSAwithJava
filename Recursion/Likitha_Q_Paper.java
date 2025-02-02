import java.util.ArrayList;
import java.util.Collections;

public class Likitha_Q_Paper {
    public static void main(String[] args) {
        int n = 100;
        int x = 10000;
        System.out.println(mul(n,x));

        int[] arr={16,17,4,3,5,2};
        System.out.println(leader2(arr));
    }
    static int mul(int n ,int x){
        int ans = 0;
        for (int i = 0; i < x; i++) {
            ans += n;
        }
        return ans;
    }
    static ArrayList<Integer> leader(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        int maxFromRight = arr[arr.length - 1];
        ans.add(maxFromRight);
        for (int i = arr.length-2; i >=0 ; i--) {
            if(arr[i] > maxFromRight){
                maxFromRight = arr[i];
                ans.add(maxFromRight);
            }
        }
        Collections.reverse(ans);
    return ans;
    }
    static ArrayList<Integer> leader2(int[] arr){
        int n= arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        int i=0;
        while( i < arr.length){
            for (int j = i+1; j < arr.length; j++) {
               if(arr[i] < arr[j]){
                   break;
               }
               if( j == n-1){
                   ans.add(arr[i]);
               }
            }
            i++;
        }
        ans.add(arr[n-1]);
        return ans;
    }
}

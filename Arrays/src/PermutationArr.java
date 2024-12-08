import java.util.Arrays;
import java.util.Scanner;

public class PermutationArr {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of Array : ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(buildArray(arr)));
    }
    static int[] buildArray(int[] num) {
        int[] ans=new int[num.length];
        for(int i=0;i<num.length;i++){
            ans[i]=num[num[i]];
        }
        return ans;
    }
}

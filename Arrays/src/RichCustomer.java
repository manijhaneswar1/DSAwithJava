import java.util.Scanner;
public class RichCustomer{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter m value : ");
        int m=sc.nextInt();
        System.out.print("enter n value : ");
        int n=sc.nextInt();
        System.out.print("enter Arr value's : ");
        int[][] arr=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Richest Customer with Wealth of : " + maximumWealth(arr));
    }
    static public int maximumWealth(int[][] accounts) {
        int max=0;
        for (int[] account : accounts) {
            int sum = 0;
            for (int i : account) {
                sum += i;
            }
            max = Math.max(max, sum);
        }
        return max;
    }
}

import java.util.Scanner;
public class RichCustomer{
    public static void main(String[] args){
       int[][] arr={{1,5},{3,5},{7,3}};
        System.out.println("Richest Customer with Wealth of : " + maximumWealth(arr));
    }
   /* static public int maximumWealth(int[][] accounts) {
        int max=0;
        for (int[] account : accounts) {
            int sum = 0;
            for (int i : account) {
                sum += i;
            }
            max = Math.max(max, sum);
        }
        return max;
    }*/
    static int maximumWealth(int[][] arr){
        int max=0;
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum=sum+arr[i][j];
            }
            if(sum>max){
                max=sum;
                sum=0;
            }
        }
        return max;
    }






}

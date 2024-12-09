import java.util.Scanner;

public class StockBuySell {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of Arr : ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(Profit(arr));
    }

    static int Profit(int[] arr){
        int minPrice=arr[0];
        //int max=0;
        for (int j : arr) {
            if (j < minPrice) {
                minPrice = j;
            }
            // you can try this method also
            /*
            else{
                int profit=arr[j]-minPrice;
                if(profit>max){
                   max=profit;
                  }
                }
            */
        }
        int priceIndex=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==minPrice){
                priceIndex=i;
            }
        }
        int max=minPrice;
        for (int i = priceIndex; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max-minPrice;
    }
}

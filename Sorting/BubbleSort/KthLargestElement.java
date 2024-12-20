import java.util.Scanner;

public class KthLargestElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of Array : ");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.print("Enter the Array : ");
        for (int i = 0; i < n; i++) {
            nums[i]=sc.nextInt();
        }
        System.out.print("Enter the K th value : ");
        int k=sc.nextInt();

        System.out.println("THE kth ("+ k + ") largest element is : " + kthLargeOf(nums,k));
    }
    static int kthLargeOf(int[] nums,int k){
        boolean swapped;
        for (int i = 0; i < nums.length; i++) {
            swapped=false;
            for (int j = 0; j < nums.length-i-1; j++) {
                if(nums[j]>nums[j+1]){
                    int temp=nums[j+1];
                    nums[j+1]=nums[j];
                    nums[j]=temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
        return nums[nums.length-k];
    }
}
















//Kth Largest Element Using Bubble Sort
//Use Bubble Sort to find the Kth largest element in an unsorted array after sorting it.
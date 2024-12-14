import java.util.Arrays;

public class BinaryIn2dDemo {
    public static void main(String[] args) {
        int[][] arr={ {10,20,30,40}, {15,25,35,45}, {28,29,37,49}, {33,34,38,50} };
        int target=10;
        System.out.println(Arrays.toString(searchIn2dArr(arr, target)));
    }
 /*   static int[] searchIn2dArr(int[][] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            int s=0;
            int e=arr[i].length-1;
            while(s<=e){
                int mid=s+(e-s)/2;
                if(arr[i][mid]==target){
                    return new int[]{i,mid};
                }else if(arr[i][mid]>target){
                    e=mid-1;
                }else{
                    s=mid+1;
                }
            }
        }
        return new int[]{-1,-1};
    } */

    //Now to Optimize above code from O(n*2) to O(n):
    static int[] searchIn2dArr(int[][] arr,int target){
        int r=0;
        int c=arr.length-1;
        while( r < arr.length && c>=0){
            if(target == arr[r][c]){
                return new int[]{r,c};
            }else if(arr[r][c] > target){
                c--;
            }else{
                r++;
            }
        }
        return new int[]{-1,-1};
    }
}

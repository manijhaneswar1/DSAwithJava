import java.util.Arrays;

public class FirstIndexLastIndex {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,3,3,4};
        int target = 3;
        System.out.println(Arrays.toString(searchInt(arr,target)));
    }
    static int[] searchInt(int[] arr , int target){
        int[] ans = {-1,-1};
        ans[0] = search(arr,target,true);
        if(ans[0] != -1){
            ans[1]  = search(arr,target,false);
        }
        return ans;
    }
    static int search(int[] arr, int target, boolean check){
        int ans  = -1;
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            int mid = start + (end-start) /2;
            if(arr[mid] < target){
                end = mid  -1;
            }else if(arr[mid] > target){
                start = start + 1;
            }else{
                ans = mid;
                if(check){
                    end = mid -1;
                }else{
                    start = mid +1;
                }
            }
        }
        return ans;
    }
}

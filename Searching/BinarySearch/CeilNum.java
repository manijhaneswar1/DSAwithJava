public class CeilNum {
    public static void main(String[] args) {
        int[] arr={1,5,6,7,10,12};
        int target=2;
        System.out.println(ceilFun(arr,target));
    }
    static int ceilFun(int[] arr,int target){
        int ceil=-1;
        int start=0;
        int end=arr.length-1;
        if(target > arr[end]){
            return -1;
        }
        for (int i = start; i <= end; i++) {
            int mid=start + (end-start)/2;
            if(target==arr[mid]){
                return arr[mid];
            }
            else if(target < arr[mid]){
                end=mid-1;
                ceil=arr[start];
                for (int j = start; j <= end; j++) {
                    if (arr[j] < ceil) {
                        ceil = arr[end];
                        break;
                    }
                }
            }
            else if(target > arr[mid]){
                start = mid + 1;
                ceil=arr[start];
                for (int j = start; j <= end; j++) {
                    if(arr[j]<ceil){
                        ceil=arr[j];
                    }
                }
            }
        }
        return ceil;
    }
}

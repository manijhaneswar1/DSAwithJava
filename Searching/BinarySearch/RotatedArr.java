public class RotatedArr {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,1,2};
        int target=4;
        System.out.println(ans(arr,target));
    }
    static int ans(int[] arr,int target){
        int pivot=pivot(arr);
        if(pivot == -1){
            return BinaryAss(arr,target,0,arr.length-1);
        }
        if(arr[pivot]==target){
            return pivot;
        }
        if(target >= arr[0]){
           return  BinaryAss(arr,target,0,pivot-1);
        }
        return BinaryAss(arr,target,pivot+1,arr.length-1);
    }
    static int pivot(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start <= end){
            int mid=start + (end-start)/2;
            if(mid<end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if(arr[start] >= arr[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
    static int BinaryAss(int[] arr,int target,int start,int end){
        while (start <=end) {
            int mid=start + (end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            } else if (target < arr[mid]) {
                end=mid-1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}

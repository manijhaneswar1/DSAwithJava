public class CountRotatedArrPivot {
    public static void main(String[] args) {
        int[] arr={10,12,1,2,3,4};
        int count=pivot(arr)+1;
        System.out.println(count);
    }
    static int pivot(int[] arr){
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int mid=s + (e-s)/2;
            if(mid < e && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > s && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if(arr[s] >= arr[mid]){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return -1;
    }
}

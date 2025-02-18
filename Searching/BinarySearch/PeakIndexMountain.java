public class PeakIndexMountain {
    public static void main(String[] args) {
        int[] arr={3,4,5,1,2};
        System.out.println(findPeakElement(arr));
    }
    static int findPeakElement(int[] arr) {
        int s=0;
        int e=arr.length-1;
        while(s < e){
            int mid=s + (e-s)/2;
            if( arr[mid] > arr[mid+1]){
                e=mid;
            }else {
                s=mid+1;
            }
        }
        return e; //it is returning index 0f element in Arr // if you want element itself then // return arr[e];
    }
}

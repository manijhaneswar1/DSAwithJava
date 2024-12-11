public class InfiniteArr {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,56,100};
        int target =56;
        System.out.println(ans(arr,target));
    }
    static int ans(int[] arr,int target){
        int start=0;
        int end=1;
        if(target > end){
            start=end+1;
            end=end+(start-end +1 )*2;
        }
        return Binary(arr,target,start,end);
    }
    static int Binary(int[] arr, int target, int start, int end){
        while(start<=end){
            int mid=start + (end-start)/2;
           if(target < arr[mid]){
                end=mid-1;
            }else if(target > arr[mid]){
                start=mid+1;
            }else{
              return mid;
           }
        }
        return -1;
    }
}

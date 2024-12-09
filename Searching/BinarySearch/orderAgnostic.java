public class orderAgnostic {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int target=1;
        System.out.println("Index of Given Target in Array : " + orderAgnosticSearch(arr,target));
    }
    static int orderAgnosticSearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        boolean Ascending=arr[start]<arr[end];
        while (start <=end) {
            int mid=start + (end-start)/2;
            if(target == arr[mid]){
                return mid;
            }else if(Ascending){
                if(target<arr[mid]){
                    end=mid-1;
                } else {
                    start=mid+1;
                }
            }else {
                if(target>arr[mid]){
                    end=mid-1;
                } else {
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}
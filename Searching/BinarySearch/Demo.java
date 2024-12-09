public class Demo {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int target=1;
        int[] arr2={5,4,3,2,1};
        int target2=1;
        System.out.println("index of Given target in Arr {Ascending order}: " + BinaryAss(arr,target));
        System.out.println("index of Given target in Arr {Descending order} : " + BinaryDec(arr2,target2));
    }
    static int BinaryAss(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
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
    static int BinaryDec(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while (start <=end) {
            int mid=start + (end-start)/2;
            if(target>arr[mid]){
                end=mid-1;
            } else if (target < arr[mid]) {
                start=mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
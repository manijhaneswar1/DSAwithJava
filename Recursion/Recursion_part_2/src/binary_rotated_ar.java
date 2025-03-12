public class binary_rotated_ar {
    public static void main(String[] args) {
        int[] arr = {6,7,8,9,10,1,2,3,4,5};
        int target = 1;
        System.out.println(find(arr, target, 0, arr.length-1));
    }
    static int find(int[] arr, int target, int s, int e){
        if(s > e) return -1;
        int mid = s + (e - s) / 2;
        if(target == arr[mid]) return mid;

        if(arr[s] <= arr[mid]){
            if(target >= arr[s] && target <= arr[mid]){
                return find(arr, target, s, mid-1);
            }else{
                return find(arr, target, mid+1, e);
            }
        }

        if(target >= mid && target <= arr[e]){
            return find(arr, target, mid+1, e);
        }
        return find(arr, target, s, mid-1);
    }
}
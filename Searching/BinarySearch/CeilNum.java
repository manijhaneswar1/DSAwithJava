public class CeilNum {
    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 7, 10, 12};
        int target = 11;
        System.out.println(ceilFun(arr, target));
    }
    static int ceilFun(int[] arr, int target) {
        int ceil = -1;
        int start = 0;
        int end = arr.length - 1;
        if (target > arr[end]) {
            return -1;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return arr[mid];
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                ceil=arr[mid];
                end = mid - 1;
            }
        }
        return ceil;
    }
}
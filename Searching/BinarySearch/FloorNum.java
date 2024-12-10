public class FloorNum {
    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 7, 10, 12};
        int target = 1000;
        System.out.println(floorFun(arr, target));
    }
    static int floorFun(int[] arr, int target) {
        int floor = -1;
        int start = 0;
        int end = arr.length - 1;
        if (target < arr[start]) {
            return -1;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return arr[mid];
            } else if (arr[mid] < target) {
                floor = arr[mid];
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return floor;
    }
}
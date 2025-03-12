public class min_max_num_arr {
    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, 10, -8};
        minMax(arr, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
    }
    static void minMax(int[] arr, int i, int min, int max){
        if(i == arr.length-1){
            System.out.println("Minimum : " + min);
            System.out.println("Maximum : " + max);
            return;
        }
        if(arr[i] < min){
            min = arr[i];
        }
        if(arr[i] > max){
            max = arr[i];
        }
        minMax(arr, i + 1, min, max);
    }
}

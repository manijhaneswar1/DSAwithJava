import java.util.Arrays;

public class gfg_easy {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        sum_triangle(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sum_triangle(int[] arr){
        if(arr.length < 1){
            return;
        }
        int[] temp = new int[arr.length-1];
        for (int i = 0; i < arr.length-1; i++) {
            int num = arr[i] + arr[i+1];
            temp[i] = num;
        }
        sum_triangle(temp);
        System.out.println(Arrays.toString(arr));
    }
}

import java.util.Arrays;

public class SqauresOfSortArr {
    public static void main(String[] args){
        int[] arr={-4,-2,0,3,5,67,100};
        System.out.println(Arrays.toString(sqauresSortedArr(arr)));
    }
    static int[] sqauresSortedArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i]*arr[i];
        }
        Arrays.sort(arr);
        return arr;
    }
}

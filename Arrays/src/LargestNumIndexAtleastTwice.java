import java.util.Arrays;

public class LargestNumIndexAtleastTwice {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        System.out.println(ReturnIndexOfLarNum(arr));
    }
    static int ReturnIndexOfLarNum(int[] arr){
        if(arr.length==1){
            return 0;
        }
        int[] sortedArr= Arrays.copyOf(arr,arr.length);
        Arrays.sort(sortedArr);
        int largestNum=sortedArr[sortedArr.length-1];
        for (int i = arr.length-2; i >=0 ; i--) {
            if(largestNum < 2*sortedArr[i]){
                return -1;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==largestNum){
                return i;
            }
        }
        return -1;
    }
}

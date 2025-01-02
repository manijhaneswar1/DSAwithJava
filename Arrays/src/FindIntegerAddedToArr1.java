import java.util.Arrays;

public class FindIntegerAddedToArr1 {
    public static void main(String[] args) {
        int[] arr={2,6,4};
        int[] arr2={9,7,5};
        System.out.println(findNumAddToArr1(arr,arr2));
    }
    static int findNumAddToArr1(int[] Arr1,int[] Arr2){
        Arrays.sort(Arr1);
        Arrays.sort(Arr2);
        return Arr2[0]-Arr1[0];
    }
}

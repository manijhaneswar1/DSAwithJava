import java.util.Arrays;

public class FindIntegerAddedToArr1 {
    public static void main(String[] args) {
        int[] arr={2,6,4};
        int[] arr2={9,7,5};
        System.out.println(findNumAddToArr1(arr,arr2));
    }
    static int findNumAddToArr1(int[] Arr1,int[] Arr2){
        Arrays.sort(Arr1); //2,4,6
        Arrays.sort(Arr2); //5,7,9
        for (int i = 0; i < Arr2[Arr2.length-1];) {
            int n=Arr1[i]+i;
            for (int j = 0; j < Arr2.length; j++) {
                if(n == Arr2[j]){
                    i++;
                }
            }
            return i;
        }
       // return Arr2[0]-Arr1[0];
        return 0;
    }
}

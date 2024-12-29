import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] arr={9};
        System.out.println(Arrays.toString(plusOne(arr)));
    }
    static int[] plusOne(int[] arr){
        int n=arr.length;
        for (int i = n-1; i >=0 ; i--) {
            if(arr[i]<9){
                arr[i]++;
                return arr;
            }
            arr[i]=0;
        }
        int[] newArr=new int[n+1];
        newArr[0]=1;
        return newArr;
    }
}

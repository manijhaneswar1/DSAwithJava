import java.util.Arrays;

public class ZerosToLast {
    public static void main(String[] args) {
        int[] arr={0,1,2,0,0,12,133,0};
        for (int i = 0; i < arr.length; i++) {
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==0){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

//Optimization


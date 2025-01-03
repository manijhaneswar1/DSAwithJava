import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int[] arr={2,3,1,4,5};
        cyclicSortDemo(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclicSortDemo(int[] arr){
       int i=0;
       while(i < arr.length){
           int correct=arr[i]-1;
           if(arr[i] != arr[correct]){
               swap(arr,i,correct);
           }else{
               i++;
           }
       }
    }
    static void swap(int[] arr,int s,int e){
        int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
    }
}

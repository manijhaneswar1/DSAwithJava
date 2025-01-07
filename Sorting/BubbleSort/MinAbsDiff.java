import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class MinAbsDiff {
    public static void main(String[] args) {
        int[] arr={40,11,26,27,-20};
        System.out.println(Arrays.toString(new List[]{minimumAbsDifference(arr)}));
    }
    static List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> output=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            int nxtmin=arr[i+1]-arr[i];

            if(nxtmin < min){
                min=nxtmin;
                output.clear();

                List<Integer> pair=new ArrayList<>();
                pair.add(arr[i]);
                pair.add(arr[i+1]);
                output.add(pair);
            }else if(min == nxtmin){
                List<Integer> pair=new ArrayList<>();
                pair.add(arr[i]);
                pair.add(arr[i+1]);
                output.add(pair);
            }
        }
        return output;
    }
}

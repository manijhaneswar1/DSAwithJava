import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class leetcode_2829 {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(5);
        arr.add(-1);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(1);
        System.out.println(PairCount(arr , 2));
    }
    static int PairCount(List<Integer> arr , int target){
        Collections.sort(arr);
        int n = arr.size();
        int s = 0;
        int e = n - 1;
        int count = 0;

        while(s < e){
            int sum = arr.get(s) + arr.get(e);

            if( sum < target ){
                count += e - s;
                s++;
            }else{
                e--;
            }
        }
        return count;
    }
}

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Arrays;

public class Four_Sum {
    public static void main(String[] args) {
        int[] arr={1,0,0,-1,2,-2};
        int target=0;
        System.out.println(fSum(arr,target));
    }
    static List<List<Integer>> fSum(int[] arr, int target){
        Arrays.sort(arr);
        HashSet<String> hSet=new HashSet<>();
        List<List<Integer>> res= new ArrayList<>();
        int n=arr.length;
        for (int i = 0; i < n-3; i++) {
            for (int j = i+1; j < n-2; j++) {
                int li=j+1;
                int ri=n-1;

                while(li < ri){
                    long sum=0;
                    sum += arr[i]+arr[j]+arr[li]+arr[ri];
                    if(sum < target){
                        li++;
                    }else if(sum > target){
                        ri--;
                    }else{
                        StringBuilder sb = new StringBuilder();
                        sb.append(arr[i]);
                        sb.append(arr[j]);
                        sb.append(arr[li]);
                        sb.append(arr[ri]);
                        String match = sb.toString();
                        if(!hSet.contains(match)) {
                            hSet.add(match);
                            res.add(Arrays.asList(arr[i], arr[j], arr[li], arr[ri]));
                        }
                        ri--;
                        li++;
                    }
                }
            }
        }
        return res;
    }
}

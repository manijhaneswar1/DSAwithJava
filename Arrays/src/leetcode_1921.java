import java.util.Arrays;

public class leetcode_1921 {
    public static void main(String[] args) {
      // System.out.println(eliminateMaximum(new int[]{4,3,4}, new int[]{1,1,2}));
        System.out.println(eliminateMaximum2(new int[]{4,3,4}, new int[]{1,1,2}));
    }
    static int eliminateMaximum(int[] dist, int[] speed) {
        int count = 1;
        int[] modifyDist = reduceDist(dist, speed);
        for(int i = 1; i < speed.length ; i++){
            if(modifyDist[i] < 1){
                return count;
            }else{
                count++;
                modifyDist = reduceDist(modifyDist, speed);
            }
        }
        return dist.length;
    }
    static int[] reduceDist(int[] arr, int[] speed){
        int[] ans = new int[arr.length];
        int idx = 0;
        for(int num : speed){
            ans[idx] = arr[idx] - num;
            idx++;
        }
        return ans;
    }
    static int eliminateMaximum2(int[] dist, int[] speed) {
        int n = dist.length;
        int[] arrivalTime = new int[n];

        for (int i = 0; i < n; i++) {
            arrivalTime[i] = (int) Math.ceil((double) dist[i] / speed[i]);
        }

        Arrays.sort(arrivalTime);

        for (int i = 0; i < n; i++) {
            if (arrivalTime[i] <= i) {
                return i;
            }
        }

        return n;
    }
}

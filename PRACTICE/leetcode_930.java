public class leetcode_930 {
    public static void main(String[] args) {
        int[] arr = {0,0,0,0,0};
        int goal = 0;
        System.out.println(subArray(arr, goal));
    }
    static int subArray(int[] arr, int goal){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = arr[i];
            if(sum == goal) count++;
            for (int j = i+1; j < arr.length; j++) {
                    sum += arr[j];
                    if(sum == goal) count++;
                    if(sum > goal) break;
            }
        }
        return count;
    }
}

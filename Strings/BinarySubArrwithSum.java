public class BinarySubArrwithSum {
    public static void main(String[] args) {
        int[] arr={0,0,0,0,0};
        int goal=0;
        System.out.println(helper(arr,goal));
    }
    static int helper(int[] arr,int goal){
        int c=0;
        for (int i = 0; i < arr.length; i++) {
            int sum = arr[i];
            if(sum == goal) c++;
            for (int j = i+1; j < arr.length; j++) {
                sum += arr[j];
                if (sum == goal) {
                    c++;
                } else if (sum > goal) {
                    break;
                }
            }
        }
        return c;
    }
}

public class pos_neg_single {
    public static void main(String[] args) {
        int[] arr={1,-1,2,3,4,-2,-4,-3,9};
        System.out.println(bitMethod(arr));
    }
    static int bitMethod(int[] arr){
        int ans = 0;
        for(int num : arr) ans += num;
        return ans;
    }
}

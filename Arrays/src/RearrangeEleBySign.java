import java.util.Arrays;

public class RearrangeEleBySign {
    public static void main(String[] args) {
        int[] arr={-1,1};
        System.out.println(Arrays.toString(rearrangeArray(arr)));
    }
    static int[] rearrangeArray(int[] nums) {
        if(nums.length==0) return new int[0];

        int[] resArr = new int[nums.length];
        int pIdx = 0;
        int nIdx = 1;

        for(int num : nums){
            if(num > 0 && pIdx < nums.length){
                resArr[pIdx]=num;
                pIdx = pIdx + 2;
            }else if(num < 0 && nIdx < nums.length){
                resArr[nIdx]=num;
                nIdx = nIdx+2;
            }
        }
        return resArr;
    }
}

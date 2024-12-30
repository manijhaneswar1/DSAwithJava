import java.util.Arrays;

public class RearrangeEleBySign {
    public static void main(String[] args) {
        int[] arr={3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(rearrangeArray(arr)));
    }
    static int[] rearrangeArray(int[] nums) {
        if(nums.length==0){
            return new int[0];
        }
        int[] res=new int[nums.length];
        int positiveIndex=0;
        int negativeIndex=1;
        for(int num : nums){
            if(num>0 && positiveIndex < nums.length){
                res[positiveIndex]=num;
                positiveIndex+=2;
            }else{
                res[negativeIndex]=num;
                negativeIndex+=2;
            }
        }
        return res;
    }
}

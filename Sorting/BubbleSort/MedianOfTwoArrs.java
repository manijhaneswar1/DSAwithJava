public class MedianOfTwoArrs {
    public static void main(String[] args) {
        int[] nums1={1,2};
        int[] nums2={3,4};
        System.out.println(median(nums1,nums2));
    }
    static double median(int[] nums1,int[] nums2){
        int m=nums1.length;
        int n=nums2.length;
        //merged two arrays
        int[] merged=new int[m+n];
        for (int i = 0; i < m; i++) {
            merged[i]=nums1[i];
        }
        for (int i = 0; i < n; i++) {
            merged[i+m]=nums2[i];
        }
        //sort the two Arrays
        java.util.Arrays.sort(merged);
        //cal median based on lenght of merged Arr
        int l=merged.length;
        if(l%2==0){
            return (merged[l/2]+merged[(l/2)-1])/2.0;
        }else{
            return merged[l/2];
        }
    }
}

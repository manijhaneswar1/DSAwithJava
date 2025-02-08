public class Container_with_most_water {
    public static void main(String[] args) {
        int[] height={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
    static int maxArea(int[] height) {
        int n = height.length;
        int max = Integer.MIN_VALUE;
        for(int idx = 0 ; idx < n ; idx++){
            int tempMax = Integer.MIN_VALUE;
            int minus = 0;
            for(int j = n-1 ; j>=0 ; j--){
                if(height[j] >= height[idx]){
                    tempMax = Math.max(tempMax , height[idx] * (n - minus - idx -1));
                    break;
                }
                if(height[j] <= height[idx]){
                    tempMax = Math.max(tempMax , height[j] * (n - minus - idx - 1));
                }
                minus++;
            }
            if(tempMax > max) max = tempMax;
        }
        return max;
    }
}

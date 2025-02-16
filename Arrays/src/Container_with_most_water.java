public class Container_with_most_water {
    public static void main(String[] args) {
        int[] height={8,7,2,1};
        System.out.println(maxArea(height));
        System.out.println(maxAreaOptimal(height));
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
    static int maxAreaOptimal(int[] arr){
        int i = 0;
        int j = arr.length-1;
        int max = 0;
        while(i < j){
            int tempMax = Math.min(arr[i] , arr[j]) * (j - i);
            max = Math.max(tempMax , max);
            if(arr[i] < arr[j]){
                i++;
            }else{
                j--;
            }
        }
        return max;
    }
}

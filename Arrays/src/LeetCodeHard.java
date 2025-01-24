public class LeetCodeHard {
    public static void main(String[] args) {
        int[][] arr={{-19, -12}, {-13, -18}, {-12, 18}, {-11, -8}, {-8, 2}, {-7, 12}, {-5, 16}, {-3, 9}, {1, -7}, {5, -4}, {6, -20}, {10, 4}, {16, 4}, {19, -9}, {20, 19}};
        System.out.println(findMaxValueOfEquation2(arr,6));
    }
    static int findMaxValueOfEquation(int[][] points, int k) {
        int n = points.length;
        int ans=0;
        int j=1;
        for(int i=0;i<n-1;i++){
            if(Math.abs(points[i][0]-points[i+1][0]) <= k){
                ans = Math.max(ans,points[i][j] + points[i+1][j] + Math.abs(points[i][0]-points[i+1][0]));
            }
        }
        return ans;
    }
    static int findMaxValueOfEquation2(int[][] points, int k) {
        int ans=Integer.MIN_VALUE;
        int left=0;
        int right=1;
        int n=points.length;
        while(left < n){
            if(right < left+1) right=left+1;
            for(int j=right;j<n;j++){
                if(points[j][0] > (k+points[left][0]) ) break;

                int sum=points[left][1] + points[j][1] + points[j][0]-points[left][0];
                if(sum > ans){
                    ans = sum;
                    right = j-1;
                }
            }
            left++;
        }
        return ans;
    }
    static int findMaxValueOfEquation3(int[][] points, int k) {
        int ans = Integer.MIN_VALUE;
        int left = 0;
        int right = 1;

        while (left < points.length) {
            if (right < left + 1) right = left + 1;
            for (int j = right; j <= points.length - 1; j++) {
                if (points[j][0] > (points[left][0] + k))
                    break;

                int sum = points[left][1] + points[j][1] + points[j][0] - points[left][0];
                if (sum > ans) {
                    ans = Math.max(ans, sum);
                    right = j - 1;
                }
            }
            left++;
        }
        return ans;
    }
}

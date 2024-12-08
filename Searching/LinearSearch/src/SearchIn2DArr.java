package src;

import java.util.Arrays;

public class SearchIn2DArr {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4}, {5, 6, 7}, {8, 100}
        };
        int target = 5;
        System.out.println(Arrays.toString(In2D(arr, target)));
        System.out.println("Maximum Number in an Array : " + Max(arr));
    }

    static int[] In2D(int[][] arr, int target) {
        int[] ans = new int[0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    ans = new int[]{i, j};
                }
            }
        }
        return ans;
    }
    static int Max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] box : arr) {
            for (int num : box) {
                if (num > max) {
                    max = num;
                }
            }
        }
        return max;
    }
}

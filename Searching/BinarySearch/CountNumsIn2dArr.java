public class CountNumsIn2dArr {
    public static void main(String[] args) {
        int[][] grid={{5,4,3,-1,-2},{9,8,7,6,-1,-2,-3}};
        System.out.println(countNegatives(grid));
    }
static int countNegatives(int[][] arr){
        int count=0;
    for (int i = 0; i < arr.length; i++) {
        int s=0;
        int e=arr[i].length;
        while(s < e){
            int mid=s+(e-s)/2;
            if(arr[i][mid]<0){
                e=mid;
            }else{
                s=mid+1;
            }
        }
        count += arr[i].length-s;
    }
        return count;
    }
}
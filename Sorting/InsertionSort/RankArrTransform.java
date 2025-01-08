import java.util.Arrays;

public class RankArrTransform {
    public static void main(String[] args) {
        int[] arr={100,100,100};
        System.out.println(Arrays.toString(arrayRankTransform(arr)));
    }
    static int[] arrayRankTransform(int[] arr) {
        int[] sortedArr= Arrays.copyOf(arr,arr.length);
        Arrays.sort(sortedArr);

        int[] rankArr=new int[arr.length];
        int rank=1;

        for(int i=0;i<sortedArr.length;i++){
            if(i==0 || sortedArr[i] != sortedArr[i-1]){
                for(int j=0;j<arr.length;j++){
                    if(sortedArr[i]==arr[j]){
                        rankArr[j]=rank;
                    }
                }
                rank++;
            }
        }
        return rankArr;
    }
}

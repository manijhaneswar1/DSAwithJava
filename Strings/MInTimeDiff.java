import java.util.*;

public class MInTimeDiff {
    public static void main(String[] args) {
        String[] arr={"02:39","10:26","21:43"};
        System.out.println(findMinDifference(List.of(arr)));
    }
    static int findMinDifference(List<String> timePoints) {
        int[] minutes=new int[timePoints.size()];
        // convert each string in Arr into minutes
        for(int i=0;i<timePoints.size();i++){
            int hour=Integer.parseInt(timePoints.get(i).substring(0,2));
            if(timePoints.get(i).startsWith("00") && timePoints.get(i).startsWith("00", 3)){
                hour = 24;
            }
            int min=Integer.parseInt(timePoints.get(i).substring(3,5));
            minutes[i]=(hour*60) + min;
        }
        // find diff of each two adjacent and first & last element too
        // return minDiff of all diff
        Arrays.sort(minutes);
        int minDiff=Integer.MAX_VALUE;
        for(int j=0;j<minutes.length-1;j++){
            minDiff=Math.min(minDiff,Math.abs(minutes[j+1]-minutes[j]));
        }
        minDiff=Math.min(minDiff,(1440 - minutes[timePoints.size() - 1] + minutes[0]));
        return minDiff;
    }
}

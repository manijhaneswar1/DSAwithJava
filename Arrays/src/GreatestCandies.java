import java.util.ArrayList;

public class GreatestCandies {
    public static void main(String[] args) {
        int[] candies={2,3,5,1,3};
        int extraCandies=3;
        ArrayList<Boolean> ans=new ArrayList<>();
        int max=0;
        for(int candy : candies){
            if(candy > max){
                max=candy;
            }
        }
        for (int candy : candies){
            ans.add(candy + extraCandies >= max);
        }
        System.out.println(ans);
    }
}

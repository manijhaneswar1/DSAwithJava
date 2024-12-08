import java.util.ArrayList;
import java.util.Scanner;

public class GreatestCandies {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> Candies=new ArrayList<>();
        System.out.print("Enter the Array : ");
        for (int i = 0; i < 5; i++) {
            Candies.add(sc.nextInt());
        }
        System.out.print("Enter the extra candies : ");
        int extraCandies=sc.nextInt();
        ArrayList<Boolean> ans=new ArrayList<>();
        int max=0;
        for(int candy : Candies){
            if(candy > max){
                max=candy;
            }
        }
        for (int candy : Candies){
            ans.add(candy + extraCandies >= max);
        }
        System.out.println(ans);
    }
}

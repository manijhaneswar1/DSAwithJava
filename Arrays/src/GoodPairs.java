import java.util.ArrayList;
import java.util.Scanner;

public class GoodPairs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> arr=new ArrayList<>();
        System.out.print("Enter the len of Arr : ");
        int n=sc.nextInt();
        System.out.print("Enter the Array : ");
        for (int i = 0;i<n; i++) {
            arr.add(sc.nextInt());
        }
        int goodPairs=0;
        for (int i = 0; i < arr.toArray().length; i++) {
            for (int j =i+1; j < arr.toArray().length; j++) {
               if(arr.get(i)==arr.get(j)){
                   goodPairs++;
               }
            }
        }
        System.out.println(goodPairs);
    }
}

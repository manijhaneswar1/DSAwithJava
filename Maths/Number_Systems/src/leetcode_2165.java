import java.util.Arrays;
import java.util.Scanner;

public class leetcode_2165 {
    public static void main(String[] args) {
        System.out.println("Enter the Number : ");
        Scanner myObj = new Scanner(System.in);
        long n = myObj.nextLong();
        if(n < 0 && n > -10) System.out.println(n);
        if(n < 10 && n >= 0) System.out.println(n);
        System.out.println(posNum(n));
        System.out.println(negNum(-7605));
    }
        static long posNum(long n){
            int numberlen = String.valueOf(n).length();
            long[] nums = new long[numberlen];
            for(int i=0 ; i <= numberlen ; i++){
                if(n < 10) {
                    nums[i] = n;
                    break;
                }
                long rem = n % 10;
                nums[i] = rem;
                n = n / 10;
            }
            Arrays.sort(nums);
            if(nums[0] == 0){
                for(int i =0 ; i< nums.length;i++){
                    if(nums[i] != 0){
                        long temp = nums[i];
                        nums[i] = nums[0];
                        nums[0] = temp;
                        break;
                    }
                }
            }
            StringBuilder ans = new StringBuilder();
            for(long num : nums){
                ans.append(num);
            }
            return Long.parseLong(ans.toString());
        }
        static long negNum(long number){
            int numberlen = String.valueOf(number).length();
                long n = -(number);
                long[] nums = new long[numberlen-1];
                 for(int i=0 ; i <= numberlen-1 ; i++){
                     if(n < 10) {
                         nums[i] = n;
                         break;
                     }
                     long rem = n % 10;
                     nums[i] = rem;
                     n = n / 10;
                 }
                Arrays.sort(nums);

                StringBuilder ans = new StringBuilder();
                for(long num : nums){
                    ans.append(num);
                }
                ans.reverse();
                ans.insert(0,'-');
                return Long.parseLong(ans.toString());
        }
    }

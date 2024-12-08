package conditionsANDloops;

import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        int c =sc.nextInt();

      /*  if(a>b && a>c){
            System.out.print(a + " is the largest");
        }
        if(b >a && b>c){
            System.out.print(b + " is the largest");
        }
        if(c >a && c>b){
            System.out.print(c + " is the largest");
        } */

       int max=a;
        if (b >max ){
            max=b;
        }
        if(c >max ){
            max=c;
        }
        System.out.print( max + " is the largest ");


    }
}

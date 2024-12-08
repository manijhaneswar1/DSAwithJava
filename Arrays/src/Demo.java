import java.util.Arrays;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //Array Integer
        System.out.print("Enter the Integer Array : ");
        int[] arr=new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        //Array objects
        System.out.print("Enter the String Array : ");
        String[] str=new String[3];
        for (int i = 0; i < str.length; i++) {
            str[i]=sc.nextLine();
        }
        System.out.println(Arrays.toString(str));

        //function or method
        int[] arrFun={1,2,3};
        ArrFun(arrFun);
        System.out.println(Arrays.toString(arrFun));
    }

    //Passing Array in Functions
    static void ArrFun(int[] arr){
        arr[0]=100;
    }
}

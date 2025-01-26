public class Demo_Number_Recursion {
    public static void main(String[] args) {
        //func(1);
        printNos(10);
    }
    static void func(int n){
        // this is base condition
        if(n == 6){
            return;
        }
        System.out.println(n);
        // recursive call
        func(n + 1);
    }
    static void printNos(int n) {
        // base condition

        if(n == 0) return;

        printNos(n-1);
        System.out.println(n);
    }
}

public class Demo_Number_Recursion {
    public static void main(String[] args) {
        func(1);
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
}

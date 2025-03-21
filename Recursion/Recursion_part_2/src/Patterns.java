public class Patterns {
    public static void main(String[] args) {
        pattern_1(5, 0);
        pattern_2(5,0);
        pattern_3(5,0);
    }
    static void pattern_1(int n, int i){
        if(i == n){
            return;
        }
        for (int j = i; j <= i; j++) {
            for (int k = 0; k < n-i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        pattern_1(n, i + 1);
    }
    static void pattern_2(int r, int c){
        if(r == 0){
            return;
        }
        if(c < r){
            System.out.print("* ");
            pattern_2(r, c+1);
        }else{
            System.out.println();
            pattern_2(r-1, 0);
        }
    }
    static void pattern_3(int r, int c){
        if(r == 0){
            return;
        }
        if(c < r){
            pattern_3(r, c+1);
            System.out.print("* ");
        }else{
            pattern_3(r-1, 0);
            System.out.println();
        }
    }
}

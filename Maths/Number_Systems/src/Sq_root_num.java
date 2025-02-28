public class Sq_root_num {
    public static void main(String[] args) {
        System.out.printf("%.3f",sqrt(40,3));
    }
    static double sqrt(int n,int p){
        int s = 0;
        int e = n;

        double root = 0.0;

        while(s <= e ){
            int mid = (s + e) / 2;
            if(mid * mid == n){
                return mid;
            }
            if(mid * mid > n){
                e = mid - 1;
            }else {
                s = mid + 1;
            }
        }
        double inc = .1;
        for (int i = 0; i < p; i++) {
            while(root * root <= n){
                root += inc;
            }
            root -= inc;
            inc /= 10;
        }
        return root;
    }
}

public class count_zeros {
    public static void main(String[] args) {
        System.out.println(zeros(102040,0));
    }
    static int zeros(int n , int count){
        if(n == 0){
            return count;
        }
        if( n % 10 == 0) count++;
        return zeros(n / 10 , count);
    }
}

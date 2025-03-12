public class AddAllDigits {
    public static void main(String[] args) {
        int num=110;
        System.out.println(addDigits(num));
    }
    static int addDigits(int num) {
        if(String.valueOf(num).length()==1){
            return num;
        }
        int sum=0;
        while(sum >= 0){
            sum+=num%10;
            sum+=num/10;
            if(String.valueOf(sum).length()==1){
                return sum;
            }else{
                num=sum;
                sum=0;
            }
        }
        return -1;
    }
}

import java.util.HashMap;

public class Numerator_denominator {
    public static void main(String[] args) {
        int numerator=4;
        int denominator=333;
        System.out.println(fractionToDecimal(numerator,denominator));
    }
    static String fractionToDecimal(int numerator,int denominator){
        if(numerator == 0) return "0";
        if(denominator == 1) return String.valueOf(numerator);

        StringBuilder res = new StringBuilder();
        if(numerator < 0 ^ denominator < 0) res.append("-");

        long num = Math.abs((long) numerator);
        long denom = Math.abs((long) denominator);
        long rem = num % denom;

        res.append(num / denom);
        if(rem == 0) return res.toString();

        res.append(".");
        HashMap<Long,Integer> map = new HashMap<>();

        while(rem != 0){
            if(map.containsKey(rem)){
                res.insert(map.get(rem),"(");
                res.append(")");
                break;
            }
            map.put(rem,res.length());

            rem *= 10;
            res.append(rem / denom);
            rem %= denom;
        }
        return res.toString();
    }
}

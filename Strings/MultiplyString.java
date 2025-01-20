import java.math.BigInteger;

public class MultiplyString {
    public static void main(String[] args) {
        String n1="123";
        String n2="456";
        System.out.println(multiply(n1,n2));
    }
    static String multiply(String num1, String num2) {
        char ch= num1.charAt(0);
        BigInteger numberOne=BigInteger.valueOf(ch - '0');
        for(int i=1;i<num1.length();i++) {
            char c =num1.charAt(i);
            int singleNum = c - '0';
            numberOne =  numberOne.multiply(BigInteger.TEN).add(BigInteger.valueOf(singleNum));
        }

        char ch2=num2.charAt(0);
        BigInteger numberTwo=BigInteger.valueOf(ch2 - '0');
        for(int j=1;j<num2.length();j++){
            char c=num2.charAt(j);
            int singleNum=c - '0';
            numberTwo = numberTwo.multiply(BigInteger.TEN).add(BigInteger.valueOf(singleNum));
        }
        BigInteger res = numberOne.multiply(numberTwo);

        return String.valueOf(res);
    }
}

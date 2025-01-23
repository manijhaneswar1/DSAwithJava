public class calculator {
    public static void main(String[] args) {
        String s=" 3+5 / 2 ";
        System.out.println(calculate(s));
    }
    static int calculate(String s) {
        int ans=0;
        StringBuilder str= new StringBuilder(s.trim());

        while (str.length()!=1){

            if(str.toString().contains("*")){
                int index=str.toString().indexOf("*");
                int num1=Integer.parseInt(str.substring(index-1,index));
                int num2=Integer.parseInt(str.substring(index+1,index+2));

                ans += num1*num2;
                str= new StringBuilder(str.substring(0, index - 1) + str.substring(index + 2));
                str.append(ans);
                ans=0;
            }
            if(str.toString().contains("+")){
                int index=str.toString().indexOf("+");
                int num1=Integer.parseInt(str.substring(index-1,index));
                int num2=Integer.parseInt(str.substring(index+1,index+2));
                ans += num1+num2;
                str= new StringBuilder(str.substring(0, index - 1) + str.substring(index + 2));
                str.append(ans);
            }
            if(str.toString().contains("-")){
                int index=str.toString().indexOf("-");
                int num1=Integer.parseInt(str.substring(index-1,index));
                int num2=Integer.parseInt(str.substring(index+1,index+2));
                ans += num1-num2;
                str= new StringBuilder(str.substring(0, index - 1) + str.substring(index + 2));
                str.append(ans);
                ans=0;
            }
            if(str.toString().contains("/")){
                int index=str.toString().indexOf("/");
                int num1=Integer.parseInt(str.substring(index-1,index));
                int num2=Integer.parseInt(str.substring(index+1,index+2));
                ans += num1/num2;
                str= new StringBuilder(str.substring(0, index - 1) + str.substring(index + 2));
                str.append(ans);
                ans=0;
            }
        }
        return Integer.parseInt(str.toString());
    }
}

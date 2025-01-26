public class First_UpperCase_Letter {
    public static void main(String[] args) {
        String str = "maniKanta";
        int i=0;
        if(FUL(str,i)==' '){
            System.out.println("No upperCase letter in " + str);
        }else{
            System.out.println(FUL(str,i));
        }
    }
    static char FUL(String str,int i){
        //base condition for recursion
        if(i >= str.length()){
            return ' ';
        }
        // body
        if(Character.isUpperCase(str.charAt(i))){
            return str.charAt(i);
        }
        // recursive call ra
        return FUL(str,i+1);
    }
}

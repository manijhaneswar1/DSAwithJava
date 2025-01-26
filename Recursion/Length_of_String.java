public class Length_of_String {
    public static void main(String[] args) {
        String str="mani";
        System.out.println(LOS(str));
    }
    static int LOS(String str){
        if(str.isEmpty()){
            return 0;
        }
        return LOS(str.substring(1)) + 1;
    }
}

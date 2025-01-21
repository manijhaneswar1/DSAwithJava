public class RepeatedStr {
    public static void main(String[] args) {
        String a="abc";
        String b="wxyz";
        System.out.println(repeatedStringMatch(a,b));
    }
    static int repeatedStringMatch(String a, String b) {
        StringBuilder repeatStr= new StringBuilder();
        int count=0;
        while(repeatStr.length() < a.length() + b.length()){
            repeatStr.append(a);
            count++;
            if(repeatStr.toString().contains(b)){
                return count;
            }
        }
        if(repeatStr.toString().contains(b)){
            return count;
        }
        return -1;
    }
}

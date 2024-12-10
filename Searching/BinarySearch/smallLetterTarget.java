public class smallLetterTarget {
    public static void main(String[] args) {
       char[] letters={'a','b','c'};
        char target='b';
        System.out.println(larThanTarget(letters,target));
    }
    static char larThanTarget(char[] letters,char target){
        char result=letters[0];
        for (int i = 0; i < letters.length; i++) {
            if(letters[i] > target){
                result=letters[i];
                break;
            }
        }
        return result;
    }
}

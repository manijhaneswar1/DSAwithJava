public class noOfStrInSunstrInword {
    public static void main(String[] args) {
        String word="abc";
        String[] strArr={"a","abc","bc","d"};
        System.out.println(numOfStr(strArr,word));
    }
    static int numOfStr(String[] arr,String word){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(word.contains(arr[i])){
                count++;
            }
        }
        return count;
    }
}

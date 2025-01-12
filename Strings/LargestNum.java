public class LargestNum {
    public static void main(String[] args) {
        int[] num={1,2,34,5};
        System.out.println(largestNumber(num));
    }
    static String largestNumber(int[] nums) {
        String[] strArr=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            strArr[i]=String.valueOf(nums[i]);
        }

        //Arrays.sort(strArr,(a, b)-> (b+a).compareTo(a+b));
        for (int a = 0; a < strArr.length; a++) {
            for (int b = 0; b < strArr.length-1-a; b++) {
                String first=strArr[b]+strArr[b+1];
                String second=strArr[b+1]+strArr[b];
                if(second.compareTo(first)>0){
                    String temp=strArr[b];
                    strArr[b]=strArr[b+1];
                    strArr[b+1]=temp;
                }
            }
        }

        if(strArr[0].equals("0")){
            return "0";
        }
        String res="";
        for(String num : strArr){
            res += num;
        }
        return res;
    }
}

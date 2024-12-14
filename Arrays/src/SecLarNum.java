public class SecLarNum {
    public static void main(String[] args) {
        int[] arr={11,2,342,1,22};
        System.out.println(getSecondLargest(arr));
    }
    static int getSecondLargest(int[] arr) {
        int firstLar=Integer.MIN_VALUE;
        int seclar=Integer.MIN_VALUE;
        for(int num : arr){
            if(num>firstLar){
                seclar=firstLar;
                firstLar=num;
            } else if (num<firstLar && num>seclar) {
                seclar=num;
            }
        }
        if(seclar==Integer.MIN_VALUE){
            return -1;
        }
        return seclar;
    }
}

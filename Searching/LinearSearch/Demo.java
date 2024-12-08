public class Demo {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int element=10;
        System.out.println("index of Given Element : " + linearSearch(arr,element));
    }
    static int linearSearch(int[] arr,int element){
        if(arr.length == 0){
            return 0;
        }
        for (int i = 0; i < arr.length; i++) {
            if(element == arr[i]){
                return i;
            }
        }
        return -1;
    }
}

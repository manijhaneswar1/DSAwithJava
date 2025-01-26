public class IS_Arr_Sorted {
    public static void main(String[] args) {
        int[] arr={20, 20, 78, 98, 99, 97};
        int n = 0;
        System.out.println(isSorted(arr,n));
    }
    static boolean isSorted(int[] arr,int n){

        if(n > arr.length) return true;

        for (int i = n; i < arr.length; i++) {
            if(i+1 < arr.length && arr[i] > arr[i+1]){
                return false;
            }
        }
        return isSorted(arr,n+1);
    }
}

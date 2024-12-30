public class ContainsDuplicates {
    public static void main(String[] args) {
        int[] arr={1,3,4,5,2,0,-2};
        System.out.println(isContainDuplicates(arr));
    }
    static boolean isContainDuplicates(int[] arr){
        boolean swap;
        for (int i = 0; i < arr.length; i++) {
            swap=false;
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    swap=true;
                }
            }
            if(!swap){
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(i+1 < arr.length && arr[i] == arr[i+1]){
                return true;
            }
        }
        return false;
    }
}

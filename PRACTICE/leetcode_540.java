public class leetcode_540 {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,4,4,5};
        System.out.println(single_element(arr));
    }
    static int single_element(int[] arr){
        int s = 0;
        int e = arr.length;

        while(s < e){
            int mid = s + (e - s) / 2;
            if(mid % 2 == 0){
                 if(mid + 1 < arr.length && arr[mid] == arr[mid+1]){
                    s = mid + 2;
                }else {
                    e = mid;
                }
            }else {
                if(arr[mid] == arr[mid-1]){
                        s = mid + 1;
                }else {
                        e = mid;
                }
            }
        }
        return arr[s];
    }
}

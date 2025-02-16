public class Single_Element {
    public static void main(String[] args) {
        int[] arr={1,4,2,6,1,2,6};
        System.out.println(single(arr));
        System.out.println(bitMethod(arr));
    }
    static int single(int[] arr){
        for(int i=0;i<arr.length;i++){
            boolean isFlag = false;
            for(int j=0;j<arr.length;j++){
                if(i != j && arr[i] == arr[j]) {
                    isFlag=true;
                    break;
                }
            }
            if(!isFlag) return arr[i];
        }
        return -1;
    }
    static int bitMethod(int[] arr){
        int single = 0;
        for(int num : arr){
            single = single ^ num;
        }
        return single;
    }
}

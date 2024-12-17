public class MinNumInRotatedArrPivot {
    public static void main(String[] args) {
        int[] arr={3,1,2};
        System.out.println(findMin(arr));
    }
    static int findMin(int[] Arr){
        if(Arr.length==1){
            return Arr[0];
        }
        int s=0;
        int e=Arr.length-1;
        //if Arr is not sorted
        if(Arr[s]<Arr[e]){
            return Arr[s];
        }
        while(s < e){
            int mid = s+(e-s)/2;
            if(mid<e && Arr[mid]>Arr[mid+1]){
                return Arr[mid+1]; // here mid+1 is minimum and mid is pivot
            }
            if(mid>s && Arr[mid]<Arr[mid-1]){
                return Arr[mid]; //here mid is minimum and mid+1 is pivot
            }
            if (Arr[s]>=Arr[mid]) {
                e=mid;
            }else{
                s=mid+1;
            }
        }
        return s;
    }
}

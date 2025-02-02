public class Binary_Search {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,55,444,1000};
        int target=77;
        System.out.println(BS(arr,target,0,arr.length-1));
        System.out.println("I LOVE YOU --- TAJ.....");
    }
    static int BS (int[] arr,int target ,int s,int e){
        if(s > e){
            return -1;
        }
        int mid=s + (e - s)/2;
        if(target == arr[mid]){
            return mid;
        }
        if(target < arr[mid]){
            return BS(arr,target,s,mid-1);
        }
        return BS(arr,target,mid+1,e);
    }
}

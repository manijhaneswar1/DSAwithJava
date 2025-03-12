import java.util.ArrayList;

public class linear_search {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5};
        int target = 5;
        System.out.println(linear(arr, target, 0));
        findAllIndexes(arr,target,0);
        System.out.println(list);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(findAllIdxs(arr, target, 0, list));
        System.out.println(findAllI(arr, target, 0));
    }
    // recursive method
    static int linear(int[] arr, int target, int idx){
            if(idx == arr.length) return -1;
           if(arr[idx] == target) {
               return idx;
           }else{
           return linear(arr, target, idx + 1);}
    }
    // finding indexes of all occurrences of target
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndexes(int[] arr, int target, int i){
        if(i == arr.length) return;
        if(arr[i] == target){
            list.add(i);
        }
        findAllIndexes(arr,target,i+1);
    }
    // direct with arrayList
    static ArrayList<Integer> findAllIdxs(int[] arr, int target, int i, ArrayList<Integer> list){
        if(i == arr.length) return list;
        if(arr[i] == target) list.add(i);
        return findAllIdxs(arr, target, i + 1, list);
    }
    // without passing ArrayList in arguments
    static ArrayList<Integer> findAllI(int[] arr, int target, int i){
        ArrayList<Integer> list = new ArrayList<>();
        if(i == arr.length) return list;
        if(arr[i] == target) list.add(i);
        list.addAll(findAllI(arr, target, i+1));
        return list;
    }
}

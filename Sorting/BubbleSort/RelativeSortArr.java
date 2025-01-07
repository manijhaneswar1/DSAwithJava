import java.beans.Introspector;
import java.util.Arrays;

public class RelativeSortArr {
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
        int[] arr2 = {2, 1, 4, 3, 9, 6};
        System.out.println(Arrays.toString(relativeSortArray(arr1, arr2)));
    }

    static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int index = 0;
        int c = 0;
        int[] matchEle = new int[arr1.length];
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]) {
                    matchEle[index++] = arr2[i];
                    c++;
                    arr1[j]= Integer.MIN_VALUE;
                }
            }
        }
        int[] unmatchEle = new int[arr1.length - c];
        int index2 = 0;
        for (int a = 0; a < arr1.length; a++) {
            if(arr1[a] != Integer.MIN_VALUE){
                unmatchEle[index2++]=arr1[a];
            }
        }
        Arrays.sort(unmatchEle);
        int[] res = new int[arr1.length];
        System.arraycopy(matchEle, 0, res, 0, index);
        System.arraycopy(unmatchEle, 0, res, index,unmatchEle.length);

        return res;
    }
}
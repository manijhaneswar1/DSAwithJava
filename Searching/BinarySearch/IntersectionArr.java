import java.util.Arrays;

public class IntersectionArr {
    public static void main(String[] args) {
        int[] arr1={1,2,2,2,3};
        int[] arr2={2,2,3,3,3,4};
        System.out.println(Arrays.toString(intersection(arr1, arr2)));
    }


      static   public int[] intersection(int[] nums1, int[] nums2) {
            //first remove duplicates
            int[] newArr1=removeDuplicates(nums1);
            int[] newArr2=removeDuplicates(nums2);


            int[] tempResult = new int[Math.min(newArr1.length, newArr2.length)];
            int index = 0;
            // Compare common elements in two arrays
            for (int i = 0; i < newArr1.length; i++) {
                for (int j = 0; j < newArr2.length; j++) {
                    if (newArr1[i] == newArr2[j]) {
                        tempResult[index++] = newArr1[i];
                        break; // Break to avoid adding duplicates in the result
                    }
                }
            }
            return Arrays.copyOf(tempResult, index);
        }
       static int[] removeDuplicates(int[] arr){
            int n = arr.length;
            int j = 0;

            for (int i = 1; i < n; i++) {
                boolean isDuplicate = false;
                for (int k = 0; k <= j; k++) {
                    if (arr[i] == arr[k]) {
                        isDuplicate = true;
                        break;
                    }
                }
                if (!isDuplicate) {
                    j++;
                    arr[j] = arr[i];
                }
            }
            return Arrays.copyOf(arr,j+1);
        }
    }

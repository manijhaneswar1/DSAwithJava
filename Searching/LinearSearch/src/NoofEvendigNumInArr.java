package src;

public class NoofEvendigNumInArr {
    public static void main(String[] args) {
        int[] arr={12,2,134,1234};
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            int noofdig=0;
            while(arr[i]>0){
                noofdig++;
                arr[i] /= 10;
            }
            if(noofdig % 2 == 0){
                count++;
            }
        }
        System.out.println("No of Even digits Numbers in Array : " + count);
    }
}

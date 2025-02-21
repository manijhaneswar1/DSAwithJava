public class H_index {
    public static void main(String[] args) {
        int[] arr = {3,0,6,1,5};
        System.out.println(h_idx(arr));
        System.out.println(h_index(arr));
    }
    static int h_idx(int[] citations){
        int papers = citations.length;
        int[] citationBuckets = new int[papers + 1];

        for (int citation : citations) {
            citationBuckets[Math.min(citation, papers)]++;
        }

        int cumulativePapers = 0;
        for (int hIndex = papers; hIndex >= 0; hIndex--) {
            cumulativePapers += citationBuckets[hIndex];
            if (cumulativePapers >= hIndex) {
                return hIndex;
            }
        }
        return 0;
    }
    //brute Force
    static int h_index(int[] arr){
        int h = 0;
        for (int i = 0; i < arr.length; i++) {
            int numOfPapers = 0;
            if(arr[i] > h){
                numOfPapers++;
            }
            if(arr[i] == h){
                numOfPapers = 0;
                i=0;
            }
            h = Math.max(h , numOfPapers);
        }
        return h;
    }
}

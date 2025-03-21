public class leetcode_2240 {
    public static void main(String[] args) {
        System.out.println(waysToBuyPensPencils(37, 6, 6));
    }
    static long waysToBuyPensPencils(long total, long cost1, long cost2) {
        if(cost2 > total || cost1 > total) return 1;
        long ways = 0;
        while(total >= 0){
            ways += total / cost2 + 1;
            total -= cost1;
        }
        return ways;
    }
}

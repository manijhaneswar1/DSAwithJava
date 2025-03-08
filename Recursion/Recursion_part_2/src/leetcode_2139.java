public class leetcode_2139 {
    public static void main(String[] args) {
        System.out.println(fun(19,2,0));
    }
    static int fun(int target , int maxD , int moves){
        if(target == 1){
            return moves;
        }
        if(maxD > 0 && target % 2 == 0 ){
            return fun(target/2 , maxD-1 , moves + 1);
        }else if(maxD > 0 && target % 2 != 0){
            return fun(target-1, maxD , moves + 1);
        }else{
            return moves + (target - 1);
        }
    }
}

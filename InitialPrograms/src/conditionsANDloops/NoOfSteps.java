package conditionsANDloops;

public class NoOfSteps {
    public static void main(String[] args) {
        int num=14;
        System.out.println(numberOfSteps(num));
    }
    static int numberOfSteps(int num) {
        int steps=0;
        while(num!=0){
            if(num%2==0){
                num=num/2;
                steps++;
            }else {
                num=num-1;
                steps++;
            }
        }
        return steps;
    }
}

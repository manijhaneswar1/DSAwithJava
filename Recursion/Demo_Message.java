public class Demo_Message {
    public static void main(String[] args){
       msg();
    }
    static void msg(){
        System.out.println("Hello world");
        msg1();
    }
    static void msg1(){
        System.out.println("Hello world");
        msg2();
    }
    static void msg2(){
        System.out.println("Hello world");
        msg3();
    }
    static void msg3(){
        System.out.println("Hello world");
        msg4();
    }
    static void msg4(){
        System.out.println("Hello world");
    }
}



/*
     Q.
        the question is i want to print "Hello world" 5 times without printing it 5 times and without calling function 5 times
        then ANSWER would be For loop and again i am mentioning do not use loops
        now How to solve it ??
        ANS :-
        I decided to create five functions and call that function inside after one another ( which is hard coding What if i have to create 1000000 "Hello World" messages )
        then Recursion comes to play .......
 */
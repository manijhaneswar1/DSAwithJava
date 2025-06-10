package properties.polymorphism;

public class Numbers {
    int sum(int a, int b){
        return a + b;
    }

    int sum(int a, int b, int c){
        return a + b + c;
    }

    public static void main(String[] args) {
        Numbers add = new Numbers();

        System.out.println(add.sum(1,2));
        System.out.println(add.sum(1,2,3));
    }
}

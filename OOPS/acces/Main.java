package acces;

public class Main {
    public static void main(String[] args) {
        A obj = new A(10, "Mani", new int[]{1,2,3,4,5});
        System.out.println(obj.name);
        System.out.println(obj.getNum());
        System.out.println(obj.setNum(200));
        System.out.println(obj.getNum());
    }
}

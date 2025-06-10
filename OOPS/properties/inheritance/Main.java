package properties.inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box1 = new Box(2.2,3.3,4.4);
//        Box box2 = new Box(box1);
//        System.out.println(box2.width + " " + box2.height + " " + box2.length);

        BoxWeight box3 = new BoxWeight();
        System.out.println(box3.height + " " + box3.weight);

        BoxWeight box4 = new BoxWeight(10.0, 20.0, 30.0, 40.0);
        System.out.println(box4.height + " " + box4.weight + " " + box4.width + " " + box4.length);

        BoxStorage box5 = new BoxStorage(12.0, 33.3, 33.4,55.6,77.8);

        System.out.println(box5.capacity + " " + box5.weight + " " + box5.width + " " + box5.height + " " + box5.length);

    }
}

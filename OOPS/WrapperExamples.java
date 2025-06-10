public class WrapperExamples {
    public static void main(String[] args) {
        // it is not an object
        int a = 10;

        // it is an object of Type Integer, it is known for as Wrapper Class.
        Integer b = new Integer(20);
        System.out.println("a = " + a + " b = " + b + " ");

        // final keyword usage
        final int num = 100;
        System.out.println(num);

        // Class, Object and constructor practice
        car BMW = new car("Mustang", 400, 200000.0f);
        System.out.println(BMW.name + " " + BMW.speed + " " + BMW.price);


        Parnika childOne = new Parnika(1.80f, 80.0f, "Parjhan",21, "Blue", "Black");

        System.out.println(childOne.age);

    }
}

class car {
    String name;
    int speed;
    float price;

    car(){
        // this is a default constructor
        // when we do not have lower Constructor then when Object is created this default
    }

    car(String name, int speed, float price){
        this.name = name;
        this.speed = speed;
        this.price = price;
    }
}

class Parnika {
    float height;
    float weight;
    String name;
    int age;
    String eyeColor;
    String hairColor;



    Parnika(float height, float weight, String name, int age, String eyeColor, String hairColor){
        this.height = height;
        this.weight = weight;
        this.name = name;
        this.age = age;
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;
    }

}

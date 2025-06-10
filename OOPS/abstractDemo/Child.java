package abstractDemo;

public class Child extends Parent {
    @Override
    void career(String name){
        System.out.println("I am a " + name + " and I am a software engineer");
    }
    @Override
    void spouse(String name, int age) {
        System.out.println("Her name is " + name + " and her age is " + age);
    }
}

package abstractDemo;

public abstract class Parent {
    abstract void career(String name);
    abstract void spouse(String name, int age);

    Parent(){
        System.out.println("I am a parent");
    }
}

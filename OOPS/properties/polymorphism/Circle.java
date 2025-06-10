package properties.polymorphism;

public class Circle extends Shapes{
    @Override
    public void area(){
        System.out.println("Area of Circle = pie * r * r");
    }
}

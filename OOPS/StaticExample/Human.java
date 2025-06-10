package StaticExample;


public class Human{
    String name;
    int age;
    int salary;
    boolean isMarried;
    static long population;

    public Human(String name, int age, int salary, boolean isMarried){
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.isMarried = isMarried;
        Human.population++;
    }
}

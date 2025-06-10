package StaticExample;

public class Main {
    public static void main(String[] args) {
        Human mani = new Human("Mani", 21, 8000, false);
        Human Hi = new Human("Hi", 28, 10000, true);

        System.out.println(mani.name + " is Married ? :- " + mani.isMarried);
        System.out.println(Hi.salary);
        System.out.println(mani.population);
    }
}

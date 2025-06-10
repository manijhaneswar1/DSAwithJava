public class introduction {
    public static void main(String[] args) {

        Student s1 = new Student(1,"mani", 99.9f);
        Student s2 = new Student(2,"jhaneswar", 88.8f);


        System.out.println(s1.roll);
        System.out.println(s2.name);

        Student random = new Student();
        System.out.println(random.name);

    }
}
class Student {
    int roll;
    float marks;
    String name;

    // default Constructor

    Student(){
        this(1,"Default Person",0.0f);
    }

    // initialized Constructor
    Student(int rollno, String name, Float marks){
        this.roll = rollno;
        this.name = name;
        this.marks = marks;
    }

}

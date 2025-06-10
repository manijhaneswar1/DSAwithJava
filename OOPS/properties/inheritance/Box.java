package properties.inheritance;

public class Box {
    double width;
    double height;
    double length;

    Box(){
        this.width = -1;
        this.height = -1;
        this.length = -1;
    }

    // cube
    Box(double side){
        this.width = side;
        this.height = side;
        this.length = side;
    }

    // all argurments
    Box(double width, double height, double length){
        this.width = width;
        this.height = height;
        this.length = length;
    }

    // obj inside obj
    Box(Box other){
        this.width = other.width;
        this.height = other.height;
        this.length = other.length;
    }

    // function
    public void information(){
        System.out.println("Box is running");
    }
}

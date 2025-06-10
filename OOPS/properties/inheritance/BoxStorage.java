package properties.inheritance;

public class BoxStorage extends BoxWeight {
    double capacity;

    BoxStorage(){
        this.capacity = +1;
    }

    // all arguments
    BoxStorage(double capacity, double weight, double width, double height, double length){
        super(weight,width,height,length);
        this.capacity = capacity;
    }
}

package properties.inheritance;

public class BoxWeight extends Box{
    double weight;

    BoxWeight(){
        this.weight = -1;
    }

    // all arguments
    BoxWeight(double weight, double width, double height, double length){
        super(width, height, length);
        this.weight = weight;
    }
}

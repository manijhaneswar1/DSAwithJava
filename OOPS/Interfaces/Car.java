package Interfaces;

public class Car implements Engine, Brake, Media {
    @Override
    public void start() {
        System.out.println(PRICE);
        System.out.println("Car is starting");
    }
    @Override
    public void stop() {
        System.out.println("Car is stopping");
    }
    @Override
    public void brake() {
        System.out.println("Car is braking");
    }
    @Override
    public void accelerate() {
        System.out.println("Car is accelerating");
    }

}

abstract class Vehicle {
    abstract void startEngine();
    void stopEngine(){
        System.out.println("Engine stopped");
    }
}
class Car extends Vehicle{

    @Override
    void startEngine() {
        System.out.println("car engine started");
    }
}
class Bike extends Vehicle{

    @Override
    void startEngine() {
        System.out.println("Bike engine started");
    }
}
public class Practice{
    public static void main(String[] args){
        Car carObj = new Car();
        Bike bikeObj = new Bike();

        carObj.startEngine();
        carObj.stopEngine();

        bikeObj.startEngine();
        bikeObj.stopEngine();
    }
}

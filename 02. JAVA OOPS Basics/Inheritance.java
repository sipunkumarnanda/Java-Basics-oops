
// Base class 
class Vehicle {
    String numberOfVehicle;

    public Vehicle(String numberOfVehicle) {
        this.numberOfVehicle = numberOfVehicle;
    }

    public void honk() {
        System.out.println("Honk!!!!!!!");
    }

    public void printNumberOfVehicle() {
        System.out.println("Vehicle Number : " + this.numberOfVehicle);
    }
}

// Derived classes
class Car extends Vehicle {
    // private String numberOfVehicle;

    public Car(String numberOfVehicle) {
        // this.numberOfVehicle = numberOfVehicle;
        super(numberOfVehicle);
    }

    // public void getCarNumber(){
    // System.out.println("car number : " + this.vehicleNumber);
    // }

    // public void honk(){
    // System.out.println("Honk!!!!!!!");
    // }

}

class Bus extends Vehicle {
    // private String numberOfVehicle;

    public Bus(String numberOfVehicle) {
        // this.numberOfVehicle = numberOfVehicle;
        super(numberOfVehicle);
    }

    // public void getBusNumber(){
    // System.out.println("bus number : " + this.vehicleNumber);
    // }

    // public void honk(){
    // System.out.println("Honk!!!!!!!");
    // }
}

public class Inheritance {
    public static void main(String[] args) {
        Car car = new Car("OD01A1234");
        car.printNumberOfVehicle();
        car.honk();

        Bus bus = new Bus("OD02A1234");
        bus.printNumberOfVehicle();
        bus.honk();
    }
}


// Base class (Parent class)
class Vehicle {
    String numberOfVehicle;

    // Constructor to initialize vehicle number
    public Vehicle(String numberOfVehicle) {
        this.numberOfVehicle = numberOfVehicle;
    }

    // Method that can be overridden by child classes
    public void honk() {
        System.out.println("Honk!!!!!!!");
    }

    // Common method for all vehicles
    public void printNumberOfVehicle() {
        System.out.println("Vehicle Number : " + this.numberOfVehicle);
    }
}


// Derived class (Child class)
class Car extends Vehicle {

    public Car(String numberOfVehicle) {
        super(numberOfVehicle); // Constructor calling parent constructor using super
    }

    // Method overriding (Runtime Polymorphism)
    // This method changes the behavior of the parent class method
    @Override
    public void honk() {
        System.out.println("Give me way honk honk honk !!!!!!");
    }
}



class Bus extends Vehicle {
    public Bus(String numberOfVehicle){
        super(numberOfVehicle);
    }
}



class Polymorphism {
    public static void main(String[] args) {

        Car car = new Car("OD01A12345");
        car.printNumberOfVehicle();
        car.honk();

        Bus bus = new Bus("OD02A1234");
        bus.printNumberOfVehicle();
        bus.honk();
    }
}
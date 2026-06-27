
// Example: Without Inheritance

class Car {
    private String numberOfVehicle;

    public Car(String numberOfVehicle) {
        this.numberOfVehicle = numberOfVehicle;
    }

    public void getCarNumber(){
    System.out.println("car number : " + this.numberOfVehicle);
    }

    public void honk(){
    System.out.println("Honk!!!!!!!");
    }

}

class Bus  {
    private String numberOfVehicle;

    public Bus(String numberOfVehicle) {
        this.numberOfVehicle = numberOfVehicle;
    }

    public void getBusNumber(){
    System.out.println("bus number : " + this.numberOfVehicle);
    }

    public void honk(){
    System.out.println("Honk!!!!!!!");
    }
}

public class Inheritance1 {
    
    public static void main(String[] args) {
        Car car = new Car("OD01A1234");
        car.getCarNumber();
        car.honk();

        Bus bus = new Bus("OD02A1234");
        bus.getBusNumber();
        bus.honk();
    }
}



/*
 * Example: Without Inheritance
 *
 * Problem:
 * - Both Car and Bus classes contain duplicate code.
 * - The vehicle number field is repeated in both classes.
 * - The honk() method is also repeated in both classes.
 * - This violates the DRY (Don't Repeat Yourself) principle.
 *
 * Why Inheritance is Needed:
 * - Common properties and behaviors can be moved to a parent class (Vehicle).
 * - Car and Bus can inherit from Vehicle.
 * - Code duplication is reduced.
 * - Maintenance becomes easier because shared code exists in one place.
 *
 * In this example:
 * - numberOfVehicle is duplicated in Car and Bus.
 * - honk() is duplicated in Car and Bus.
 * - Only the methods displaying vehicle-specific information differ.
 */
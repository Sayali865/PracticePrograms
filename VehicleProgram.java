//Write a Java program to create a class called Vehicle with a method called drive(). Create a subclass called Car that overrides the drive() method to print "Repairing a car".

package classprograms;

// Vehicle class with a drive method
class Vehicle {
    public void drive() {
        System.out.println("Repairing a vehicle");
    }
}

// Car1 class that inherits from Vehicle and overrides the drive method
class Car1 extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Repairing a car");
    }
}

// class to run the program
public class VehicleProgram {

	//Main method
    public static void main(String[] args) 
    {
        // Create object of Vehicle
        Vehicle vehicle = new Vehicle();
        
        // Create object of Car1
        Car1 car = new Car1();
        
        // Call the drive method using vehicle class object
        
        vehicle.drive(); // This will print "Repairing a vehicle"
        
        // Call the drive method using vehicle class object.
        
        car.drive(); // This will print "Repairing a car"
    }

}

/*dry run
 The main method is called to start the program execution.
 Vehicle vehicle = new Vehicle(); -  This line creates a new instance of the Vehicle class and assigns it to the variable vehicle. 
 Car1 car = new Car1(); - This line creates a new instance of the Car1 class and assigns it to the variable car.
 vehicle.drive(); -  Since vehicle is of type Vehicle, it calls the drive method defined in the Vehicle class. This will print "Repairing a vehicle".
 car.drive(); -  Since car is of type Car1, it calls the overridden drive method defined in the Car1 class. This will print "Repairing a car".
 
 
 */

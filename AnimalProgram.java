// Define the base package for the class
package classprograms;

// Animall class with a move method
class Animall {
    // Method to print a generic animal movement message
    public void move() {
        System.out.println("Animal moves");
    }
}

// Cheetah class that inherits from Animall
class Cheetah extends Animall {
    // Override the move method to provide a specific implementation for cheetah
    @Override
    public void move() {
        System.out.println("Cheetah runs");
    }
}

// class to run the program
public class AnimalProgram {
	
    public static void main(String[] args) {
    	
        // Create an object of Animall
        Animall animal = new Animall();
        
        // Call the move method on the animal instance
        animal.move(); // This will print "Animal moves"
        
        // Create an object of Cheetah
        Cheetah cheetah = new Cheetah();
        
        // Call the move method on the cheetah instance
        cheetah.move(); // This will print "Cheetah runs"
  }
}


/*dry run
 
 The main method is called to start the program execution.
 An instance of the Animall class is created and assigned to the variable animal.
 The move() method is called on the animal instance. - prints animal moves
 An instance of the Cheetah class is created and assigned to the variable cheetah.
 The move() method is called on the cheetah instance. - prints cheetah run
 
 */

package classprograms;

// Animal class with a makeSound method
class Animal {
    // Method to print a animal sound message
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Cat class that inherits from Animal
class Cat extends Animal {
    // Override the makeSound method to provide a specific implementation for cat
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

//  class to run the program
public class AnimalSoundProg {
    public static void main(String[] args) {
        // Create an object of Animal
        Animal animal = new Animal();
        
        // Call the makeSound method on the animal instance
        animal.makeSound(); // This will print "Animal makes a sound"
        
        // Create an object of Cat
        Cat cat = new Cat();
        // Call the makeSound method on the cat instance
        cat.makeSound(); // This will print "Cat meows"
    }
}

/*Dry run
 
  The main method is called to start the program execution.
  An instance of the Animal class is created and assigned to the variable animal.
  The makeSound() method is called on the animal instance. - prints animal make a sound
  An instance of the Cat class is created and assigned to the variable cat.
  The makeSound() method is called on the cat instance. - prints cat meows.
  
  */

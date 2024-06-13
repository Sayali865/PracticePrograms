//Write a Java program to create a class called Shape with a method called getArea(). Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle.

package classprograms;

// Shape class with a method getArea that returns 0
class Shape {
    public double getArea() {
        return 0;
    }
}

//  Rectangle class that inherits from Shape
class Rectangle extends Shape {
	
    // Private member variables for length and width
    private double length;
    private double width;

    // Constructor to initialize length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Override the getArea method to return the area of the rectangle
    @Override
    public double getArea() {
        return length * width;
    }
}

//class to run the program
public class RectAreaProgram {
	
	// Main Method
    public static void main(String[] args) 
    {
        // Create an object of the class  Rectangle with length 5 and width 10 passing values 
        Rectangle rectangle = new Rectangle(5, 10);
        
        // Call the getArea method on the rectangle instance and store the result in the area variable
        double area = rectangle.getArea();
        
        // Print the area of the rectangle
        System.out.println("Area of the rectangle: " + area);
    }
}


/*dry run 

  The main method is called to start the program execution.
  An instance of the Rectangle class is created with length 5 and width 10 
  calling the constructor new Rectangle(5, 10).
  The constructor initializes the length and width member variables.
  The getArea() method is called on the rectangle using rectangle call object  i.e. rectangle
  The overridden getArea() method calculates the area by multiplying length (5) by width (10)
  caluculated value stored in area  then prints 
  area of the rectangle  - 50.0
 
 
 */
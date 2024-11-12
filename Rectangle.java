package rectangle;
// Package Name

// Class Declaration
public class Rectangle {

    // Attributes with default values
    private double length = 1.0;
    private double width = 1.0;

    // Constructor with default values
    public Rectangle() {}

    // Constructor with parameters
    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    // Getters
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    // Setters with validation
    public void setLength(double length) {
        if (isValidDimension(length)) {
            this.length = length;
        } else {
            throw new IllegalArgumentException("Length must be > 0.0 and < 20.0");
        }
    }

    public void setWidth(double width) {
        if (isValidDimension(width)) {
            this.width = width;
        } else {
            throw new IllegalArgumentException("Width must be > 0.0 and < 20.0");
        }
    }

    // Private helper method to validate dimensions
    private boolean isValidDimension(double value) {
        return value > 0.0 && value < 20.0;
    }

    // Method to calculate the perimeter
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    // Method to calculate the area
    public double calculateArea() {
        return length * width;
    }

    // Main method to test the Rectangle class
    public static void main(String[] args) {
        // Create a Rectangle object with valid dimensions
        Rectangle rectangle = new Rectangle(5.5, 3.2);

        // Display initial values
        System.out.println("Initial Rectangle Properties:");
        displayRectangleInfo(rectangle);

        // Update dimensions and display new values
        rectangle.setLength(10.0);
        rectangle.setWidth(8.5);

        System.out.println("\nUpdated Rectangle Properties:");
        displayRectangleInfo(rectangle);
    }

    // Helper method to display rectangle information
    private static void displayRectangleInfo(Rectangle rectangle) {
        System.out.printf("Length: %.2f\n", rectangle.getLength());
        System.out.printf("Width: %.2f\n", rectangle.getWidth());
        System.out.printf("Perimeter: %.2f\n", rectangle.calculatePerimeter());
        System.out.printf("Area: %.2f\n", rectangle.calculateArea());
    }
}


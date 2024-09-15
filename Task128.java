public class Task128 {
    public static void main(String[] args) {
        // Create a Circle
        Circle circle = new Circle("Red", 5.0);
        System.out.println("Circle:");
        System.out.println("Color: " + circle.color);
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());

        // Create a Rectangle
        Rectangle rectangle = new Rectangle("Blue", 4.0, 6.0);
        System.out.println("\nRectangle:");
        System.out.println("Color: " + rectangle.color);
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
    }
}

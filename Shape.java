public interface Shape {
    double calculateArea();
    double calculatePerimeter();
}





public class Rectangle extends AbstractShape {

    // Constructor
    public Rectangle(String color, double length, double width) {
        super(color, length, width);
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}


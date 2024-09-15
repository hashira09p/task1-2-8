public class Circle extends AbstractShape {
    private double radius;

    // Constructor
    public Circle(String color, double radius) {
        super(color, radius, 0); // width is not used in Circle
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

public abstract class AbstractShape implements Shape {
    protected String color;
    protected double length;
    protected double width;

    // Constructor to initialize attributes
    public AbstractShape(String color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }

    @Override
    public abstract double calculateArea();

    @Override
    public abstract double calculatePerimeter();
}
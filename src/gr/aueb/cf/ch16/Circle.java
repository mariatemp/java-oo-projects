package gr.aueb.cf.ch16;

/**
 * Represents a circle that extends {@code AbstractShape}
 * and implements {@code ITwoDimensional}.
 */
public class Circle extends AbstractShape implements ICircle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getDiameter() {
        return 2 * radius;
    }

    /**
     * Calculates and returns the area of the circle.
     *
     * @return  The area of the circle.
     */
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    /**
     *  Calculates and returns the circumference of the circle.
     *
     * @return  The circumference of the circle.
     */
    @Override
    public long getCircumference() {
        return (long) (2 * Math.PI * radius);
    }
}

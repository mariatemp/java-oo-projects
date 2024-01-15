package gr.aueb.cf.ch16;

/**
 * Represents a rectangle that extends {@code AbstractShape}
 * and implements {@code ITwoDimensional}.
 */
public class Rectangle extends AbstractShape implements IRectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /**
     * Calculates and returns the area of the rectangle.
     *
     * @return  The area of the rectangle.
     */
    @Override
    public double getArea() {
        return width * height;
    }


    /**
     * Calculates and returns the circumference of the rectangle.
     *
     * @return  The circumference of the rectangle.
     */
    @Override
    public long getCircumference() {
        return (long) (2 * (width * height));
    }
}

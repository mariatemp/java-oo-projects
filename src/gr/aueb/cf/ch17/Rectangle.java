package gr.aueb.cf.ch17;

import com.sun.source.doctree.SerialDataTree;

import java.io.Serializable;

/**
 * Represents a rectangle that extends {@code AbstractShape}
 * and implements {@code ITwoDimensional}.
 */
public class Rectangle extends AbstractShape implements IRectangle, Cloneable, Serializable {
    private static final long serialVersionUID = 230124L;
    private double width;
    private double height;

    public Rectangle(AbstractShape other, double width, double height) {
        super(other);
        this.width = width;
        this.height = height;
    }

    public Rectangle(Rectangle other) {
        super(other);
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Rectangle rectangle = (Rectangle) o;

        if (Double.compare(width, rectangle.width) != 0) return false;
        return Double.compare(height, rectangle.height) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(width);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

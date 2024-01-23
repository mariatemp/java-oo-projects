package gr.aueb.cf.ch17;

import java.io.Serializable;

/**
 * Represents a circle that extends {@code AbstractShape}
 * and implements {@code ITwoDimensional}.
 */
public class Circle extends AbstractShape implements ICircle, Cloneable, Serializable {
    private static final long serialVersionUID = 20240123L;
    private double radius;

    public Circle(AbstractShape other, double radius) {
        super(other);
        this.radius = radius;
    }

    public Circle(Circle other) {
        super(other);
        this.radius = other.radius;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Circle circle = (Circle) o;

        return Double.compare(radius, circle.radius) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(radius);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}

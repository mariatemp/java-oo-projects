package gr.aueb.cf.ch17;

import java.io.Serializable;

/**
 * Represents a line that extends {@code AbstractShape}.
 */
public class Line extends AbstractShape implements ILine, Cloneable, Serializable {
    private static final long serialVersionUID = 23012024L;
    private double length;

    public Line(AbstractShape other, double length) {
        super(other);
        this.length = length;
    }


    public Line(Line other) {
        super(other);
        this.length = other.length;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Line line = (Line) o;

        return Double.compare(length, line.length) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(length);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}

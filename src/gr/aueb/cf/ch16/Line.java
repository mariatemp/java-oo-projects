package gr.aueb.cf.ch16;

/**
 * Represents a line that extends {@code AbstractShape}.
 */
public class Line extends AbstractShape implements ILine {
    private double length;

    public Line(double length) {
        this.length = length;
    }
}

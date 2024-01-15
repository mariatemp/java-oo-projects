package gr.aueb.cf.ch15;

/**
 * Represents a point in a two-dimensional space with y-coordinate.
 */
public class Point2D extends Point {
    private double y;

    public Point2D() {
        super();
        y = 0.0;
    }

    public Point2D(double y) {
        this.y = y;
    }

    public Point2D(double x, double y) {
        super(x);
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    /**
     * Returns a string representation of the 2D point.
     * @return  A string in the format "(x, y)".
     */
    @Override
    public String toString() {
        return super.toString() + "(" + y + ")";
    }

    @Override
    public String convertToString() {
        return super.convertToString() + "(" + y + ")";
    }

    /**
     * Moves the 2D point by adding 10 to its x-coordinate and y-coordinate.
     */
    @Override
    public void movePlus10() {
        super.movePlus10();
        y += 10;
    }

    /**
     * Moves the 2D point by adding 1 to its x-coordinate and y-coordinate.
     */
    @Override
    protected void movePlusOne() {
        super.movePlusOne();
        y += 1;
    }

    /**
     * Calculates and returns the distance of the 2D point
     * from the origin using the Pythagorean theorem.
     * @return  The distance from the origin.
     */
    @Override
    public double getDistanceFromOrigin() {
        return Math.sqrt(Math.pow(getX(), 2) + Math.pow(y, 2));
    }
}

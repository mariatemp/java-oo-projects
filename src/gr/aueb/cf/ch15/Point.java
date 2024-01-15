package gr.aueb.cf.ch15;

/**
 * Represents a point in a two-dimensional space.
 */
public class Point {
    private double x;

    public Point() {

    }

    public Point(double x) {

    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public String convertToString() {
        return "(" + x + ")";
    }

    /**
     * Returns a string representation of the point.
     * @return  A string in the format "(x)".
     */
    @Override
    public String toString() {
        return super.toString() + "(" + x + ")";
    }

    /**
     * Moves the point by adding 10 to its x-coordinate.
     */
    public void movePlus10() {
        for (int i = 1; i <= 10; i++) {
            movePlusOne();
        }
    }

    /**
     * Moves the point by adding 1 to its x-coordinate.
     */
    protected void movePlusOne() {
        x += 1;
    }

    protected void printTypeOf() {
        System.out.println(this.getClass().getSimpleName());
    }

    private void reset() {
        x = 0;
    }

    /**
     * Calculates and returns the distance of the point from the origin.
     * @return  The distance from the origin
     */
    public double getDistanceFromOrigin() {
        return Math.abs(x);
    }
}
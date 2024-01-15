package gr.aueb.cf.ch15;

/**
 * Represents a point in a three-dimensional space.
 */
public class Point3D extends Point2D {
    private double z;

    public Point3D() {

    }

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    /**
     * Returns a string representation of the 3D point.
     * @return  A string in the format "(x, y, z)".
     */
    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ", " + getZ() + ")";
    }

    @Override
    public String convertToString() {
        return super.convertToString() + "(" + getZ() + ")";
    }

    /**
     * Moves the 2D point by adding 10 to its x-coordinate, y-coordinate and z-coordinate.
     */
    @Override
    public void movePlus10() {
        super.movePlus10();
        z += 10;
    }

    /**
     * Moves the 2D point by adding 1 to its x-coordinate, y-coordinate and z-coordinate.
     */
    @Override
    protected void movePlusOne() {
        super.movePlusOne();
        z += 1;
    }

    /**
     * Calculates and returns the distance of the 3D point
     * from the origin using the Pythagorean theorem in three dimensions.
     * @return
     */
    @Override
    public double getDistanceFromOrigin() {
        return Math.sqrt(Math.pow(getX(), 2) + Math.pow(getY(), 2) + Math.pow(z, 2));
    }
}

package gr.aueb.cf.ch15;

/**
 * Provides a polymorphic method for calculating
 * the distance from the origin.
 */
public class PointUtil {

    /**
     * Calculates and returns the distance from the origin to a given Point.
     * The method is polymorphic and works with Point, Point2D, and Point3D objects.
     * @param point The Point object.
     * @return      The distance from the origin.
     */
    public static double distanceFromOrigin(Point point) {
        return point.getDistanceFromOrigin();
    }
}

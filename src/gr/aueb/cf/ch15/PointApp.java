package gr.aueb.cf.ch15;

public class PointApp {

    public static void main(String[] args) {
        Point p = new Point();
        Point p2 = new Point2D(3.0, 4.0);
        Point p3 = new Point3D(3.0, 4.0, 5.0);

        p2.movePlusOne();

        p3.movePlus10();

        ((Point2D) p2).setY(5);

        System.out.println(p);

        doMovePlus10(p);
        doMovePlus10(p2);
        doMovePlus10(p3);

        System.out.println("Distance from origin - Point p: " + PointUtil.distanceFromOrigin(p));
        System.out.println("Distance from origin - Point2D p2: " + PointUtil.distanceFromOrigin(p2));
        System.out.println("Distance from origin - Point3D p3: " + PointUtil.distanceFromOrigin(p3));
        }

    public static void doMovePlus10(Point point) {
            point.movePlus10();
        }
}

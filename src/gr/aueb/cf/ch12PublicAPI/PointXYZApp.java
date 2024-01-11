package gr.aueb.cf.ch12PublicAPI;

/**
 * Demonstrate the usage of the {@link PointXYZ} class.
 */
public class PointXYZApp {

    public static void main(String[] args) {
        PointXYZ p1 = new PointXYZ(1, 2, 3);
        PointXYZ p2 = new PointXYZ(4, 5, 6);

        System.out.println("Point 1: " + p1.convertToString());
        System.out.println("Point 2: " + p2.convertToString());
    }
}


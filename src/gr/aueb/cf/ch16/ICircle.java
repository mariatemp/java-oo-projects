package gr.aueb.cf.ch16;

import gr.aueb.cf.ch15.PointUtil;

/**
 * Represents a circle, inheriting and
 * extending the properties
 * of {@code IShape} and {@code ITwoDimensional}.
 */
public interface ICircle extends IShape , ITwoDimensional {
    public double getDiameter();
}

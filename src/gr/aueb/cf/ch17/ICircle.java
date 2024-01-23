package gr.aueb.cf.ch17;

/**
 * Represents a circle, inheriting and
 * extending the properties
 * of {@code IShape} and {@code ITwoDimensional}.
 */
public interface ICircle extends IShape, ITwoDimensional {
    public double getDiameter();
}

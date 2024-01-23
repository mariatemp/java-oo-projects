package gr.aueb.cf.ch17;

import java.io.Serializable;
import java.util.Objects;

/**
 * Implements the {@code IShape} interface.
 * It provides a basic implementation for the identifier.
 */
abstract class AbstractShape implements IShape, Cloneable, Serializable {
    private static final long serialVersionUID = 01232024L;
    private long id;

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AbstractShape that = (AbstractShape) o;

        return id == that.id;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public AbstractShape(AbstractShape other) {
        this.id = other.id;
    }
}


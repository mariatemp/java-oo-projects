package gr.aueb.cf.ch16;

/**
 * Implements the {@code IShape} interface.
 * It provides a basic implementation for the identifier.
 */
abstract class AbstractShape implements IShape {
    private long id;

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public long getId() {
        return id;
    }
}

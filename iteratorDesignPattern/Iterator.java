package iteratorDesignPattern;

public interface Iterator <E> {
    E next();
    E current();
    boolean hasNext();
    void reset();
}

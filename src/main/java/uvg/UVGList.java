package uvg;

public interface UVGList<T> {
    public void addLast(T value);
    public UVGNode<T> getLast();
    public void removeLast();
    public boolean isEmpty();

}

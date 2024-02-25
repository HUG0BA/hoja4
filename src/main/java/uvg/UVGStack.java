package uvg;

public interface UVGStack<T> {
    public void push(T value);
    public T pop();
    public T top();
    public boolean isEmpty();

}   

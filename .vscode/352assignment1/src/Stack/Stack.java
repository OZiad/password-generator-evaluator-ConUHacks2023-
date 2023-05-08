package Stack;
public interface Stack<T> {
    public int size();

    public boolean isEmpty();

    T top();

    public void push(T element);

    public T pop();
}
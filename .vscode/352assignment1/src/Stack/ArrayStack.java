package Stack;
public class ArrayStack<T> implements Stack <T>{
    private static final int CAPACITY = 1000;
    private T[] stack;
    private int head = -1;

    public ArrayStack(){
        this(CAPACITY);
    }

    @SuppressWarnings("unchecked")
    public ArrayStack(int size){
        stack = (T[]) new Object[size];
    }
    @Override
    public int size() {
        return stack.length;
    }

    @Override
    public boolean isEmpty() {
        return (head == -1);
    }

    @Override
    public T top() {
        return stack[head];
    }

    @Override
    public void push(T element) {
        if(head+1 >= stack.length){
            return;
        }
        head = head+1;
        stack[head] = element;
    }

    @Override
    public T pop() {
        T temp = stack[head];
        stack[head] = null;
        head--;
        return temp;

    }
    public static void main(String args[]) {
        char c = '1';
        float f = (float) c;
        System.out.println("First line:" +f);
        Stack<Integer> S = new ArrayStack<>();
        S.push(5);
        S.push(3);
        System.out.println(S.size());
        System.out.println(S.pop());
        System.out.println(S.isEmpty());
        System.out.println(S.pop());
        System.out.println(S.isEmpty());
        System.out.println(S.pop());
        S.push(7);
        S.push(9);
        System.out.println(S.top());
        S.push(4);
        System.out.println(S.size());
        System.out.println(S.pop());
        S.push(6);
        S.push(8);
        System.out.println(S.pop());
        // contents: ()
        // contents: (5)
        // contents: (5, 3)
        // contents: (5, 3) outputs 2
        // contents: (5) outputs 3
        // contents: (5)outputs false
        // contents: ()outputs 5
        // contents: ()outputs true
        // contents: () outputs null
        // contents: (7)
        // contents: (7, 9)
        // contents: (7, 9)outputs 9
        // contents: (7, 9, 4)
        // contents: (7, 9, 4) outputs 3
        // contents: (7, 9) outputs 4
        // contents: (7, 9, 6)
        // contents: (7, 9, 6, 8)
        // contents: (7, 9, 6) outputs 8

    }
}
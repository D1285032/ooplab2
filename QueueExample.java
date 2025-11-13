import java.util.LinkedList;

class MyQueue<T> extends LinkedList<T> {

    public void enqueue(T item) {
        this.addLast(item);
    }

    public T dequeue() {
        return this.removeFirst();
    }

    @Override
    public boolean isEmpty() {
        return super.isEmpty();
    }

    @Override
    public int size() {
        return super.size();
    }
}

public class QueueExample {
    public static void main(String[] args) {
        MyQueue<Integer> intQueue = new MyQueue<>();
        //do some test if needed
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

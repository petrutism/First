package repeating.one.counter;

public class Main {
    public static void main(String[] args) {
        Counter child = new Child(0);
        child.increment();
        child.increment();
        child.increment();
        child.increment();
    }
}

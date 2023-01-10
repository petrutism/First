package repeating.one.counter;

class Child extends Counter{
    Child(int i) {
        super(i);
    }

    @Override
    void increment() {
        super.increment();
        System.out.println(super.i);
    }
}

package inheritance.polimorphism.taskTwo;

class XABMain {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        a.setX(new X());
        a.getX().methodX();
        b.methodX();
    }
}

package inheritance;

public class ChildClass extends ParentClass {

    public static void main(String[] args) {
        //ChildClass child =new ChildClass();
        ParentClass child = new ChildClass();
        child.print();
        child.secondPrint();
        System.out.println(child.sum(50, 100));

    }

    public void print() {
        super.print();
        System.out.println("Private print from child");
    }

    public int sum(int a, int b) {
        return super.sum(a, b) * 5;
    }
}

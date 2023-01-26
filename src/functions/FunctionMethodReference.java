package functions;

@FunctionalInterface
interface MyFunction {
    String sayHi(String text);
}

interface MyNonFunction {
    String sayHi(String text);
}

public class FunctionMethodReference {
    public static void main(String[] args) {
        FunctionMethodReference reference = new FunctionMethodReference();
        MyFunction myFunction = reference::myStringMethod;
        MyNonFunction myNonFunction = reference::myStringMethod;

        System.out.println(myFunction.sayHi("Labas "));

        System.out.println(myNonFunction.sayHi("Labas nonFunction "));
    }

    private String myStringMethod(String text) {
        return "My string method " + text;
    }
}

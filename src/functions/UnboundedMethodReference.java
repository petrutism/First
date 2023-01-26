package functions;

class TestClass{
    public String testMethod (String value){
        return "Labas testMethod " + value;
    }

    public static String secondTestMEthod (String value){
        return "Second method " + value;
    }
}

interface Transform {
    String transform(TestClass testClass, String value);

    default String testDefaultTransformMethod(String value){
        return "transform default value " + value;
    };
}

interface SecondTransform {
    String getValue (String value);
}
public class UnboundedMethodReference {
    public static void main(String[] args) {
        Transform transform = TestClass::testMethod;
        System.out.println(transform.testDefaultTransformMethod("Test value"));

        TestClass testClass = new TestClass();
        System.out.println(transform.transform(testClass, "Test second value"));
        System.out.println(testClass.testMethod("example"));

        SecondTransform secondTransform = testClass :: testMethod;
        System.out.println(secondTransform.getValue("Kazkas naujo??"));

        SecondTransform secondTransform1 = TestClass:: secondTestMEthod;
        System.out.println(secondTransform1.getValue(":)"));

    }
}

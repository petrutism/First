package functions;

import java.util.function.Function;
import java.util.function.Predicate;

public class CompositionFunctionExample {
    public static void main(String[] args) {

        Function<String, String> function = text -> text.substring(8),
                function1 = text -> text.replace("a", "%"),
                function2 = String::toUpperCase,
                function3 = function.compose(function1).andThen(function2);

        System.out.println(function3.apply("mano vardas yra Andrius"));

        Predicate<String> p = email -> email != null,
                p1 = email -> email.contains("@"),
                p2 = email -> email.endsWith(".com"),
                p3 = email -> email.length() >= 10,
                p4 = p.and(p1).and(p2).and(p3);

        System.out.println(p4.test(null));
        System.out.println(p4.test("null"));
        System.out.println(p4.test("asfafdad@ddd.lt"));
        System.out.println(p4.test("asfafdad@ddd@ddd.com"));
    }

}

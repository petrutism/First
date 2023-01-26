package functions;

import java.util.function.*;

public class FunctionExample {
    public static void main(String[] args) {

        //Supplier -> nepriima aparametru, grazina rezultata...
        Supplier<Integer> supplier = () -> 50;

//        Supplier<Integer> supplier = () -> {
//            int number = 50;
//            return number;
//        };

        System.out.println(supplier.get());

        FunctionExample functionExample = new FunctionExample();
        functionExample.testSupplier(supplier);
        functionExample.testSupplier(() -> 70);

        Consumer<String> consumer = value -> System.out.println(value.toUpperCase());
        consumer.accept("mama");
        Consumer<String> consumer1 = System.out::println;
        consumer1.accept("Laba diena");

        Function<String, Integer> function = text -> text.length() * 10;

        int result = function.apply("testukas");
        System.out.println(result);

        Predicate<String> predicate = text -> text != null && !text.isBlank() && text.startsWith("test");

        if (predicate.test("testukas")) {
            System.out.println("Teisinga...");
        } else {
            System.out.println("Neteisinga...");
        }

        IntConsumer intConsumer = System.out::println;
        intConsumer.accept(50000);

        BiConsumer<String, Integer> biConsumer = (val1, val2) -> System.out.println(val1 + " -> " + val2);
        biConsumer.accept("String", 100);

        BiPredicate<String, String> biPredicate = (text1, text2) -> text1 != null && text1.equals(text2);
        System.out.println(biPredicate.test("Labas", "Labas"));

        BiFunction<Integer, Integer, String> biFunction = (numb1, numb2) -> String.valueOf(numb1 * numb2);
        System.out.println(biFunction.apply(10, 20));

        TripleIntConsumer tripleIntConsumer = (a, b, c) -> System.out.println(a + b + c);

        functionExample.getTripleIntConsumer().triple(50, 700, 40);
        TripleIntConsumer tripleConsumer1 = functionExample.getTripleIntConsumer();
        functionExample.testTripleConsumer(tripleConsumer1);

//        BiFunction <Integer, Integer, Integer> sum = (a, b) -> {
//            int res = a + b;
//            return res;
//        };
//

        BiFunction<Integer, Integer, Integer> sum = functionExample::sum;
        System.out.println(sum.apply(1000, 1000));
    }

    private int sum(int a, int b){
        return a + b;
    }

    private void testSupplier(Supplier<Integer> supplier) {
        System.out.println(supplier.get());
    }
    private TripleIntConsumer getTripleIntConsumer (){
        return (a, b, c) -> System.out.println(a * c -b);
    }
    private void testTripleConsumer (TripleIntConsumer tripleIntConsumer){
        tripleIntConsumer.triple(50, 10, 70);
    }
}

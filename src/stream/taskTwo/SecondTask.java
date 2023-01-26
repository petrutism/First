package stream.taskTwo;

import java.util.List;
import java.util.function.Function;


public class SecondTask {
    public static void main(String[] args) {
        SecondTask task = new SecondTask();
        Function<List<String>, List<String>> sortFunction = task.sortFunction();
    }

    private void callFunction(Function<List<String>, List<String>> function, List<String> items) {
        items = function.apply(items);
        items.forEach(System.out::println);
    }

    private Function<List<String>, List<String>> sortFunction() {
        return items -> items.stream().sorted().toList();
    }

    private Function<List<String>, List<String>> upperCaseFunction() {
        return items -> items.stream().map(String::toUpperCase).toList();
    }

}

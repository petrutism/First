package collections.list;

import java.util.LinkedList;

public class TaskSeven {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("labas");
        list.add("laba");
        list.add("labak");
        list.add("lababb");
        list.add("baba");
        list.add("diena");
        list.add("katinas");
        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.pop());
        System.out.println(list);
        System.out.println(list.pollFirst());
        System.out.println(list.pollLast());
        System.out.println(list);
        list.push("grybai");
        System.out.println(list);
        list.add("dog");
        System.out.println(list);

    }
}

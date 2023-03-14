package Day5;

import java.util.ArrayDeque;
import java.util.Deque;

public class Deque_ArrayDeque_25 {
    /**
     * Deque - это очередь в которй войдействовать с элементами с 2 концов(начала и конца) FIFI and LIFO
     * Deque реализуется с помощью LinkedList and ArrayDeque
     */
    public static void main(String[] args) {
        Deque<String> stringDeque = new ArrayDeque<>();
        stringDeque.addFirst("Mother - Olga");
        stringDeque.addLast("Grandmother - Anna");
        stringDeque.offerFirst("Father - Vasiliy");
        stringDeque.offerLast("Grandfather - Andriy");
        stringDeque.offerFirst("Son - Andriy");
        System.out.println(stringDeque);
        System.out.println();

        System.out.println(stringDeque.getFirst()+" first");
        System.out.println(stringDeque.removeFirst()+" removed");
        System.out.println(stringDeque);
        System.out.println();

        System.out.println(stringDeque.getLast()+" last");
        System.out.println(stringDeque.removeLast()+" removed");
        System.out.println(stringDeque);
        System.out.println();

        System.out.println(stringDeque.peekFirst()+" first");
        System.out.println(stringDeque.pollFirst()+" removed");
        System.out.println(stringDeque);
        System.out.println();

        System.out.println(stringDeque.peekLast()+" last");
        System.out.println(stringDeque.pollLast()+" removed");
        System.out.println(stringDeque);
        System.out.println();
    }
}

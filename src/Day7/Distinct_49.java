package Day7;

import java.util.stream.Stream;

public class Distinct_49 {
    /**
     * Distinct - Terminal метод который выдает только уникальные елементы с помощью сравнивая элементов с помощью Equals()
     */

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Andriy","Ruslan","Natalia","Andriy","Oleg","Igor","Katya","Katya");
        stream.distinct().forEach(System.out::println);
    }
}

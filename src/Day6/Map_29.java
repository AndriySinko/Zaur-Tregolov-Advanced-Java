package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map_29 {
    /**
     * Stream - вызывает какоц-то поток.
     * Методы Stream не меняют саму ранее созданную коллекцию
     * Map преобразовывает этот поток так ка мы опишем его в параметрах
     */
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("One");
        stringList.add("Two");
        stringList.add("Three");
        stringList.add("Four");
        stringList.add("Five");
        stringList.add("Six");
        stringList.add("Seven");
        stringList.add("Eight");
        stringList.add("Nine");
        stringList.add("Ten");
        System.out.println(stringList);
        List<Integer> integerList = stringList.stream().map(element -> element.length()).collect(Collectors.toList());
        System.out.println(integerList);
        Integer[] intArrays = integerList.toArray(new Integer[0]);
        for (Object s : intArrays) {
            System.out.print(s + " ");
        }
        List<Integer> integerList2 = Arrays.stream(intArrays).map(element ->
        {
            if (element % 3 == 0) {
                element = element / 3;
            } else {
                element = element / 2;
            }
            return element;
        }).toList();

        System.out.println("\n" + integerList2);

    }
}


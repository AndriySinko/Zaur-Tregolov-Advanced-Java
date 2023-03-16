package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Reduce_31 {
    /**
     * Reduce работает по принципе уменшьшения элементов на 1 и действия производит с ними
     */
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("asdsa");
        list.add("asdsagfhfgh");
        list.add("asdsas");
        list.add("asd");
        list.add("asdsadf");
        System.out.println(list);
        List<Integer> integerList = list.stream().map(String::length).collect(Collectors.toList());
        System.out.println(integerList);
        int result = integerList.stream().reduce(1,(a,e)->
                a*e);
        System.out.println(result);

    }
}

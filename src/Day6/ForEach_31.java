package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ForEach_31 {
    /**
     * Проходится по каждому элементу и возвразает void, потом с этим потоком сделать ничего нельзя
     *
     */
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("asdsa");
        list.add("asdsagfhfgh");
        list.add("asdsas");
        list.add("asd");
        list.add("asdsadf");
        List<Integer> integerList = list.stream().map(String::length).collect(Collectors.toList());
        Integer[] intArray =integerList.toArray(new Integer[0]);
        Arrays.stream(intArray).forEach(el->
                {el*=5; System.out.println(el);});
    }
}

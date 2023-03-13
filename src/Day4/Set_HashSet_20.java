package Day4;

import java.util.HashSet;
import java.util.Set;

public class Set_HashSet_20 {
    /**
     * Set - коллекция хрянящяе уникальные обьекты( не повторяющтеся), методы являются очень быстрыми.
     *
     * У интерфейса Set есть:
     * 1. Класс который его имплеминтирует HashSet и наследник этого класса - LinkedHashSet
     * 2. Интерфейсы SortedSet и NavigableSet и класс который их имплементирует TreeSet
     *
     * В основе самого интерфейса Set лежит Map, но он не содержит пары ключ и значения, а содержит только значения.
     * - Тогда и в основе HashSet лежит HashMap и получается так что обычный элемент HashSet является ключом HashMap
     * а значения HashMap будет какой-то константой(заглушкой)
     * - И тогда Set содержит в себе то что и Map,но не может содержать дубликаты, и так же не запоминает порядок добавления.
     */
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("Andriy"); // Добавление элемента в Set с помощью add
        //  и одновременное незаметное добавление того самого элемента на место ключа в Map с помощью put
        stringSet.add("Ruslan");
        stringSet.add("Sasha");
        stringSet.add("Anton");
        stringSet.add("Artem");
        System.out.println(stringSet); // sout вывод

        stringSet.remove("Sasha"); // Удаление
        System.out.println(stringSet);

        System.out.println(stringSet.size()); // Указывает размер

        System.out.println(stringSet.contains("Anton")); // проверяет есть ли указанный элемент в коллекции
        System.out.println(stringSet.isEmpty()); // проверяет пустая ли коллекция
        System.out.println();


        HashSet<Integer> integerHashSet1 = new HashSet<>();
        integerHashSet1.add(3);
        integerHashSet1.add(4);
        integerHashSet1.add(5);
        integerHashSet1.add(8);
        integerHashSet1.add(10);
        System.out.println(integerHashSet1+" - integerHashSet1");

        HashSet<Integer> integerHashSet2 = new HashSet<>();
        integerHashSet2.add(7);
        integerHashSet2.add(4);
        integerHashSet2.add(5);
        integerHashSet2.add(9);
        integerHashSet2.add(1);
        System.out.println(integerHashSet2+" - integerHashSet2");

        HashSet<Integer> union = new HashSet<>(integerHashSet1);
        union.addAll(integerHashSet2); // union - обьедение/zjednotenie
        System.out.println(union+" - union - обьедение/zjednotenie");

        HashSet<Integer> intersect = new HashSet<>(integerHashSet1);
        intersect.retainAll(integerHashSet2); // пересечения/prienik
        System.out.println(intersect+" пересечения/prienik");

        HashSet<Integer> subtract = new HashSet<>(integerHashSet1);
        subtract.removeAll(integerHashSet2); // Отнимет от integerHashSet1 integerHashSet2 и их совместные элементы"
        System.out.println(subtract+" Отнимет от integerHashSet1 integerHashSet2 и их совместные элементы");
    }
}

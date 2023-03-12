package Day3;

import java.util.Objects;
import java.util.TreeMap;

public class TreeMap_17 {
    /**
     * TreeMap - так же как и HashMap представляет собой пары ключей и значений. Но элементы в TreeMap в отличии от HashMap
     * хранятся в порядку возростания.
     *
     * Есть такое понятие как деревья которое складывается с целочисленных значений. Все значения выходят от 1 числа(корня)
     * справа большое слева меньшее и так на каждой ветке, последние числа от которых уже ничего не отходит называются листья.
     *
     * Есть двоичное дерево в котором каждая ветвь и корень может содержать только 2 потомка. И выходит так само справа
     * числа которые являются больше корня, слева меньшие, и всеъ потомков такая же ситуация, справа больше, слева меньше.
     *
     * Есть красно-черное дерево которое тоже является двоичным, но в случае с TreeMap если все числа идут по возростанию
     * то левыъ(меньших ветвь не будет) и тогда это станет чем-то похожим на линкед лист там где поиск каких-то элементов
     * происходит так что сравнивается каждый обьект с обьектом, а тут сравнивается является ли это число больше этого, \
     * а так они всегда идут по возростанию числа всегда будут больше и будут идти вправо.
     * -НО кроме тоого что красно-черное дерево является двоичным оно является еще и самосбалансированым, и в какой-то момент
     * вместо элементов которые больше один за другой создастся обчыное дерево, где возьмется среднее значение всех ключей
     * розделиься на 2 ветви одну что является больше другую меньше, и там поместять средние значения больших и меньших
     * чисел, и от них уже будет продолжатся нормально
     */
    public static void main(String[] args) {
        Cars cars1 = new Cars(2020,"Mercedes-Benz C");
        Cars cars2 = new Cars(2012,"Audi A6");
        Cars cars3 = new Cars(2016,"Skoda Octavia A7");
        TreeMap<Double, Cars> carsTreeMap = new TreeMap<>();
        carsTreeMap.put(8.0,cars1);
        carsTreeMap.put(7.2,cars2);
        carsTreeMap.put(9.3,cars3);
        System.out.println(carsTreeMap);
        System.out.println();

        System.out.println(carsTreeMap.get(7.2));
        System.out.println();

        carsTreeMap.remove(8.0);
        System.out.println(carsTreeMap);

        Cars cars4 = new Cars(2021,"BMW X5");
        Cars cars5 = new Cars(2017,"Pegout 3008");
        Cars cars6 = new Cars(2023,"Porsche Cayenne");
        carsTreeMap.put(5.7,cars4);
        carsTreeMap.put(9.7,cars5);
        carsTreeMap.put(6.4,cars6);
        System.out.println();
        System.out.println(carsTreeMap);
        System.out.println(carsTreeMap.descendingMap()); //Разворачивае порядок
        System.out.println();

        System.out.println(carsTreeMap.headMap(7.2)); //Выводит ключи которые менше заданного
        System.out.println(carsTreeMap.tailMap(7.2)); //Выводит ключи которые больше заданного
        System.out.println();

        System.out.println(carsTreeMap.lastEntry()); //выводит наибольший ключ
        System.out.println(carsTreeMap.firstEntry());// выводит найменьший ключ
    }
}
 class Cars implements Comparable<Cars>{
    private String name;
    private  int age;

     public Cars(int age, String name) {
         this.age = age;
         this.name = name;
     }

     @Override
     public boolean equals(Object o) {
         if (this == o) return true;
         if (!(o instanceof Cars cars)) return false;
         return age == cars.age && Objects.equals(name, cars.name);
     }


     @Override
     public int compareTo(Cars anotherAge) {
         return this.age - anotherAge.age;
     }

     @Override
     public String toString() {
         return name+" "+age;
     }

     @Override
     public int hashCode() {
         return Objects.hash(name, age);
     }
 }

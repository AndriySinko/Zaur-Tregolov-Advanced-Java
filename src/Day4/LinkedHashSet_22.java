package Day4;


import java.util.LinkedHashSet;

public class LinkedHashSet_22 {
    /**
     * LinkedHashSet является наследником HashSet, может хранить информацтю о пордке добавления, скорость методов ниже
     * чем у HashSet
     *
     * В основе LinkedHashSet лежит HashMap, элементы LinkedHashSet являются ключами HashMap, значение у HashMap
     * является константой(заглушкой0
     */
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Anton");
        linkedHashSet.add("Vika");
        linkedHashSet.add("Katya");
        linkedHashSet.add("Igor");
        linkedHashSet.add("Zaur");
        System.out.println(linkedHashSet);
        linkedHashSet.remove("Vika");
        System.out.println(linkedHashSet);
        System.out.println(linkedHashSet.contains("Igor"));
        System.out.println(linkedHashSet.size());
        System.out.println(linkedHashSet.isEmpty());
    }
}

package MapCollection.HashMap_13_14_15_16_18;

import java.util.LinkedHashMap;

public class LinkedHashMap_18 {
    /**
     * LinkedHashMap - являеется наследником HashMap, но он может хранить онформацию о порядке добавления, или о порядке
     * использования. Производительность немного ниже как у HashMap.
     */
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>(16,0.75f, true);
        lhm.put(5,"Andriy");
        lhm.put(10,"Ruslan");
        lhm.put(15,"Nastya");
        System.out.println(lhm);

        System.out.println(lhm.get(15));
        System.out.println(lhm.get(5));
        System.out.println(lhm.get(10));
        System.out.println(lhm);

        System.out.println(lhm.containsValue("Nastya"));
        System.out.println(lhm.containsKey(15));

        System.out.println(lhm.containsKey(7));
        System.out.println(lhm.containsValue(" "));

        System.out.println(lhm.containsValue("Andriy"));
        System.out.println(lhm.containsKey(5));

        System.out.println(lhm);
    }
}

package MapCollection.HashMap_13_14_15_16_18;

import java.util.HashMap;
import java.util.Map;

public class HashMap_13 {
    /**
     * HashMap - это коллекция которая состоит из пар(ключей(Обьектов), и значений(Обьектов)). Эта коллекция очень
     * быстра но не запоминает порядок доьавленных обьектов. Как и коючи так и значения могут содержать null, НО
     * КАЖДЫЙ КЛЮЧ ДОЛЖЕН БЫТЬ РАЗНЫЙ ибо при добавлении како-то элемента с тем самым ключом который уже существует, то этот
     * ключ переопредилится и возьмет в себя другие заданные нами данными.
     *
     * Map делится на:
     * 1. HashMap и его наследника LinkedHashMap
     * 2. Интерфейсы SortedMap и NavigableMap и класс который их имплементирует TreeMap
     * 3. HashTable
     */
    public static void main(String[] args) {
        Integer[] keys = new Integer[5];
        for (int i = 0;i< keys.length;i++){
            keys[i] = i*5;
        }
        HumanDocuments human = new HumanDocuments("Andriy Sinko",15,"Ukrainian");
        HumanDocuments human1 = new HumanDocuments("Tomas Labar",16,"Slovak");
        HumanDocuments human2 = new HumanDocuments("Danil Atukmaiev",17,"Russian");
        Map<Integer, HumanDocuments> pass = new HashMap();
        pass.put(keys[0],human);
        pass.put(keys[1],human1);
        pass.put(keys[2],human2);
        System.out.println(pass);
        for (HumanDocuments s: pass.values()){
            System.out.println(s);
        }
        System.out.println();

        HumanDocuments human3 = new HumanDocuments("Ficay Vladislv",23,"Czech");
        HumanDocuments human4 = new HumanDocuments("Ruslan Prodan",18,"Ukrainian");
        pass.putIfAbsent(keys[0], human3); // Метод "Добавь если этот ключ свободен" - тут занято поэтому не добавилось
        pass.putIfAbsent(keys[4],human4); // Метод "Добавь если этот ключ свободен" - тут свободно поэтому добавилось
        System.out.println(pass);
        for (HumanDocuments s: pass.values()){
            System.out.println(s);
        }
        System.out.println();

        System.out.println(pass.get(3)); // get - не проиницилизировано поэтому null
        System.out.println();

        pass.remove(keys[1]); // remove - удаление
        System.out.println(pass);
        for (HumanDocuments s: pass.values()){
            System.out.println(s);
        }
        System.out.println();

        System.out.println(pass.containsKey(keys[2])); // проверяет есть ли в коллекции обьект под заданным ключом
        System.out.println(pass.containsValue(human1)); // проверяет есть ли в коллекции обьект под "Значенем"
        System.out.println();

        System.out.println(pass.keySet()); // выдает список ключей
        System.out.println(pass.values()); // выдает список Значений
    }
}
class HumanDocuments{
    private String nameAndFemale;
    private  int age;
    private String citizenship;
    HumanDocuments(String nameAndFemale, int age, String citizenship){
        this.age = age;
        this.nameAndFemale = nameAndFemale;
        this.citizenship = citizenship;
    }
    public String toString(){
        return "Name and Female - "+nameAndFemale+" Ages - "+age+" - Citizenship - "+citizenship;
    }
}



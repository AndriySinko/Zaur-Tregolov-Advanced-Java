package Day9;

import java.util.ArrayList;
import java.util.List;

public class Limit_Skip_57_58 {
    /**
     * Limit - Intermediate - ограничивает кол-во слотов под элементы, оставляет первое наше количесвто элементов
     * Skip - Intermediate - тот самый Limit но он уже пропускает первое наше количество элементов
     */
    public static void main(String[] args) {
        Humans human1 = new Humans("Anton", "Sidorov", 50, 1000, 'm');
        Humans human2 = new Humans("Andriy", "Sinko", 20, 2000, 'm');
        Humans human3 = new Humans("Anna", "Petrova", 33, 1500, 'f');
        Humans human4 = new Humans("Katya", "Enisenko", 23, 800, 'f');
        Humans human5 = new Humans("Vasiliy", "Sinko", 44, 2000, 'm');
        Humans human6 = new Humans("Artem", "Vasilyev", 38, 800, 'm');
        Humans human7 = new Humans("Veronika", "Apanasenko", 26, 1400, 'f');
        List<Humans> peoples = new ArrayList<>();
        peoples.add(human1);
        peoples.add(human2);
        peoples.add(human3);
        peoples.add(human4);
        peoples.add(human5);
        peoples.add(human6);
        peoples.add(human7);
        System.out.println("=====================До стримов===================");
        for (Humans h:peoples){
            System.out.println(h);
        }
        System.out.println("\n=====================После Limit===================");
        peoples.stream().filter(e-> e.getSex()=='m').sorted((e,e1)->
                e.getAge()- e1.getAge()).limit(3).forEach(System.out::println);
        System.out.println("\nОСТАВИЛ НАШЕ КОЛ-ВО ЭЛЕМЕНТОВ\n");
        System.out.println("=====================После Skip===================");
        peoples.stream().filter(e-> e.getSex()=='m').sorted((e,e1)->
                e.getAge()- e1.getAge()).skip(3).forEach(System.out::println);
        System.out.println("\nПРОПУСТИЛ НАШЕ КОЛ-ВО ЭЛЕМЕНТОВ");
    }
}

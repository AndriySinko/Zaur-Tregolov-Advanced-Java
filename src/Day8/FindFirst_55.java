package Day8;

import java.util.ArrayList;
import java.util.List;

public class FindFirst_55 {
    /**
     *FindFirst - Termanal Optional - находит первый элемент
     */
    public static void main(String[] args) {
        Humans human1 = new Humans("Anton","Sidorov",50,1000,'m');
        Humans human2 = new Humans("Andriy","Sinko",20,2000,'m');
        Humans human3 = new Humans("Anna","Petrova",33,1500,'f');
        Humans human4 = new Humans("Katya","Enisenko",23,800,'f');
        Humans human5 = new Humans("Vasiliy","Sinko",44,2000,'m');
        Humans human6 = new Humans("Artem","Vasilyev",38,800,'m');
        Humans human7 = new Humans("Veronika","Apanasenko",26,1400,'f');
        List<Humans> peoples = new ArrayList<>();
        peoples.add(human1);
        peoples.add(human2);
        peoples.add(human3);
        peoples.add(human4);
        peoples.add(human5);
        peoples.add(human6);
        peoples.add(human7);

        Humans first = peoples.stream().findFirst().get();
        System.out.println(first);
    }
}

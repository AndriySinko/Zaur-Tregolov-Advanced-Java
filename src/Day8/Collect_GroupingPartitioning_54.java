package Day8;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Collect_GroupingPartitioning_54 {
    /**
     * Collect - Terminal - метод который ми используем чтобы присвоить наш поток какй-то коллекции
     * Grouping - делит на какие-то группы элементы по заданному нами запросу и количеству групп
     * Partitioning - разделяет на 2 каки-то группы наши элементы(Partitioning выдает boolean - и делит наши элементы по
     * заданому нами параметру на 2 группы true или false)
     */
    public static void main(String[] args) {
        Humans people1 = new Humans("Anton","Sidorov",50,1000,'m');
        Humans people2 = new Humans("Andriy","Sinko",20,2000,'m');
        Humans people3 = new Humans("Anna","Petrova",33,1500,'f');
        Humans people4 = new Humans("Katya","Enisenko",23,800,'f');
        Humans people5 = new Humans("Vasiliy","Sinko",44,2000,'m');
        Humans people7 = new Humans("Artem","Vasilyev",38,800,'m');
        Humans people6 = new Humans("Veronika","Apanasenko",26,1400,'f');
        List<Humans> humans = new ArrayList<>();
        humans.add(people1);
        humans.add(people2);
        humans.add(people3);
        humans.add(people4);
        humans.add(people5);
        humans.add(people6);
        humans.add(people7);

        Map<Integer, List<Humans>> map = humans.stream().sorted((el, el1)->
                el.getSalary()- el1.getSalary()).collect(Collectors.groupingBy(el -> el.getSalary()));
        for(Map.Entry<Integer, List<Humans>> entry: map.entrySet()){
            System.out.println(entry.getKey()+": "+entry.getValue().toString());
        }
        System.out.println();



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

        Map<Boolean, List<Humans>> map1 =peoples.stream().collect(Collectors.partitioningBy(el ->
                el.getSex()=='f'));
        for(Map.Entry<Boolean, List<Humans>> entry1: map1.entrySet()){
            System.out.println(entry1.getKey()+": "+entry1.getValue().toString());
        }
    }
}

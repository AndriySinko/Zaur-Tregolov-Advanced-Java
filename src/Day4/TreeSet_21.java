package Day4;

import java.util.Objects;
import java.util.TreeSet;

public class TreeSet_21 {
    /**
     * TreeSet - как и TreeMap хранит элементы в порядку по возростанию, и если мы создаем какие-то обькты нам обязательно
     * нужно переопределять compareTo Equals hashCode toSrting;
     *
     *Элементы TreeSet это ключи TreeMap, а значения у TreeMap это константа(заглушка)
     */
    public static void main(String[] args) {
        Peoples people1 = new Peoples("Anton","Builder",30,1500);
        Peoples people2 = new Peoples("Vasiliy","Electrician",44,2000);
        Peoples people3 = new Peoples("Andriy","Programmer",18,3000);
        Peoples people4 = new Peoples("Tomas","Pilot",23,2500);
        Peoples people5 = new Peoples("Lubomir","Paramedic",20,1000);
        Peoples people6 = new Peoples("Artem","Mechanic",20,800);

        TreeSet<Peoples> peoplesSet = new TreeSet<>();
        peoplesSet.add(people3);
        peoplesSet.add(people5);
        peoplesSet.add(people2);
        peoplesSet.add(people6);
        peoplesSet.add(people1);
        peoplesSet.add(people4);
        for (Peoples peoples: peoplesSet){
            System.out.println(peoples);
        }
        System.out.println();

        System.out.println(peoplesSet.first()+" - Вывод первого обьекта");
        System.out.println(peoplesSet.last()+" - Вывод последнего обьекта");
        System.out.println();

        Peoples people7 = new Peoples("Vitaliy","Builder",25,2000);
        for (Peoples human: peoplesSet.tailSet(people7)){
            System.out.println(human+" - Выводит хвост(конец) после заданых нами параметров");
        }
        System.out.println();
        for (Peoples human: peoplesSet.headSet(people7)){
            System.out.println(human+" - Выводит голову(начало) после заданых нами параметров");
        }
        System.out.println();

        peoplesSet.add(people7);
        Peoples people8 = new Peoples("Igor","Builder",19,1500);
        Peoples people9 = new Peoples("Volodimir","Builder",42,300);
        for (Peoples human: peoplesSet.subSet(people8,people9)){
            System.out.println(human+" - Выводит которые находятся межу заданых нами параметров");
        }
    }
}
class Peoples implements Comparable<Peoples>{
    private String name;
    private int age;
    private  String work;
    private int salary;
    public Peoples(String name, String work, int age, int salary){
        this.age = age;
        this.name = name;
        this.salary =salary;
        this.work = work;
    }

    @Override
    public int compareTo(Peoples anotherPeole) {
        int result = this.age - anotherPeole.age;
        if (result == 0){
            result = this.salary - anotherPeole.salary;
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Peoples peoples)) return false;
        return age == peoples.age && salary == peoples.salary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, salary);
    }

    @Override
    public String toString() {
        return "Name = "+name+", work = "+work+", age = "+age+", salary = "+salary;
    }
}

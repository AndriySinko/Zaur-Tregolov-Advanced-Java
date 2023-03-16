package Day7;

import java.util.*;

public class Chaining_47 {
    /**
     * Chaining - метод который позволяет вызывать другие методы stream один за други, вызывать его не нуэно, он
     * автоматически вызывается с помощью stream.
     *
     * Есть такое поняти как промежуточные(Intermediate(lazy)) и конечные(Terminal) методы в stream
     * Intermadieate - методы которе мы вызываем и они возвращают нам stream
     * Terminal - конечные методы которе не возвращают нам ничего(void)
     *
     * Промежуточные методы невозможно вызвать если нету еонечного метода.
     */
    public static void main(String[] args) {
        Peoples people1 = new Peoples("Anton", "Builder", 30, 1500);
        Peoples people2 = new Peoples("Vasiliy", "Electrician", 44, 2000);
        Peoples people3 = new Peoples("Andriy", "Programmer", 18, 3000);
        Peoples people4 = new Peoples("Tomas", "Pilot", 23, 2500);
        Peoples people5 = new Peoples("Lubomir", "Paramedic", 20, 1000);
        Peoples people6 = new Peoples("Artem", "Mechanic", 20, 800);
        List<Peoples> peoplesList = new ArrayList<>();
        peoplesList.add(people1);
        peoplesList.add(people2);
        peoplesList.add(people3);
        peoplesList.add(people4);
        peoplesList.add(people5);
        peoplesList.add(people6);

        peoplesList.stream().map(element -> {element.setName(element.getName().toUpperCase());return element;}).sorted(
                (e,e1)->e1.getSalary()- e.getSalary()).filter(e ->
                    e.getAge()<40).map(element ->
                        {element.setWork(element.getWork().toUpperCase());return element;}).forEach(el ->
                            System.out.println(el));

        int[] ints = {28,182,546,345,2,34,78,97,56,49,23};
        int result =Arrays.stream(ints).sorted().filter(element -> element%3==1).map(e ->
            {if(e%2==0){e=e/2; System.out.println(e);}return e;}).reduce(1,(a,e)->
                a*e);
        System.out.println(result);
    }
}
class Peoples {
    private String name;
    private int age;
    private String work;
    private int salary;

    public Peoples(String name, String work, int age, int salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.work = work;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getWork() {
        return work;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWork(String work) {
        this.work = work;
    }

    @Override
    public String toString() {
        return "Name = "+name+", work = "+work+",\nAge = "+age+", salary = "+salary+"\n";
    }
}
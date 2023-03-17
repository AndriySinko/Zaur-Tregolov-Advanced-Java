package Day8;

import java.util.ArrayList;
import java.util.List;

public class FlatMap_53 {
    /**
     * FlatMap - Intermediate, похож на обычный Map, но используестя когда нужно поработать с элементами элементов
     * каких-то элементов, то есть с элементами который находится в другом элементе, а этот другой нахлдится в трерьем.
     */
    public static void main(String[] args) {
        Peoples1 people1 = new Peoples1("Anton","Sidorov",50,1000,'m');
        Peoples1 people2 = new Peoples1("Andriy","Sinko",20,2500,'m');
        Peoples1 people3 = new Peoples1("Anna","Petrova",33,1500,'f');
        Peoples1 people4 = new Peoples1("Katya","Enisenko",23,800,'f');
        Peoples1 people5 = new Peoples1("Vasiliy","Sinko",44,2000,'m');
        Peoples1 people7 = new Peoples1("Artem","Vasilyev",38,600,'m');
        Peoples1 people6 = new Peoples1("Veronika","Apanasenko",26,1400,'f');

        Work workCategory = new Work("Programmer");
        Work workCategory1 = new Work("Model");
        Work workCategory2 = new Work("Builder");

        workCategory.addPeople(people1);
        workCategory.addPeople(people2);
        workCategory.addPeople(people6);
        workCategory1.addPeople(people4);
        workCategory1.addPeople(people3);
        workCategory2.addPeople(people5);
        workCategory2.addPeople(people7);

        List<Work> works = new ArrayList<>();
        works.add(workCategory);
        works.add(workCategory1);
        works.add(workCategory2);

        works.stream().flatMap(element -> element.getPeopleWork().stream().map(el->
            {el.setName(el.getName().toUpperCase());return el;}).map(el1 ->
                {el1.setSurname(el1.getSurname().toUpperCase());return el1;}).sorted(
                        (el, el1)-> el.getSalary()- el1.getSalary())).forEach(System.out::println);
    }
}
class Peoples1{
    private String name;
    private String surname;
    private int age;
    private int salary;
    private char sex;

    public Peoples1(String name, String surname, int age, int salary, char sex) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public char getSex() {
        return sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Name - "+name+" "+surname+",\n Age - "+age+", salary - "+salary +", sex - "+sex;
    }
}

class Work{
    private String work;
    List<Peoples1> peopleWork;

    public Work(String work) {
        this.work = work;
        peopleWork = new ArrayList<>();
    }
    public List<Peoples1> getPeopleWork(){
        return peopleWork;
    }
    public void addPeople(Peoples1 peoples){
        peopleWork.add(peoples);
    }

    @Override
    public String toString() {
        return "work - " + work;
    }
}
package Day8;

import java.util.Objects;
import java.util.stream.Stream;

public class Peek_51 {
    /**
     * Peek - Intermediate тот помагает нам просмотреть что случалось с элементами в период работы каких-то методов,
     * тот самый ForeEach но возвращает stream.
     */
    public static void main(String[] args) {
        Humans people1 = new Humans("Anton","Sidorov",50,1000,'m');
        Humans people2 = new Humans("Andriy","Sinko",20,2500,'m');
        Humans people3 = new Humans("Anna","Petrova",33,1500,'f');
        Humans people4 = new Humans("Katya","Enisenko",23,800,'f');
        Humans people5 = new Humans("Vasiliy","Sinko",44,2000,'m');
        Humans people7 = new Humans("Artem","Vasilyev",38,600,'m');
        Humans people6 = new Humans("Veronika","Apanasenko",26,1400,'f');

        Humans people8 = new Humans("Anna","Petrova",33,1500,'f');
        Humans people9 = new Humans("Katya","Enisenko",23,800,'f');
        Humans people10 = new Humans("Vasiliy","Sinko",44,2000,'m');

        Stream<Humans> stream = Stream.of(people1,people2,people3,people4,people5,
                                            people6,people7,people8,people9,people10);

        System.out.println(stream.distinct().filter(e->
                    e.getSex()=='f').peek(System.out::println).map(e ->
                        {e.setName(e.getName().toUpperCase());return e;}).map(e ->
                            {e.setSurname(e.getSurname().toUpperCase());return e;}).sorted((e,e1)->
                                e1.getAge()- e.getAge()).peek(System.out::println).count());
    }
}
class Humans{
    private String name;
    private String surname;
    private int age;
    private int salary;
    private char sex;

    public Humans(String name, String surname, int age, int salary, char sex) {
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

    @Override
    public String toString() {
        return "Name - "+name+" "+surname+",\nAge - "+age+", salary - "+salary +", sex - "+sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Humans humans)) return false;
        return getAge() == humans.getAge() && getSalary() == humans.getSalary();
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAge(), getSalary());
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
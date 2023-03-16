package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter_30 {
    public static void main(String[] args) {
        People people1 = new People("Anton","Sidorov",50,1000,'m');
        People people2 = new People("Andriy","Sinko",20,2500,'m');
        People people3 = new People("Anna","Petrova",33,1500,'f');
        People people4 = new People("Katya","Enisenko",23,800,'f');
        People people5 = new People("Vasiliy","Sinko",44,2000,'m');
        List<People> peopleList = new ArrayList<>();
        peopleList.add(people1);
        peopleList.add(people2);
        peopleList.add(people3);
        peopleList.add(people4);
        peopleList.add(people5);
        for (People p: peopleList){
            System.out.println(p);
        }
        System.out.println();

        List<People> peopleList2 = peopleList.stream().filter(element
            ->element.getAge()<40 && element.getSalary()>1000).collect(Collectors.toList());
        for (People p: peopleList2){
            System.out.println(p);
        }

    }
}
class People {
    private String name;
    private String surname;
    private int age;
    private int salary;
    private char sex;

    public People(String name, String surname, int age, int salary, char sex) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.sex = sex;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return name+" "+surname+" "+salary+" "+age+" "+sex;
    }
}
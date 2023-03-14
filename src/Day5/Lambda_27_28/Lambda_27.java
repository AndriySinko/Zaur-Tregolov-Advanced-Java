package Day5.Lambda_27_28;

import java.util.ArrayList;


class People{
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

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public char getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "Name - "+name+", surname - "+surname+", age - "+age+", salary - "+salary +", sex - "+sex;
    }
}


interface CheckPeoples{
    boolean check(People p);
}


class InfoPeoples{
    void testPeople(ArrayList<People> ap, CheckPeoples cp){
        for (People p: ap){
            if(cp.check(p)){
                System.out.println(p);
            }
        }
    }
}


public class Lambda_27 {
    public static void main(String[] args) {
        People people1 = new People("Anton","Sidorov",50,1000,'m');
        People people2 = new People("Andriy","Sinko",20,2500,'m');
        People people3 = new People("Anna","Petrova",33,1500,'f');
        People people4 = new People("Katya","Enisenko",23,800,'f');
        People people5 = new People("Vasiliy","Sinko",44,2000,'m');
        ArrayList<People> peopleList = new ArrayList<>();
        peopleList.add(people1);
        peopleList.add(people2);
        peopleList.add(people3);
        peopleList.add(people4);
        peopleList.add(people5);
        InfoPeoples info = new InfoPeoples();
        info.testPeople(peopleList, (People p) -> {return p.getSalary()>1000;});
        System.out.println("-----===============-----");
        info.testPeople(peopleList, (People p) -> {return p.getAge()<40;});
        System.out.println("-----===============-----");
        info.testPeople(peopleList, (People p) -> {return p.getSex()=='f';});
    }
}
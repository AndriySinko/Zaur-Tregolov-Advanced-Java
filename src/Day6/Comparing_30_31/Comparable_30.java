package Day6.Comparing_30_31;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparable_30 {
    /**
     * Интерфейс Comparable используется для сравнения обьектов используя естественный порядок.
     * Обычно используется для сортировок обьектов
     *
     * Большинство классов как String Integer уже иплементирует Интерфейс Comparable и у них автоматически прописан
     * естественный порядок для сравнения.
     */
    public static void main(String[] args) {
        Students student1 = new Students(17,1,"Andriy","Janchik");
        Students student2 = new Students(17,2,"Liliya","Ancha");
        Students student3 = new Students(18,3,"Ruslan","Prodan");
        Students student4 = new Students(15,1,"Andriy","Sinko");
        Students student5 = new Students(20,4,"Maryana","Krasna");
        List<Students> studentsMap = new ArrayList<>();
        studentsMap.add(student1);
        studentsMap.add(student2);
        studentsMap.add(student3);
        studentsMap.add(student4);
        studentsMap.add(student5);
        System.out.println("Before sorting \n"+studentsMap);
        Collections.sort(studentsMap);
        System.out.println("After sorting \n"+studentsMap);

    }
}
class Students implements Comparable<Students>{
    private int age;
    private  int course;
    private  String name;
    private String surname;

    public Students(int age, int course, String name, String surname) {
        this.age = age;
        this.course = course;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return name+" "+surname+", age - "+age+", course - "+course;
    }

    @Override
    public int compareTo(Students anotherStudents) {
        int result = this.age - anotherStudents.age;
        if(result == 0){
            result = this.course - anotherStudents.course;
            if(result == 0){
                result = this.name.compareTo(anotherStudents.name);
            }
        }
        return result;
    }
}
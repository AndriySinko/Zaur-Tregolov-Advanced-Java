package MapCollection.HashMap_13_14_15_16_18;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeMethods_14 {
    /**
     * HashCode and Equals между собой очень связаны. Если мы переопределяем HashCode то нужно переопределить и Equals
     * Так как потом могут возникнуть ошибки.
     *
     * HashCode сам по себе это какой-то код сгенерированый с помощью преобразования полей обьектов в цифровое значение int
     *
     * Момент сравнения каких-то элементов происходит сначал по HashCode а потом Equals
     * и тогда выдается результат.
     *
     * Если сравнение по нескольких обьектов по Equals с одинаковыми данными или сравнение несколько раз 1 обьекта то
     * HashCode для ниъ должен быть одинаковый
     *
     * Еслм сравнение по Equals элементы не равны то HashCode должен быть разный, НО если у нас бесконечное колтчесвто
     * обьектов то нам не избежать повторения HashCode.
     *
     * Если разных обьектов одинаковый HashCode это называется коллизия
     */
    public static void main(String[] args) {
        Student st = new Student("Anton","Petrov",3);
        Student st1 = new Student("Artem","Sinko",1);
        Student st2 = new Student("Zaur","Tregulov",2);
        Map<Student, Double> students = new HashMap<>();
        students.put(st, 6.2);
        students.put(st1, 8.4);
        students.put(st2, 10.1);

        Student st4 = new Student("Anton","Petrov",3);
        boolean result = students.containsKey(st4);
        System.out.println(result);
        System.out.println(st.hashCode()+" - "+st.toString());
        System.out.println(st4.hashCode()+" - "+st4.toString());
        System.out.println();
        System.out.println(st2.hashCode()+" - "+st2.toString());
        System.out.println(st2.hashCode()+" - "+st2.toString());
        System.out.println(st1.hashCode()+" - "+st1.toString());
        System.out.println();

        for (Map.Entry<Student, Double> entry: students.entrySet()){
            System.out.println(entry.getKey()+" = "+entry.getValue());
        }
    }
}
class Student{
    private String name;
    private String surname;
    private int course;
    public Student(String name, String surname, int course){
        this.course = course;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public String toString() {
        return name + " " +surname + " " + course;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);

    }
}
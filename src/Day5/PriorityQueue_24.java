package Day5;

import java.util.Objects;
import java.util.PriorityQueue;

public class PriorityQueue_24 {
    /**
     * PriorityQueue - это специальная очередь которая работает с элементами которые являются в приоритете.
     * Приоритет элемента описывается в методе Comparator или интерфейсе Comparable.
     * Первым в очереди всегда будет элемент у которого приоритет выше
     *
     * НО ЭТО НЕ РАБОТАЕТ ПРИ ВЫВОДЕ ДАННЫХ.
     * PriorityQueue не запоминает порядок ввода данных и не сортирует их при выводе
     */
    public static void main(String[] args) {
        Students student4 = new Students("Vladislav Alfeldi",16,2);
        Students student1 = new Students("Tomas Moravcik",16,1);
        Students student5 = new Students("Ciryll",15,3);
        Students student3 = new Students("Tomas Labar",16,2);
        Students student2 = new Students("Andrii Synko",15,1);
        PriorityQueue<Students> studentsPriorityQueue = new PriorityQueue<>();
        studentsPriorityQueue.offer(student1);
        studentsPriorityQueue.offer(student2);
        studentsPriorityQueue.offer(student3);
        studentsPriorityQueue.offer(student4);
        studentsPriorityQueue.offer(student5);
        for (Students s:studentsPriorityQueue) {
            System.out.println(s);
        }
        System.out.println();

        for (int i = 0; i<5; i++) {
            System.out.println(studentsPriorityQueue.poll());
            System.out.println(studentsPriorityQueue.peek());
            System.out.println();
        }
        PriorityQueue<Integer> integerPriorityQueue = new PriorityQueue<>();
        integerPriorityQueue.offer(5);
        integerPriorityQueue.offer(1);
        integerPriorityQueue.offer(40);
        integerPriorityQueue.offer(12);
        integerPriorityQueue.offer(3);
        integerPriorityQueue.offer(57);
        System.out.println(integerPriorityQueue); // не сортирует в порядке возростания
    }
}
class Students implements Comparable<Students>{
    private String name;
    private int age;
    private int grade;

    public Students(String name, int age, int grade) {
        this.name = name;
        this.grade = grade;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Students students)) return false;
        return age == students.age && Double.compare(students.grade, grade) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, grade);
    }

    @Override
    public int compareTo(Students o) {
        int result = this.grade - o.grade;
        if (result == 0){
            result = o.age - this.age;
        }
        return result;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
}

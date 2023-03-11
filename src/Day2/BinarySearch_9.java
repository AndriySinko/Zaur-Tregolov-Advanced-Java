package Day2;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearch_9 {
    /**
     *
     * BinarySearch - ищет какойто обьект(наприклад число) таким способом что:
     * Берет этот обьект и проверяет является ли он больше или меньше среднего значения всех обьектов, если больше откидывает
     * все меньшие числа и находит среднее значение у оставшихся чисел и снова сравнивает заданое нами число, больше оно или
     * меньше и там пока не дойдет к нашему числу.
     *
     * Такой способ нахождения чего либо намного лучше так как обычный поиск происходит так что, что-то что мы задали
     * будет сравниватся совсеми обьектами пока его не найдет.
     */
    public static void main(String[] args) {
        Family person = new Family("Andriy", 2007, 2);
        Family person1 = new Family("Olga", 1977, 11);
        Family person2 = new Family("Vasil", 1978, 9);
        Family person3 = new Family("Anna", 1956, 7);
        Family person4 = new Family("Andriy", 2005, 9);
        Family person5 = new Family("Ruslan", 2005, 6);


        ArrayList<Family> personAges = new ArrayList<>();
        personAges.add(person);
        personAges.add(person1);
        personAges.add(person2);
        personAges.add(person3);
        personAges.add(person4);
        personAges.add(person5);
        for (Family s: personAges){
            System.out.println(s);
        }
        System.out.println();

        Collections.sort(personAges); // Сортирует порядок обьектов по возрастанию возраста
        System.out.println("=====================СОРТИРОВКА====================");
        for (Family s: personAges){
            System.out.println(s);
        }
        System.out.println();

        System.out.println("=====================НАХОЖДЕНИЕ ВСЕ ИНДЕКСОВ====================");
        for (Family s: personAges){
            int index = Collections.binarySearch(personAges, s); // binarySearch который находится в цикле и выводит
            // все индексы(значения)
            System.out.println(index+" - "+s);
        }
        System.out.println();

        System.out.println("=====================НАХОЖДЕНИЕ ОДНОГО ЗАДАНОГО НАМИ ИНДЕКСА====================");
        int index = Collections.binarySearch(personAges, person3);// binarySearch который выводит заданный обьект поиска
        System.out.println(index+" - "+person3);
        System.out.println();

        System.out.println("=====================РАЗВОРОТ ПОРЯДКА ОБЬЕКТОВ(ПО СНИЖЕНИЮ)====================");
        Collections.reverse(personAges); // Оборачивает порядок обьектов в листе по снижению возраста
        for (Family s: personAges){
            System.out.println(s);
        }
        System.out.println();

        System.out.println("=====================РАСКИДЫВЕНИЕ ОБЬЕКТОВ КАК ПОПАЛО====================");
        Collections.shuffle(personAges); // Мешает порядок всех обьектов в листе( раскидывает все как попало)
        for (Family s: personAges){
            System.out.println(s);
        }
    }
}
class Family implements Comparable<Family>{
    private String name;
    private int age;
    private int mothOfBirthday;
    private int yearOfBirthday;
    public Family(String name, int yearOfBirthday, int mothOfBirthday){
        this.name = name;
        this.yearOfBirthday = yearOfBirthday;
        this.mothOfBirthday = mothOfBirthday;
        this.age = 2023-yearOfBirthday;
    }


    public String toString(){
        return name+" Birthday date "+mothOfBirthday+" "+yearOfBirthday+" Ages: "+age;
    }

    public int compareTo(Family anotherAges) {
        int result = this.age - anotherAges.age;
        if (result==0){
            result = this.yearOfBirthday - anotherAges.yearOfBirthday;
            if(result == 0){
                result = this.mothOfBirthday - anotherAges.mothOfBirthday;
            }
        }
        return result;
    }
}
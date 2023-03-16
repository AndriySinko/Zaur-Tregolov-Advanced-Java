package Day6.Comparing_30_31;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Comparator_31 {
    /**
     * Интерфейс Comparator используется для сравнения обьектов используя не естественный порядок
     *
     * Обычно если вы значете что в основном будете равнивать используйте Comparable а если потребуется сравнивать
     * как-то по другому то используйте еще и Comparator.
     */
    public static void main(String[] args) {
        Animals animal1 = new Animals("Wolf",324,5);
        Animals animal2 = new Animals("Elephant",168,10);
        Animals animal3 = new Animals("Rabbit",257,3);
        Animals animal4 = new Animals("Pig",476,1);
        Animals animal5 = new Animals("Dog",648,7);
        ArrayList<Animals> animalsList = new ArrayList<>();
        animalsList.add(animal1);
        animalsList.add(animal2);
        animalsList.add(animal3);
        animalsList.add(animal4);
        animalsList.add(animal5);
        System.out.println("BeforeSorting number ");
        for (Animals animals:animalsList){
            System.out.println(animals);
        }
        System.out.println();

        Collections.sort(animalsList);
        System.out.println("After 'ID' sorting");
        for (Animals animals:animalsList){
            System.out.println(animals);
        }
        System.out.println();

        Collections.sort(animalsList,new CompareNameSize());
        System.out.println("After 'NAME SIZE' sorting");
        for (Animals animals:animalsList){
            System.out.println(animals);
        }
        System.out.println();

        Collections.sort(animalsList, new CompareName());
        System.out.println("After 'NAME' sorting");
        for (Animals animals:animalsList){
            System.out.println(animals);
        }
        System.out.println();

        Collections.sort(animalsList,new CompareAge());
        System.out.println("After 'AGE' sorting");
        for (Animals animals:animalsList){
            System.out.println(animals);
        }
        System.out.println();
    }
}
class Animals implements Comparable<Animals>{
    private String animal;
    private int id;
    private int age;

    public Animals(String animal, int id, int age) {
        this.animal = animal;
        this.id = id;
        this.age = age;
    }

    @Override
    public String toString() {
        return id+" "+animal+" "+age;
    }

    @Override
    public int compareTo(Animals anotherAnimal) {
        return this.id - anotherAnimal.id;
    }

    public String getAnimal() {
        return animal;
    }

    public int getAge() {
        return age;
    }
}
class CompareNameSize implements Comparator<Animals>{
    @Override
    public int compare(Animals anm1, Animals anm2) {
        return anm1.getAnimal().length()-anm2.getAnimal().length();
    }
}
class CompareName implements Comparator<Animals>{
    @Override
    public int compare(Animals anm3, Animals anm4) {
        return anm3.getAnimal().compareTo(anm4.getAnimal());
    }
}
class CompareAge implements Comparator<Animals>{
    @Override
    public int compare(Animals anm5, Animals anm6) {
        return anm5.getAge()-anm6.getAge();
    }
}
package Day7;

import java.util.ArrayList;
import java.util.List;


public class Sorted_46 {
    public static void main(String[] args) {
        Animals animal1 = new Animals("Wolf",324,5);
        Animals animal2 = new Animals("Elephant",168,10);
        Animals animal3 = new Animals("Rabbit",257,3);
        Animals animal4 = new Animals("Pig",476,1);
        Animals animal5 = new Animals("Dog",648,7);
        List<Animals> animalsList = new ArrayList<>();
        animalsList.add(animal1);
        animalsList.add(animal2);
        animalsList.add(animal3);
        animalsList.add(animal4);
        animalsList.add(animal5);
        System.out.println(animalsList);
        System.out.println();

         animalsList = animalsList.stream().sorted((o1, o2) ->
                o1.getAnimal().length()-o2.getAnimal().length()).toList();
        System.out.println(animalsList);
        System.out.println();

        animalsList = animalsList.stream().sorted((o1, o2) ->
                o2.getId()-o1.getId()).toList();
        System.out.println(animalsList);
        System.out.println();

        animalsList = animalsList.stream().sorted((o1, o2) ->
                o1.getAge()-o2.getAge()).toList();
        System.out.println(animalsList);
        System.out.println();

    }
}
class Animals {
    private String animal;
    private int id;
    private int age;
    public Animals(String animal, int id, int age) {
        this.animal = animal;
        this.id = id;
        this.age = age;
    }
    public String getAnimal() {
        return animal;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return animal +" "+ id +" "+ age;

    }
}
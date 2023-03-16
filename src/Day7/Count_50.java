package Day7;

import java.util.Objects;
import java.util.stream.Stream;

public class Count_50 {
    /**
     *Count - щитает количестов элементов
     */
    public static void main(String[] args) {
        Animal animal1 = new Animal("Wolf",324,5);
        Animal animal2 = new Animal("Elephant",168,10);
        Animal animal3 = new Animal("Rabbit",257,3);
        Animal animal4 = new Animal("Pig",476,1);
        Animal animal5 = new Animal("Dog",648,7);
        Animal animal6 = new Animal("Cat",879,4);
        Animal animal7 = new Animal("Tiger",123,7);

        Animal animal8 = new Animal("Rabbit",257,3);
        Animal animal9 = new Animal("Pig",476,1);
        Animal animal10 = new Animal("Dog",648,7);
        Stream<Animal> animalStream = Stream.of(animal1,animal2,animal4,animal3,animal5,
                animal6,animal7,animal8,animal9,animal10);

//        System.out.println(animalStream.count());
        System.out.println(animalStream.distinct().count());
    }
}
class Animal {
    private String animal;
    private int id;
    private int age;
    public Animal(String animal, int id, int age) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal animal1)) return false;
        return getId() == animal1.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
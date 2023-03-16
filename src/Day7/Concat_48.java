package Day7;

import java.util.stream.Stream;

public class Concat_48 {
    /**
     * Concat - метод обьеденения, который работает после создания обьекта класса Stream
     */
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Hello"," my name ");
        Stream<String> stream1 = Stream.of("is"," Andriy.");

        Stream<String> stream3 = Stream.of(" I"," have ");
        Stream<String> stream4 = Stream.of("16"," years old");

        Stream<String> stream5 = Stream.concat(stream,stream1);
        stream5.forEach(System.out::print);
        Stream<String> stream6 = Stream.concat(stream3,stream4);
        stream6.forEach(System.out::print);



        try {
            Stream<String> stream7 = Stream.concat(stream5,stream6);
            stream7.forEach(System.out::print);
        }catch (IllegalStateException e){
            System.out.println("\nПроизошла ошибка, ИСПОЛЬЗЛВАННЫЙ СТРИМ НЕЛЬЗЯ ИСПОЛЬЗОВАТЬ ЕЩЕ РАЗ");
        }
    }
}

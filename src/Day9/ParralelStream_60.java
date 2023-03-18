package Day9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ParralelStream_60 {
    /**
     * ParralelStream - тот самый стрим но он может одновременно несколькими процессами выполнять одну ту самую задачу,
     * в тот момент как обычный выполянет все по очередности
     *
     * Наприклад нам нужно умножит все числа одно на другое ри 1 до 1000000
     * Обычный = 1*2*3*4*...1000000 - выполняет все по очередности
     *
     * Паралельный = 1*2*3*....250000 разделит задачу на 4 части и каждая выполнит свою, и потом эти 4 части выполнят
     *               250001*...500000 какое-то действие между собой и мы достанеме тот самый результат
     *               500001*...750000
     *               750001*...1000000
     *
     * Ни в коем случае нельзя ипользовать паралельный стримы там где нам нужна последовность(наприклад деление чисел
     * самих на себя)
     */
    public static void main(String[] args) {
        int[] ints = new int[10000];
        for (int i = 0; i<ints.length;i++){
            ints[i] = i+1;
        }
        System.out.println(Arrays.toString(ints));
        int x = Arrays.stream(ints).reduce((a,e)->a+e).getAsInt();
        System.out.println(x);

       List<Integer> integerList = Arrays.stream(ints).boxed().toList();
        System.out.println(integerList);
        int y = integerList.stream().parallel().reduce((a,e)->a+e).get();
        System.out.println(y);


    }
}

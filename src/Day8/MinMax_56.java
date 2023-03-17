package Day8;

import java.util.Arrays;

public class MinMax_56 {
    /**
     * Mun and Max - Terminal Optional - находит минимальный и ммксимальный элемент
     */
    public static void main(String[] args) {
        int[] ints = {123,234,54,687,56,9,0,100,22,354};

        int resultMinInt = Arrays.stream(ints).min().getAsInt();
        System.out.println(resultMinInt);

        int resultMaxInt = Arrays.stream(ints).max().getAsInt();
        System.out.println(resultMaxInt);
        System.out.println();

        String[] strings = {"sdfd","sd","asd","asdasd","sdfsfdsf"};

        String resultMinString = Arrays.stream(strings).min((x,y)->x.length()-y.length()).get();
        System.out.println(resultMinString);

        String resultMaxString = Arrays.stream(strings).max((x,y)->x.length()-y.length()).get();
        System.out.println(resultMaxString);
    }
}

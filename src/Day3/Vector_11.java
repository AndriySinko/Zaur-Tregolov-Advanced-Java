package Day3;

import java.util.Vector;

public class Vector_11 {
    /**
     * Vector - нерекомендованный synchronized коасс для использования, и он не позволяет одновременно ти пользовать 2 человекам
     */
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        System.out.println(vector);
        System.out.println(vector.lastElement());
        System.out.println(vector.firstElement());
        vector.remove(2);
        System.out.println(vector);
    }
}

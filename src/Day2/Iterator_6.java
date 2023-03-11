package Day2;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_6 {
    /**
     * Iterator - повторитель, который повторит колекцию, но еще может с ней как-то воздействовать(удалять данные с колекции)
     */
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(1);
        integerArrayList.add(3);
        integerArrayList.add(5);
        integerArrayList.add(7);
        integerArrayList.add(9);
        System.out.println(integerArrayList);
        Iterator<Integer> iterator = integerArrayList.iterator();
        while (iterator.hasNext()){
            iterator.next();
            iterator.remove();
            System.out.println(integerArrayList);

        }

    }
}

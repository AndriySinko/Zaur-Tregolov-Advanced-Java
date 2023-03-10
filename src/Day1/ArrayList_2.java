package Day1;

import java.util.ArrayList;

public class ArrayList_2 {
    /**
     * 1.
     *  ArrayList - колекция массивов которая может изменять свою емкость. ArrayList происходит от массива Object[] поэтому
     *  писать в него можно любые данные. Но перед этим нужно указать сс помощью Generick's тип данных на вход.
     *
     *  2.У ArrayList есть такое понятие как Size and Capacity. При создании АррайЛиста создается массив какого-то типа
     *  и у него есть Capacity(емкость) 10 но его Size(размер) = 0 потому что в нем езе нету никаких элементов.
     *  Если заполнить целый массив 10 элементами и создавать попытатся создать 11 элемент, то произойдет создание нового
     *  массива в состав которого входит старый но емкость увеличится, и если заполнить новую емкость то создастся целый
     *  массив в состав которего входит старый и новый. Если знаете сразу сколько вам нужно слотов то можно указать эьу переменную
     *
     *  3.Также в массив можно помещать другой массив, данные будут одинаковые но ссылки разные
     */
    public static void main(String[] args) {
        //1.
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(5);
        integerArrayList.add(3);
        integerArrayList.add(7);
        System.out.println(integerArrayList);

        //2.
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("435");
        stringArrayList.add("345");
        stringArrayList.add("564");
        stringArrayList.add("675");
        stringArrayList.add("687456");
        stringArrayList.add("fg");
        stringArrayList.add("fghb");
        stringArrayList.add("fdgdfgg");
        stringArrayList.add("gfdg");
        stringArrayList.add("dfg");
        stringArrayList.add("fgd"); // создается новый массив в который входит старый но добавляется емкость

        ArrayList<String> stringArrayList1 = new ArrayList<>(30); // Мы ввели размер этого массива

        //3
        ArrayList<Integer> integerArrayList1 = new ArrayList<>(integerArrayList);
        integerArrayList1.add(6);
        System.out.println(integerArrayList1); // Выводится тоже элементы другого массива + новый элемент
        System.out.println(integerArrayList == integerArrayList1); // проверка ссылаются ли массивы на один и тот самый обьект
    }
}

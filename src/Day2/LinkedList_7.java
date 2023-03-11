package Day2;

import java.util.LinkedList;

public class LinkedList_7 {
    /**
     * LinkedList отличается от ArrayList тем что LinkedList является цепочкой, там где элемент имеет ссылку на ссылку
     * прудыдущего обьекта и следующего.
     *
     * Приклад 1: создание телефонов Samsung, Xiaomi, Iphone, где у Samsung есть ссылка на предыдущий элемент "null", и
     * следующий Xiaomi, в то время как у Xiaomi есть ссылка на предыдущий Samsung и следующий Iphone.
     *
     * Приклад 2: При добавлении или удалении элементов цепочка меняется у места куда был добавлен(под какой индекс)
     * элемент
     *
     * Обычно LinkedList используется там где мало get потому-что чтобы найти что-то поиск должен пройти по всей цепочке
     * пока не найдет нужный нам элемент
     * Но хорошо использовать там где есть частое добавление или удаление элементов потому что не трубется большое
     * изменение в структуре колекции, в то время как в ArrayList при добавлении или удалении чего-то происходит сдвиг
     * на какое-то количесвто мест
     */
    public static void main(String[] args) {
        Smartphones smartphone = new Smartphones("Galaxy A13","Samsung",2020);
        Smartphones smartphone1 = new Smartphones("Redmi Note 10","Xiaomi",2021);
        Smartphones smartphone2 = new Smartphones("14 Pro","Iphone",2022);
        LinkedList<Smartphones> smartphonesLinkedList = new LinkedList<>();
        smartphonesLinkedList.add(smartphone);
        smartphonesLinkedList.add(smartphone1);
        smartphonesLinkedList.add(smartphone2);
        System.out.println("==================================1================================");
        System.out.println();
        for (Smartphones s:smartphonesLinkedList){
            System.out.println(s);
        }
        System.out.println();
        System.out.println("==================================2=================================");
        System.out.println();

        Smartphones smartphone4 = new Smartphones("M5 Note","Meizu",2018);
        smartphonesLinkedList.add(1,smartphone4);
        for (Smartphones s:smartphonesLinkedList){
            System.out.println(s);
        }
        System.out.println();
        System.out.println("==================================3=================================");
        System.out.println();

        smartphonesLinkedList.remove(2);
        for (Smartphones s:smartphonesLinkedList){
            System.out.println(s);
        }
    }
}
class Smartphones{
    private String model;
    private String name;
    private  int year;
    public Smartphones(String model, String name, int year){
        this.model = model;
        this.name = name;
        this.year = year;
    }
    public String toString(){
        return "You have a smartphone - "+name+" "+model+". Which created in "+year;
    }
}
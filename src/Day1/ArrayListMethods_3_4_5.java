package Day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethods_3_4_5 {
    public static void main(String[] args) {
        Car car = new Car("Skoda","Octavia",2016);
        Car car1 = new Car("Audi","RSQ",2022);
        Car car2 = new Car("Volkswagen","Passat",2009);
        ArrayList<Car> carArrayList = new ArrayList<>();

        carArrayList.add(car);
        carArrayList.add(car1);  // Метод add додает в колекцию обьект
        carArrayList.add(car2);
        System.out.println(carArrayList);
        System.out.println();

        Car car3 = new Car("Pegout","SE 508",2020);
        carArrayList.set(0, car3); // додает новый элемент на заданное место
        System.out.println(carArrayList);
        System.out.println();

        System.out.println(carArrayList.get(2)); // Вызывает вывод обьекта под заданным индексом
        System.out.println();

        carArrayList.add(car3);
        System.out.println(carArrayList);
        carArrayList.remove(1); // вызывает удаление обьекта под указанным индексом
        System.out.println(carArrayList);
        System.out.println();
        System.out.println("МЕТОДЫ УРОКА  2");
        System.out.println();

        ArrayList<Car> carArrayList1 = new ArrayList<>();
        Car car4 = new Car("???","!!!",0000);
        carArrayList1.add(car4);
        carArrayList.addAll(carArrayList1); // додает все обьекты новго аррайлиста в старый аррайлист
        System.out.println(carArrayList);
        carArrayList.addAll(1,carArrayList1); // тоже самое что и сверху только на место указанного индекса
        System.out.println(carArrayList);
        System.out.println();

        System.out.println(carArrayList.size()); // указывает размер колекции
        System.out.println();

        Car car5 = new Car("Skoda","Octavia",2016);
        Car car6 = new Car("???","!!!",0000);
        carArrayList1.add(car5);
        carArrayList1.add(car6);
        System.out.println(carArrayList1.indexOf(car4)); // Указывает индекс !!ПЕРВОГО!! заданного обьекта даже если есть одинаковые
        System.out.println(carArrayList1.lastIndexOf(car6)); // тоже самое что и сверху но указывает !!ПОЛЕДНИЙ!!
        System.out.println();

        System.out.println(carArrayList1.toString()); // имеющиеся данные
        System.out.println();

        System.out.println(carArrayList1.contains(car5));// проверяет есть ли указаный обьект в колекции и выдает true если да
        System.out.println(carArrayList1.contains(car2));// проверяет есть ли указаный обьект в колекции и выдает false если нет
        System.out.println();


        carArrayList1.clear(); // удаляет все данные в колекции
        System.out.println(carArrayList1);
        System.out.println();

        System.out.println(carArrayList.isEmpty()); // проверяет пустая ли колекция если нет - false
        System.out.println(carArrayList1.isEmpty()); // проверяет пустая ли колекция если да - true
        System.out.println();
        System.out.println("МЕТОДЫ УРОКА 3");
        System.out.println();

        //////////////////////////////////////////////

        Integer[] integers = {5,6,7,8,9,10};
        List<Integer> integerList = Arrays.asList(integers);
        // С помощтью Arrays.asList с массива или ArrayList на выходе можно достать List
        System.out.println(integerList);
        StringBuilder sb1 = new StringBuilder("5");
        StringBuilder sb2 = new StringBuilder("7");
        StringBuilder sb3 = new StringBuilder("9");
        StringBuilder sb4 = new StringBuilder("11");
        StringBuilder[] arrayStrings = {sb1, sb2, sb3, sb4};
        List<StringBuilder> stringBuilderList = Arrays.asList(arrayStrings); // List прямо зависит от содержимого скобок в конце
        System.out.println(stringBuilderList);
        System.out.println();

       ArrayList<String> names = new ArrayList<>();
        names.add("Ivan");
        names.add("Andriy");
        names.add("Petro");
        names.add("Artem");
        names.add("Misha");
        ArrayList<String> names1 = new ArrayList<>();
        names1.add("Ivan");
        names1.add("Petro");;
        names1.add("Misha");
       System.out.println(names);
        System.out.println();

//        names.removeAll(names1);  //Удаление с аррайлиста names одинаковых обьектов аррайлиста names1
//       System.out.println(names);
//            System.out.println();

//        names.retainAll(names1);  //Удаляет те файлы с аррайлиста names которых нету в names1
//        System.out.println(names);
//        System.out.println();

        boolean a = names.containsAll(names1); // проверяет если ли все обьекты листа names1 в листе names
        // Если есть ответ true если нету ответ false
        System.out.println(a);
        System.out.println();

        List<String> subList = names.subList(1, 4); // Создвет лист который является урывком первого листа, и в этот урывок
        // входят только те обьекты координаты которых мы указали. ОБЬЕКТ ПОД ПОСЛЕДНЕЙ КООРДИНАТОЙ НЕ СОЗДАЕТСЯ
        System.out.println(subList);
        subList.add("Anton"); // если в subList добавить какойто обьект он автоматически создается и в листе урывком которого
        // являестя subList
        System.out.println(names);
        System.out.println();

        Object[] arrayNames1 = names1.toArray(); // Создает с Листа или АррайЛиста простой массив
        System.out.println(Arrays.toString(arrayNames1));
        String[] arrayNames2 = names1.toArray(new String[0]); // Создает с Листа или АррайЛиста массив какого-то типа
        System.out.println(Arrays.toString(arrayNames2));
        System.out.println();

        List<String> list = List.of("Hello","My","Name","Is","Andrew"); // Упрощенное создаение !!!ПОТОМ ИЗМЕНЯТЬ НИКАК НЕЛЬЗЯ
        System.out.println(list);
        System.out.println();

        List<Integer> integerList1 = List.copyOf(integerList); // Копирует данные другого листа !!!ПОТОМ ИЗМЕНЯТЬ НИКАК НЕЛЬЗЯ
        System.out.println(integerList1);
    }
}
class Car{
    private String name;
    private String model;
    private int year;
    public Car(String name, String model, int year){
        this.model = model;
        this.year = year;
        this.name = name;
    }
    public String toString(){
        return name + " " + model + " " + year;
    }
}
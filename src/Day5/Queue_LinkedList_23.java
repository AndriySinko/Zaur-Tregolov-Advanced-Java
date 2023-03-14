package Day5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queue_LinkedList_23 {
    /**
     * Queue - коллекция которая работает как очередь(хранит последовательность элементов. Элементы всегда добавляются
     * в конец очереди, работа с элементами всегда происходит в начале очереди по принципе FIFO(First input, first output)
     *
     * У интерфейса Queue есть:
     * 1. Интерфейс Deque который имплементируется классами LinkedList и ArrayDeque
     * LinkedList имплементирует не только List но и Deque и само собой Queue
     * 2. Интерфейс AbstractQueue который имплементируется классом PriorityQueue
     */
    public static void main(String[] args) {
        Queue<String> stringQueue = new LinkedList<>();
        stringQueue.add("Andriy"); // если очередь ограниченая и вы вышли за пределы очереди с помощью add выбросится Exception
        stringQueue.offer("Ruslan"); // А тут Exception не выбросится если выйдете за пределы очереди а добавится null
        stringQueue.add("Petr");
        stringQueue.offer("Igor");
        stringQueue.add("Artem");
        System.out.println(stringQueue);
        System.out.println(stringQueue.remove()+" - Удаление"); // Удаляет элементы в начале очереди, если выйдете за
                                                                // очередь выбросится Exception
        System.out.println(stringQueue);
        System.out.println(stringQueue.element()+" - Начало"); //Указывает элемент который стоит в начале очереди, при выходе за
                                                    // очередь выбросится Exception
        System.out.println();

        System.out.println(stringQueue.poll()+" - Удаление"); // Удаляет элементы в начале очереди, если выйдете за
                                                             // очередь выбросится null
        System.out.println(stringQueue);
        System.out.println(stringQueue.peek()+" - Начало"); //Указывает элемент который стоит в начале очереди, при выходе за
                                                // очередь выбросится null

    }
}

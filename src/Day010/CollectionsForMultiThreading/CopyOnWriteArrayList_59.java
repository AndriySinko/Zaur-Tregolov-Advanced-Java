package MultiHreading.CollectionsForMultiThreading;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayList_59 {
    /**
     * CopyOnWriteArrayList - имплементирует интерфейс List.
     * CopyOnWriteArrayList работает по принципу копироания и запоминания содержимого нашого листа и дальнейшего
     * возйдействия с ним, ему все равно что происходит в других потоках, он работает с теми данныит которые он запомнил.
     *
     * Поэтому его стоит использоваь тогда, когда нам нужно добится потоко безопасности и у нас нету много операций изменения
     * элементов, а есть много операций их чтения.
     *
     */
    public static void main(String[] args) throws InterruptedException {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        System.out.println(list);
        Runnable runnable1 = ()->{
         for(int i=1;i<10;i++){
             list.add(i);
         }
        };
        Runnable runnable2 = ()->{
            Iterator<Integer> iterator = list.iterator();
            while (iterator.hasNext()){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(iterator.next());
                }
        };
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();
        System.out.println(list);
    }
}

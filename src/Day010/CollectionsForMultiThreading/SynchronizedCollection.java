package MultiHreading.CollectionsForMultiThreading;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronizedCollection {
    /**
     * Чтобы работать с колекциями с разныъ потоков, нельзя использовать обычные коллекции, но можно их обернуть с помощью
     * synchronized и дальше работать с ними
     *
     * Обертка коллекций работает по принципу локов, с коллекцией должны работаьь 3 потока, то сначала будет работать
     * 1, закончит свою работу, потом 2, и 3.
     */
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i=0; i<50;i++){
            integers.add(i);
        }
        List<Integer> synchList = Collections.synchronizedList(integers);

        Runnable runnable1 = ()->{
          synchronized (synchList){
              Iterator<Integer> iterator = synchList.iterator();
              while(iterator.hasNext()){
                  System.out.println(iterator.next()+" - added");
              }
          }
        };

        Runnable runnable2 = ()->{
            synchronized (synchList){
                for (int x=1;x<25;x++){
                    System.out.println(synchList.remove(x)+" - removed");
                }
            }
        };
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread1.join();
        System.out.println(synchList);
        thread2.start();
        thread2.join();
        System.out.println(synchList);
    }
}

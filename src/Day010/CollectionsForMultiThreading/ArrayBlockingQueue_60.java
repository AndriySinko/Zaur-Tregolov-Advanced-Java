package MultiHreading.CollectionsForMultiThreading;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueue_60 {
    /**
     * ArrayBlockingQueue - потоко безопастная очередь с ограничеными размером.
     * Обычно один поток доьавляет что-то в конец, 2 забирает с начала
     */
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> integers = new ArrayBlockingQueue<>(5);
        new Thread(new Runnable(){
            public void run() {
                int i=0;
                while (true){
                    try {
                        integers.put(++i);
                        System.out.println("Додал: "+i+" "+integers);
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }).start();

        new Thread(()->{
            while (true){
                try {
                    Integer j = integers.take();
                    System.out.println("Забрал: "+j+" "+integers);
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
    }
}


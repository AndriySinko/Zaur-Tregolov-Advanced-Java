package MultiHreading.CollectionsForMultiThreading;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMap_58 {
    /**
     * Concurrent колекции - специальный коллекции предназначеня для многопоточности.
     * <p>
     * ConcurrentHashMap -имплементирует интерфейс ConcurrentMap который в свою очередь происходит от Map.
     * <p>
     * В ConcurrentHashMap может использоватся любое колтчесвто потоков одновременно если (кол-во потоков не превышает
     * колво бакетов(ячеек) в ConcurrentHashMap)
     * <p>
     * В случает если с обычным synchronized HashMap мы бы использовали многопоточность, то при воздействии с любой ячейкой
     * целая коллекция была в стадии лок, а при использовании ConcurrentHashMap в лок только идет та ячейка с которой воздействете
     * <p>
     * Ни key ни value не могут быть null
     */
    public static void main(String[] args) throws InterruptedException {

        Smartphones smartphone = new Smartphones("Galaxy A13", "Samsung", 2020);
        Smartphones smartphone1 = new Smartphones("Redmi Note 10", "Xiaomi", 2021);
        Smartphones smartphone2 = new Smartphones("14 Pro", "Iphone", 2022);
        Smartphones smartphone3 = new Smartphones("M5 Note", "Meizu", 2018);
        ConcurrentHashMap<Integer, Smartphones> map = new ConcurrentHashMap<>();
        map.put(1,smartphone);
        map.put(2,smartphone1);
        map.put(3,smartphone2);
        System.out.println(map+"\n");
        Runnable runnable = ()->{
            Iterator iterator = map.keySet().iterator();
            while (iterator.hasNext()){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                Integer i = (Integer) iterator.next();
                System.out.println(i+" :"+map.get(i));
            }
        };
        Runnable runnable1 = ()->{
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            map.put(4,smartphone3);
        };
        Thread thread = new Thread(runnable);
        Thread thread1 = new Thread(runnable1);
        thread.start();
        thread1.start();
        thread.join();
        thread1.join();
        System.out.println("\n"+map);
    }
}

class Smartphones {
    private String model;
    private String name;
    private int year;

    public Smartphones(String model, String name, int year) {
        this.model = model;
        this.name = name;
        this.year = year;
    }

    @Override
    public String toString() {
        return  name+" "+model+" "+year;
    }
}
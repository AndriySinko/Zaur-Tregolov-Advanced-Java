package Day010;

public class SleepJoin_ThreadState_35 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread1 start");
        for (int i = 10; i > 0; i--) {
            System.out.println("Thread1 : "+i);
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Ошибка");
        }
        System.out.println("Thread1 ends");
    }

    /**
     * Sleep - метод который заставляет наш поток спать на заданое намми в параметрах метода количесвто милисекунд
     * Join - метод который просит чтобы поток в котором выполняется какй-то другой поток, подождал пока выполнится
     * тот поток.
     * Если в параметры метода Join задать как-то количесвто милисекунд то в это будет означать что главный поток
     * должен ждать пока выполнится 2 поток, или пройдет то время которое мы задали и главный поток продолжит свое
     * выполнение
     * <p>
     * У потоков есть 3 значения
     * 1. New thread - новый поток который еще не использовался
     * 2.Runnable наш поток пришел в действие и он делится на:
     * -ready(ждет выполнения)
     * -running(выполняется)
     * 3.Terminal - закончил свою роботу
     */
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Thread1());
        SleepJoin_ThreadState_35 threadState35 = new SleepJoin_ThreadState_35();
        System.out.println("Main start");
        threadState35.start();
        threadState35.join();
        thread.start();
        thread.join();
        System.out.println("Main ends");
    }
}

class Thread1 implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread2 start");
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread2 : "+i);
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Ошибка");
        }
        System.out.println("Thread2 ends");
    }
}

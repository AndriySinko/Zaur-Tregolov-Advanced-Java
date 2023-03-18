package MultiHreading.VariableToCreateThread;

public class ImplementsRunnable_1 {
    /**
     * Так-же потоки можно моздать с помощью имплементации интерфейса Runnable в котором есть только один метод run
     */
    public static void main(String[] args) {
        Thread thread = new Thread(new MyThread1());
        thread.start();
        Thread thread1 = new Thread(new MyThread2());
        thread1.start();
        for (int i=0;i<150;i++){
            System.out.println("Main - "+i);
        }
    }
}
class MyThread1 implements Runnable{
    @Override
    public void run() {
        for(int i = 300;i>0;i--){
            System.out.println("Поток №1 : "+i);
        }
    }
}

class MyThread2 implements Runnable{
    @Override
    public void run() {
        for(double i = 0;i<300;i++){
            i=i+0.1;
            System.out.println("Поток №2 : "+"{{HELLO}} "+i);
        }
    }
}
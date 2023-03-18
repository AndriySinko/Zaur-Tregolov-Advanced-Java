package MultiHreading.VariableToCreateThread;

public class ImplementsRunnable_2 implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello");
    }

    /**
     * Также и наш public class может имплементировать Runnable
     */
    public static void main(String[] args) {
        Thread imp = new Thread(new ImplementsRunnable_2());
        System.out.println("Hi");
        System.out.println("Bye");
        imp.start();
    }
}

package MultiHreading.VariableToCreateThread;

public class ExtendsTread_2 extends Thread {
    public void run() {
        for (int i = 300; i > 0; i--) {
            System.out.println("Extends " + i);
        }
    }

    /**
     *Также наследовать класс Thread может и сам public class
     */
    public static void main(String[] args) {
        ExtendsTread_2 tread2 = new ExtendsTread_2();
        for (int i = 0;i<100;i++){
            System.out.println("Main");
        }
        tread2.start();
    }
}

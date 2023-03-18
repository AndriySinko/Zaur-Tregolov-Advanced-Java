package MultiHreading.VariableToCreateThread;

public class ExtendsTread_1 {
    /**
     * Создать новый поток можно с помощью наследования специального класса
     *
     * Потоки выполняются одновременно, они не являются синхронизироваными поэтому каждый поток может
     * начать и закончить работать в любой промежуток времени.
     *
     * Main так-же как и наши созданные потоки, тоже является потоком
     */
    public static void main(String[] args) {
        MtThread1 mtThread1 = new MtThread1();
        MtThread2 mtThread2 = new MtThread2();
        mtThread1.start();
        for(int i = 0;i<300;i++){
            System.out.println("Поток {{Main}} "+i);
        }
        mtThread2.start();
    }
}
class MtThread1 extends Thread{
    @Override
    public void run() {
        for(int i = 300;i>0;i--){
            System.out.println("Поток №1 : "+i);
        }
    }
}

class MtThread2 extends Thread{
    @Override
    public void run() {
        for(int i = 0;i<300;i++){
            System.out.println("Поток №2 : "+"{{HELLO}} "+i);
        }
    }
}
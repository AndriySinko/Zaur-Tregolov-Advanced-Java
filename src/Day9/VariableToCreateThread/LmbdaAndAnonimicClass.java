package MultiHreading.VariableToCreateThread;

public class LmbdaAndAnonimicClass {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonimic class");
            }
        }).start();
        new Thread(()-> System.out.println("Lambda")).start();
    }
}

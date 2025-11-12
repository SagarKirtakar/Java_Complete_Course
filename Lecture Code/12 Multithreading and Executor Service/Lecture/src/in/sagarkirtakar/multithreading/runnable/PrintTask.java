package in.sagarkirtakar.multithreading.runnable;

public class PrintTask implements Runnable{

    private final char targetChar;

    public PrintTask(char targetChar) {
        this.targetChar = targetChar;
    }

    @Override
    public void run() {
        for(int i=1; i<=1000; i++) {
            System.out.printf("%d:%c ", i,targetChar);
        }
        System.out.printf("\n%c Task Complete\n", targetChar);
    }
}

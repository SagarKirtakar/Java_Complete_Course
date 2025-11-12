package in.sagarkirtakar.multithreading.threadClass;

public class ThirdTask extends Thread{
    private final char targetChar;

    public ThirdTask(char targetChar) {
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

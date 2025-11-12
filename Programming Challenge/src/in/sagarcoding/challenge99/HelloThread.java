package in.sagarcoding.challenge99;

public class HelloThread extends Thread{

    private final int threadNumber;

    public HelloThread(int threadNumber) {
        this.threadNumber = threadNumber;
        
    }

    @Override
    public void run() {
        for(int j = 0; j <10 ; j++) {
            System.out.printf("(%d) %s Hello from Thread- %d\n" , (j+1), Thread.currentThread().getName(),threadNumber);
        }
    }
}

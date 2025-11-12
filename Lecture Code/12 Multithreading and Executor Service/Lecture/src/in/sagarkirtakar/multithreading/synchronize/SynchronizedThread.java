package in.sagarkirtakar.multithreading.synchronize;

public class SynchronizedThread extends Thread{

    private final Counter counter;

    public SynchronizedThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
       for(int i= 0; i < 1000; i++) {
           counter.increment();
       }
    }
}

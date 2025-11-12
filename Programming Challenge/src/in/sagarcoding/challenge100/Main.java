package in.sagarcoding.challenge100;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadState t1 = new ThreadState();
        System.out.printf("\nCreating the thread: %s", t1.getState());

        t1.start();
        t1.join();
        System.out.printf("\nFinished the thread: %s", t1.getState());
    }
}

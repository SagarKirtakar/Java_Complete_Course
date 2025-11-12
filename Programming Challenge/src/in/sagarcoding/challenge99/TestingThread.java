package in.sagarcoding.challenge99;

public class TestingThread {
    public static void main(String[] args) throws InterruptedException {
        HelloThread t1 = new HelloThread(1);
        HelloThread t2 = new HelloThread(2);

        t1.start();
        t2.start();

    }
}

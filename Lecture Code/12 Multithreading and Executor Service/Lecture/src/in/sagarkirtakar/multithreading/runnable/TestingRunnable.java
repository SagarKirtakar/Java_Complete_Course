package in.sagarkirtakar.multithreading.runnable;

public class TestingRunnable {
    public static void main(String[] args) {
        PrintTask t1 = new PrintTask('!');
        t1.run();

        PrintTask t2 = new PrintTask('@');
        t2.run();
    }
}

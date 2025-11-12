package in.sagarkirtakar.multithreading.threadClass;

public class ExtendingThreadClass {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        PrintTask t1 = new PrintTask('F');
        SecondTask t2 = new SecondTask('S');
        ThirdTask t3 = new ThirdTask('T');

        System.out.println("Starting First Thread");
        t1.setPriority(Thread.MIN_PRIORITY);    // Thread Priority
        t1.start();
        System.out.println("Starting Second Thread");
        t2.setPriority(Thread.NORM_PRIORITY);
        t2.start();
        System.out.println("Starting Third Thread");
        t3.setPriority(Thread.MAX_PRIORITY);
        t3.start();

        long endTime = System.currentTimeMillis();
        System.out.printf("Total time taken: %d", (endTime - startTime));
    }
}

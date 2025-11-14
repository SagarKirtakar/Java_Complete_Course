package in.sagarkirtakar.executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestingMultiThreadExecutor {
    public static void main(String[] args) throws InterruptedException {
       ExecutorService service = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 100; i++) {
            Thread.sleep(30);
            Runnable task = new PrintTask((char)i);
            service.submit(task);
        }

//        Runnable task1 = new PrintTask('@');
//        Runnable task2 = new PrintTask('#');
//        Runnable task3 = new PrintTask('$');
//        Runnable task4 = new PrintTask('*');
//
//        service.submit(task1);
//        service.submit(task2);
//        service.submit(task3);
//        service.submit(task4);

        service.shutdown();
        System.out.println("\n*****************1");

        if(!service.awaitTermination(10, TimeUnit.SECONDS)) {
            service.shutdownNow();
            System.out.println("\n*****************2");
        }
    }
}

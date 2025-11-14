package in.sagarkirtakar.executor;

import in.sagarkirtakar.multithreading.runnable.PrintTask;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestingSingleThreadExecutor {
    public static void main(String[] args) {
       ExecutorService service = Executors.newSingleThreadExecutor();

        Runnable task1 = new PrintTask('@');
        Runnable task2 = new PrintTask('#');
        Runnable task3 = new PrintTask('$');

        service.submit(task1);
        service.submit(task2);
        service.submit(task3);

        service.shutdown();
    }
}

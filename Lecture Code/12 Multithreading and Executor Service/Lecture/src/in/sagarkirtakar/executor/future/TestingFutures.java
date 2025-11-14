package in.sagarkirtakar.executor.future;

import java.util.concurrent.*;

public class TestingFutures {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(1);

        getName task1 = new getName("Sagar");
        getName task2 = new getName("Kunal");
        getName task3 = new getName("Vishal");
        getName task4 = new getName("Pawan");

        Future<String> name1 = service.submit(task1);
        Future<String> name2 = service.submit(task2);
        Future<String> name3 = service.submit(task3);
        Future<String> name4 = service.submit(task4);


        System.out.printf("\n Full name is: %s",name1.get());
        System.out.printf("\n Full name is: %s",name2.get());
        System.out.printf("\n Full name is: %s",name3.get());
        System.out.printf("\n Full name is: %s",name4.get());

        service.shutdown();

    }
}

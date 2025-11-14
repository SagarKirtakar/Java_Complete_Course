package in.sagarcoding.challenge103;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class singleThreadExecutor {
    public static void main(String[] args) {
      ExecutorService service = Executors.newSingleThreadExecutor();

        Runnable task = new PrintNumbers();

        service.submit(task);

        service.shutdown();
    }
}

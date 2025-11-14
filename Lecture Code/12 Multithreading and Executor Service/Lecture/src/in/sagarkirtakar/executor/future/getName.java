package in.sagarkirtakar.executor.future;

import java.util.concurrent.Callable;

public class getName implements Callable<String> {

    private final String name;

    public getName(String name) {
        this.name = name;
    }


    @Override
    public String call() throws Exception {
        System.out.println("\nReturning full name from the server: "+ name);
        Thread.sleep(4000);
        return name + " Indian";
    }
}

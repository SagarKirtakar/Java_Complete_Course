package in.sagarcoding.challenge104;

public class SleepTask implements Runnable{

//    private final char getchar;
//
//    public SleepTask(char getchar) {
//        this.getchar = getchar;
//    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
           Thread current =  Thread.currentThread();
            System.out.printf("Started with Thread: %s\n",current.getName());
            try {
                Thread.sleep( getRandom() * 1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.printf("Ended with Thread: %s\n",current.getName());
        }
    }

    private int getRandom() {
        double random = Math.random() * 5 + 1;
        return (int) random;
    }
}

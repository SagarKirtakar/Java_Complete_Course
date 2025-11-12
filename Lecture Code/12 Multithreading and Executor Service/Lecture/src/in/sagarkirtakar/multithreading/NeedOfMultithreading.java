package in.sagarkirtakar.multithreading;

public class NeedOfMultithreading {
    public static void main(String[] args) {

        long starTime = System.currentTimeMillis();

        // First Task
        for(int i=1; i<=1000; i++) {
            System.out.printf("%d:* ", i);
        }
        System.out.println("\nFirst task is done.");

        // Second Task
        for(int i=1; i<=1000; i++) {
            System.out.printf("%d:& ", i);
        }
        System.out.println("\nSecond task is done.");

        // Third Task
        for(int i=1; i<=1000; i++) {
            System.out.printf("%d:$ ", i);
        }
        System.out.println("\nThird task is done.");

        long endTime = System.currentTimeMillis();
        System.out.printf("Total time taken is %d", (endTime - starTime));
    }

}

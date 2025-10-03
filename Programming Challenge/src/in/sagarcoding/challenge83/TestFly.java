package in.sagarcoding.challenge83;

public class TestFly {
    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        eagle.fly();
        System.out.println(eagle.breed);
        System.out.println(eagle.getBreed());
    }
}

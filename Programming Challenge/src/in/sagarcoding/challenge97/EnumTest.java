package in.sagarcoding.challenge97;

public class EnumTest {
    public static void main(String[] args) {
        System.out.println("Print all the days of the weeek: ");

        for (Days value : Days.values()) {
            System.out.printf("%s : %s\n", value,value.getType());
        }
    }
}

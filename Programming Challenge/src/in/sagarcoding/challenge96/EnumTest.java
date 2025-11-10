package in.sagarcoding.challenge96;

public class EnumTest {
    public static void main(String[] args) {
        System.out.println("Print all the days of the weeek: ");
        System.out.println(Days.SUNDAY);
        System.out.println(Days.MONDAY);
        System.out.println(Days.TUESDAY);
        System.out.println(Days.WEDNESDAY);
        System.out.println(Days.THURSDAY);
        System.out.println(Days.FRIDAY);
        System.out.println(Days.SATURDAY);

        for (Days value : Days.values()) {
            System.out.println(value);
        }
    }
}

package in.sagarkirtakar.enums;

public class TestingEnums {
    public static void main(String[] args) {
        TrafficLight color = TrafficLight.YELLOW;

        System.out.println(color);

        color = TrafficLight.RED;

        System.out.println(color);

        color = TrafficLight.GREEN;

        System.out.println(color);

        Grade grade = Grade.A;

        System.out.println(grade);

        grade = Grade.D;

        System.out.println(grade);

        Grade set = Grade.valueOf("D");

        System.out.println(set);

        for (Grade value : Grade.values()) {
            System.out.println(value);
        }
    }
}

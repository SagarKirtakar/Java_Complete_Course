package in.sagarkirtakar.enums;

public enum TrafficLight {

    RED("STOP"), GREEN("GO"), YELLOW("CAUTION");

    private final String action;


    TrafficLight(String action) {
        this.action = action;
    }
}

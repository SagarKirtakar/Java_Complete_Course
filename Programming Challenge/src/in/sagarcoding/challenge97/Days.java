package in.sagarcoding.challenge97;

public enum Days {

    SUNDAY(false),

    MONDAY(true),

    TUESDAY(true),

    WEDNESDAY(true),

    THURSDAY(true),

    FRIDAY(true),

    SATURDAY(false);

    private final boolean isWeekdays;

    Days(boolean isWeekdays) {
        this.isWeekdays = isWeekdays;
    }

    public String getType() {
        return isWeekdays ? "Weekday" : "Weekend";
    }
}

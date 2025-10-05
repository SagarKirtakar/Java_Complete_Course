package in.sagarcoding.challenge80;

public class DVD extends LibraryItem{

    private int durationInSeconds;

    public void DVD(int durationInSeconds){
        this.durationInSeconds = durationInSeconds;
    }

    public int getDurationInSeconds() {
        return durationInSeconds;
    }
}

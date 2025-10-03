package in.sagarcoding.challenge84;

public abstract class Bird implements Flyable {

    public final String breed;

    public  Bird(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
}

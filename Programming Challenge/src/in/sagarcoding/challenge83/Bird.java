package in.sagarcoding.challenge83;

public abstract class Bird implements Flyable{

    public final String breed;

    public  Bird(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
}

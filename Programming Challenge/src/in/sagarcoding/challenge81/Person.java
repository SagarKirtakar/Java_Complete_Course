package in.sagarcoding.challenge81;

import java.util.Objects;

public class Person {

    private int age;

    private String name;

    public static void main(String[] args) {
        Person obj = new Person();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }
}

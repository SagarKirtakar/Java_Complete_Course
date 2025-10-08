package in.sagarkirtakar;

public class StringTest {

    public static void main(String[] args) {

        int phno = 4521;

        StringBuilder obj = new StringBuilder("Sagar");
        obj.append(" Kirtakr ").append(phno);
        obj.append(" Welcome");
        obj.append(" to java programming");
        System.out.println(obj.toString());
    }
}

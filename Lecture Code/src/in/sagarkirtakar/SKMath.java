package in.sagarkirtakar;

public class SKMath {

    public static void main(String[] args) {

        System.out.println(Math.abs(-100));     // Convert negative to positive value

        System.out.println(Math.ceil(10.4));    // Round up double value

        System.out.println(Math.floor(10.6));   // Round down double value

        System.out.println(Math.round(10.4));   // Round up value 0.5 greater OR 0.5 less

        System.out.println(Math.max(10,10.4));

        System.out.println(Math.min(10,10.4));

        System.out.println(Math.sqrt(2));

        System.out.println(Math.pow(2,2));

        System.out.println(Math.random());

        for (int i = 0; i < 10; i++) {
            int random = (int) Math.round(Math.random() * 100);
            System.out.println(random);
        }

        System.out.println(Math.PI);

    }
}

package in.kgcoding;

public class AccessTest {

    public static void main(String[] args) {
        Car obj = new Car();
        obj.color = "Red";
        obj.model = "Mahindra";
        obj.costOfPurchase = 10;
        System.out.println(obj);

        Car ref = new Car("green","BMW",5,5000);
        System.out.println(ref);

    }
}

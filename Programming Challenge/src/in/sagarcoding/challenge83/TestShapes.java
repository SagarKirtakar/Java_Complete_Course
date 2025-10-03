package in.sagarcoding.challenge83;

public class TestShapes {
    public static void main(String[] args) {
        Square obj = new Square(10.3);
        Circle ref = new Circle(5);


        System.out.printf("Area of circle is %5.2f\n", ref.calculateArea());
        System.out.printf("Area of Square is %5.2f\n",obj.calculateArea());


    }

}

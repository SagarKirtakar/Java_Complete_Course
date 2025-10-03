package in.sagarcoding.challenge85;

public class Calculator {

    public int add(int x, int y) {
        return x + y;

    }

    public int add(int a, int b, int c) {
    return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator obj = new Calculator();
        System.out.println( obj.add(10.5, 20));
        System.out.println(obj.add(10, 20, 30));
        System.out.println( obj.add(5, 5));
    }
}

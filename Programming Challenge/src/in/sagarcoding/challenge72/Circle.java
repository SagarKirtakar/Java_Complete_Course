package in.sagarcoding.challenge72;

import java.util.Scanner;

public class Circle {

    double radiusInMm;

    public Circle(double radiusInMm) {
        this.radiusInMm = radiusInMm;
    }

    double getArea() {
        return Math.PI * Math.pow(radiusInMm, 2);
    }

    double getCircumference() {
        return  2 * radiusInMm * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle Props: Radius in mm: " +radiusInMm+
                ", Circumference in mm: "+ getCircumference()+
                ", Area in mm2: "+getArea();
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the world of circle\n");
        System.out.print("Please enter your radius:");
        double radiusInMm = input.nextDouble();
        Circle obj = new Circle(radiusInMm );
        System.out.println(obj);
    }
}

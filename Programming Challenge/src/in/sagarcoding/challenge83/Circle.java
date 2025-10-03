package in.sagarcoding.challenge83;

public class Circle extends Shape{

   private final double radiusIncms;

    public Circle(double radiusIncms) {
        this.radiusIncms = radiusIncms;
    }

    public double getRadiusIncms() {
        return radiusIncms;
    }

    double areaOfCircle;

    public double calculateArea() {
       return  Math.PI * Math.pow(radiusIncms, 2);
    }
}

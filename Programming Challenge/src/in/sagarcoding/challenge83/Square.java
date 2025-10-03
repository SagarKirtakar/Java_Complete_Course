package in.sagarcoding.challenge83;

public class Square extends Shape{

   private double sideIncms;

    public Square(double sideIncms) {
        this.sideIncms = sideIncms;
    }

    public double getSideIncms() {
       return sideIncms;
   }


    @Override
    public double calculateArea() {
    return  Math.pow(sideIncms, 2);
    }
}

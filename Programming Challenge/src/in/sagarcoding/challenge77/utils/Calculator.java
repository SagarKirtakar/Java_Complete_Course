package in.sagarcoding.challenge77.utils;

import in.sagarcoding.challenge77.geometry.Circle;
import in.sagarcoding.challenge77.geometry.Rectangle;

public class Calculator {
    public static void main(String[] args) {
        Circle obj = new Circle(5.5);
        Rectangle ref = new Rectangle(10, 5);

//      obj.AreaOfCircle();
//       ref.AreaOfRectangle();

        double CircleArea = (long) (Math.PI * obj.radiusOfCircle * obj.radiusOfCircle);
        double RecArea = ref.length * ref.breadth;
        System.out.printf("Area of circle is:- %f, Area of rectangle is:- %f",CircleArea, RecArea);
    }
}

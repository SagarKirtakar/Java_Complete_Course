package in.gettersetter;

public class Car {

    private String color;

    private String model;

    private double fuelLevel;

    private long costOfPurchase;

    public Car(String color,String model,double fuelLevel,long costOfPurchase ) {
        this.color = color;
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.costOfPurchase = costOfPurchase;
    }

    public String getColor() {
            return color;
    }

     public String getModel() {
        return model;
     }

     public void setColor(String color) {
        if(color.equals("Black")) {
            System.out.println("Legendry color..");
        } else  {
            this.color = color;
        }

     }
}

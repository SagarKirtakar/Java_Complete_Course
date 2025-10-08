package in.sagarkirtakar;

public class Car {

    int noOfWheels;

    int noOfDoors;

    String name;

    String color;

    String model;

    String company;

    public Car(int noOfWheels, int noOfDoors, String name, String color, String model, String company) {
        this.noOfWheels = noOfWheels;
        this.noOfDoors = noOfDoors;
        this.name = name;
        this.color = color;
        this.model = model;
        this.company = company;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("noOfWheels=").append(noOfWheels);
        sb.append(", noOfDoors=").append(noOfDoors);
        sb.append(", name='").append(name).append('\'');
        sb.append(", color='").append(color).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", company='").append(company).append('\'');
        sb.append('}');
        return sb.toString();
    }
//    @Override
//    public String toString() {
//        return "Car{" +
//                "noOfWheels=" + noOfWheels +
//                ", noOfDoors=" + noOfDoors +
//                ", name='" + name + '\'' +
//                ", color='" + color + '\'' +
//                ", model='" + model + '\'' +
//                ", company='" + company + '\'' +
//                '}';
//    }

    public static void main(String[] args) {

        Car obj = new Car(4, 4, "swift", "black", "SW8546", "Maruti");

        System.out.println(obj.toString());
    }
}

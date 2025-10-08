package in.sagarcoding.challenge76;

class Carfinal {

    final String name;

    final int noOfWheels;

    Carfinal(String name, int noOfWheels) {
        this.name = name;
        this.noOfWheels = noOfWheels;
//        this.noOfWheels++; variable noOfWheels might already have been assigned
    }

    public static void main(String[] args) {
        Carfinal finalobj = new Carfinal("Vishal",50);
        System.out.println(finalobj.name);
        System.out.println(finalobj.noOfWheels);
    }
}

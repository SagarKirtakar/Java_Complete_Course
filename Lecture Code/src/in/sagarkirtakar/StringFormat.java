package in.sagarkirtakar;

public class StringFormat {

    public static void main(String[] args) {

        String name = "Vishal";

        int marks = 6085789;

        System.out.println("Hello "+name+", your marks is "+marks);

        System.out.printf("Hello %s, your marks is %d %n",name,marks);

        System.out.printf("Hello %S, your marks is %d %n",name,marks);

        System.out.printf("Hello %15S, your marks is %d %n",name,marks);

        System.out.printf("Hello %-15S, your marks is %0,5d",name,marks);
    }
}

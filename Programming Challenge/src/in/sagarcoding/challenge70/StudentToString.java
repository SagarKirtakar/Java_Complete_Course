package in.sagarcoding.challenge70;

public class StudentToString {

    String name;

    int age;

    String house;

    int rollNumber;

    public StudentToString(String name, int age, String house, int rollNumber) {
        this.name = name;
        this.age = age;
        this.house = house;
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        return "Student {name:"+name+
                ", age:" +age+
                ", house:"+house+
                ", roll number:"+rollNumber;
    }

    public static void main(String[] args) {
        StudentToString obj = new StudentToString("Ankush", 25,"Saur",101);
        System.out.println(obj);
    }
}

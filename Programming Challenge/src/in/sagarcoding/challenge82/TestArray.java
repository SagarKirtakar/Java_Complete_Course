package in.sagarcoding.challenge82;

public class TestArray {

    public static void main(String[] args) {
        ArrayOperations obj = new ArrayOperations(new int[]{1,3,5,9});

        ArrayOperations.Statistics ref = obj.new Statistics();
        System.out.println(ref.mean());
    }
}

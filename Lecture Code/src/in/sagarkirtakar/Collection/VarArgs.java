package in.sagarkirtakar.Collection;

public class VarArgs {
    public static void main(String... args) {

        System.out.println(sum(1,10,1,2,3));

    }

    static int sum(int First, int second, int...a) {

        int sum = First + second;
        for(int i: a) {
            sum += i;
        }
        return sum;
    }

}

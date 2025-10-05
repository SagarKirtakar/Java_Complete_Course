package in.sagarcoding.challenge80;

public class Test {

    public static void main(String[] args) {

        Book book = new Book();
        book.checkout();
        book.returnItem();
        System.out.println(book.getiSBN());
        System.out.println(book.getClass());

        DVD obj = new DVD();
        obj.checkout();
        obj.returnItem();
        System.out.println(obj.getDurationInSeconds());
        System.out.println(obj.getClass());

        Magazine ref = new Magazine();
        ref.checkout();
        ref.returnItem();
        System.out.println(ref.getIssueNumber());
        System.out.println(ref.getClass());


    }
}

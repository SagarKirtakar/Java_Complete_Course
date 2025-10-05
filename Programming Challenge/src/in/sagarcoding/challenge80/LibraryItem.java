package in.sagarcoding.challenge80;

public class LibraryItem {

    private int itemId;

    private String author;

    private String title;

    public void checkout() {
        System.out.println("Checkout");
    }

    public void returnItem() {
        System.out.println("Returning the item");
    }
}

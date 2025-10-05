package in.sagarcoding.challenge80;

public class Book extends LibraryItem{

    private String iSBN;

    public void Book(String iSBN) {
        this.iSBN = iSBN;
    }

    public String getiSBN() {
        return iSBN;
    }
}

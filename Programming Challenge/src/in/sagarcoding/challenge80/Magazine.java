package in.sagarcoding.challenge80;

public class Magazine extends LibraryItem{

    private String issueNumber;

    public void Magazine(String issueNumber) {
        this.issueNumber = issueNumber;
    }

    public String getIssueNumber() {
        return issueNumber;
    }
}

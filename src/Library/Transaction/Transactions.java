package Library.Transaction;
import Library.Books.Books;
import Library.Member.Members;
import java.util.Date;

public class Transactions {
    private Books book;
    private Members member;
    private Date transactionDate;
    private String type; // "borrow" or "return"

    public Transactions(Books book, Members member, String type) {
        this.book = book;
        this.member = member;
        this.type = type;
        this.transactionDate = new Date();
    }

    public void process() {
        if (type.equals("borrow")) {
            book.borrowBook();
        } else if (type.equals("return")) {
            book.returnBook();
        }
    }

    public void displayInfo() {
        System.out.println("Transaction Type: " + type);
        System.out.println("Transaction Date: " + transactionDate);
        System.out.println("Book: " + book.getTitle());
        System.out.println("Member: " + member.getName());
        System.out.println();
    }
}


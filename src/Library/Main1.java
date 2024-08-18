import Library.Books.Books;
import Library.Member.Members;
import Library.Transaction.Transactions;
public class Main1 {
    public static void main(String[] args) {
        Books book = new Books("Pride and Prejudice", "Jane Austen", "123456789", 0);

        Members member = new Members("Manu", "M001");

        book.displayInfo();
        member.displayInfo();

        Transactions borrowTransaction = new Transactions(book, member, "borrow");
        borrowTransaction.process();
        borrowTransaction.displayInfo();

        Transactions returnTransaction = new Transactions(book, member, "return");
        returnTransaction.process();
        returnTransaction.displayInfo();

    }
}

package Library.Books;
public class Books {
    private String title;
    private String author;
    private String isbn;
    private int copies;

    public Books(String title, String author, String isbn, int copies) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.copies = copies;
    }

    public String getTitle() {
        return title;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Copies: " + copies);
        System.out.println();
    }

    public boolean isAvailable() {
        return copies > 0;
    }

    public void borrowBook() {
        if (isAvailable()) {
            copies--;
        } else {
            System.out.println("No copies available.");
            System.out.println();
        }
    }

    public void returnBook() {
        copies++;
    }
}
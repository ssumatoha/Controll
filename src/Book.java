public class Book {

    private String nameBook;
    private String author;

    public Book(String nameBook, String author) {
        this.nameBook = nameBook;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public String getNameBook() {
        return nameBook;
    }
}

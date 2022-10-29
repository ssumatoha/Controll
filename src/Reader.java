public class Reader {

    String fullName;
    int numberLibraryCard;
    String faculty;
    String dateOfBirth;
    String phoneNumber;

    public void takeBook(int numberOfBooks) {
        System.out.println(this.fullName + " взял " + numberOfBooks + "книги");
    }

    public void takeBook(String ... book) {
        System.out.print(this.fullName + " взял книги: ");
        for(int i = 0; i < book.length; i++) {
            System.out.println(book[i]);
        }
    }

    public void takeBook(Book ... books) {
        System.out.print(this.fullName + " взял книги: ");
        for(int i = 0; i < books.length; i++) {
            System.out.println(books[i].getNameBook());
        }
    }

    public void returnBook(int numberOfBooks) {
        System.out.println(this.fullName + " вернул " + numberOfBooks + "книги");
    }

    public void returnBook(String ... book) {
        System.out.print(this.fullName + " вернул книги: ");
        for(int i = 0; i < book.length; i++) {
            System.out.println(book[i]);
        }
    }

    public void returnBook(Book ... books) {
        System.out.print(this.fullName + " вернул книги: ");
        for(int i = 0; i < books.length; i++) {
            System.out.println(books[i].getNameBook());
        }
    }

    public void returnBook() {

    }

}

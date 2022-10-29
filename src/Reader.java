public class Reader {

    private String fullName;
    private int numberLibraryCard;
    private String faculty;
    private String dateOfBirth;
    private String phoneNumber;

    public Reader(String fullName, int numberLibraryCard, String faculty, String dateOfBirth, String phoneNumber) {
        this.fullName = fullName;
        this.numberLibraryCard = numberLibraryCard;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

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

}

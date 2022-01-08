public class DocumentManager {
    private static volatile DocumentManager instance;
    private Book Book;
    private DocumentManager() {}

    public static DocumentManager getInstance(){
        return instance;
    }

    public void setBook(Book book) {
        this.Book = book;
    }

    public Book getBook() {
        return Book;
    }


}
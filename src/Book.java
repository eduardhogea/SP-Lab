import java.util.ArrayList;

public class Book extends Section {
    private final String title;
    private ArrayList<Chapter> chapterList = new ArrayList<Chapter>();
    //private Author author;
    // private List<Author> authors;
    private final ArrayList<Author> autor;

    public Book(String title) {
        super(title);
        this.title = title;
        this.autor = new ArrayList<Author>();
    }

    public void addAuthor(Author autor) {
        this.autor.add(autor);
    }

    /*
        public void print() {
            System.out.println(this.title);
        }
    */
    public ArrayList<Chapter> getChapterList() {
        return chapterList;
    }

    public void setChapterList(ArrayList<Chapter> chapterList) {
        this.chapterList = chapterList;
    }

    public void print() {
        System.out.println("Book: " + this.title);

        System.out.println("Authors: ");
        for (Author i : this.autor) {
            System.out.print("Author: ");
            i.print();
        }
    }

}
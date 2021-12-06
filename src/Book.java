import java.util.ArrayList;

public class Book extends Section implements Element{
    private final ArrayList<Author> autor;
    private ArrayList<Author> authors;

    public Book(String title) {
        super(title);
        this.title = title;
        this.autor = new ArrayList<Author>();
    }

    public void addAuthor(Author autor){
        this.autor.add(autor);
    }
    /*
        public void print() {
            System.out.println(this.title);
        }
    */
    @Override
    public void print() {
        System.out.println("Book: " + this.title);

        System.out.println("Authors:");
        this.autor.forEach(Author::print);
        System.out.println();

        for(Element elem : this.elements)
            elem.print();
    }
}
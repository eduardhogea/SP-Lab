import java.util.ArrayList;

public class Book extends Section implements Element {
    private final ArrayList < Author > autor;
    private ArrayList < Author > authors;

    public Book(String title) {
        super(title);
        this.title = title;
        this.autor = new ArrayList < Author > ();
    }

    public void addAuthor(Author autor) {
        this.autor.add(autor);

    }

    public void addContent(Element content) {
        this.add(content);
    }

    /*
        public void print() {
            System.out.println(this.title);
        }
    */
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }


    @Override
    public void print() {
        System.out.println("Book: " + this.title);

        System.out.println("Authors: ");
        for (Author x: autor)
            x.print();

        for (Element e: this.elements)
            e.print();
    }
}
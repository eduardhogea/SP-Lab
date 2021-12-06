import java.util.ArrayList;

public class Section implements Element {
    protected String title;
    protected ArrayList < Element > elements = new ArrayList < Element > ();

    public Section(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println(this.title);
        this.elements.forEach(Element::print);
    }

    @Override
    public void add(Element element) {
        this.elements.add(element);
    }

    @Override
    public void remove(Element element) {
        this.elements.remove(element);
    }
}
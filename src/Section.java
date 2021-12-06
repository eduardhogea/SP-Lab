import java.util.ArrayList;


public class Section implements Element {

    protected String title;
    protected ArrayList<Element> elements;

    public Section(String title) {
        this.title = title;
        this.elements = new ArrayList<Element>();
    }

    @Override
    public void print() {
        System.out.println(title);

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

    @Override
    public Element get(int index) {
        return elements.get(index);
    }


}
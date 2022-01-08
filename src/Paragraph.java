public class Paragraph implements Element {
    private final String text;
    private AlignStrategy strategy;

    public Paragraph(String str) {
        this.text = str;
        this.strategy = null;
    }

    public void print() {
        System.out.println("Paragraph: " + this.text);
    }

    @Override
    public void add(Element element) {

    }

    @Override
    public void remove(Element element) {

    }
    public void setAlignStrategy(AlignStrategy strategy) {
        this.strategy = strategy;
    }
}
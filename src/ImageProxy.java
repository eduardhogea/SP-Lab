public class ImageProxy implements Element, Picture {
    private Image realImage;
    private final String url;

    public ImageProxy(String url) {
        this.url = url;
        this.realImage = null;
    }

    public Image loadImage() {
        if (this.realImage == null) {
            this.realImage = new Image(this.url);
        }
        return this.realImage;
    }

    @Override
    public void print() {
        loadImage();
        this.realImage.print();
    }

    @Override
    public void add(Element element) {

    }

    @Override
    public void remove(Element element) {

    }

    @Override
    public String url() {
        return this.url;
    }

    @Override
    public void dimension() {

    }

    @Override
    public void content() {

    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
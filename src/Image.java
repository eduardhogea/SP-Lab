public class Image implements Element {
    private final String imageName;

    public Image(String imageName) {
        this.imageName = imageName;
    }

    public void print() {
        System.out.println("Image with title: " + this.imageName);
    }

    @Override
    public void add(Element element) {


    }

    @Override
    public void remove(Element element) {


    }

    @Override
    public Element get(int index) {

        return null;
    }
}
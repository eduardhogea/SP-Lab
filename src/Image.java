import java.util.concurrent.TimeUnit;

public class Image implements Picture, Element {
    private final String realImage;

    public Image(String realImage) {
        this.realImage = realImage;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException exp) {
            exp.printStackTrace();
        }
    }

    @Override
    public void print() {
        System.out.println("Image with name: " + this.realImage);
    }

    @Override
    public void add(Element element) {

    }

    @Override
    public void remove(Element element) {

    }

    @Override
    public String url() {
        return this.realImage;
    }

    @Override
    public void dimension() {

    }

    @Override
    public void content() {

    }
}
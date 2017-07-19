
/**
 * participant: Proxy
 */
public class ProxyImage implements Image {

    private final String filename;
    private Image realImage;

    public ProxyImage(String filename) {
        realImage = null;
        this.filename = filename;
    }

    @Override
    public void displayImage() {
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        realImage.displayImage();
    }

}

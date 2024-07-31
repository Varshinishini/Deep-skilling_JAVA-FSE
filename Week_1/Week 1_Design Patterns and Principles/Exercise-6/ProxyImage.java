package ProxyPatternExample;

public class ProxyImage implements Image {
    private String imagePath;
    private RealImage realImage;

    public ProxyImage(String imagePath) {
        this.imagePath = imagePath;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(imagePath);
        }
        realImage.display();
    }
}

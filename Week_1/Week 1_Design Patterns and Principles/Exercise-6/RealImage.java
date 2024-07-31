package ProxyPatternExample;

public class RealImage implements Image {
    private String imagePath;

    public RealImage(String imagePath) {
        this.imagePath = imagePath;
        loadImageFromServer();
    }

    private void loadImageFromServer() {
        System.out.println("Loading image from server: " + imagePath);
        // Simulate delay for loading the image
        try {
            Thread.sleep(2000); // Simulate loading time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void display() {
        System.out.println("Displaying image: " + imagePath);
    }
}
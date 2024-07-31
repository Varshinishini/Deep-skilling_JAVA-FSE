package ProxyPatternExample;

public class TestProxyPattern {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("image1.jpg");
        Image image2 = new ProxyImage("image2.jpg");

        // Image will be loaded from server and displayed
        image1.display();
        System.out.println();

        // Image will not be loaded from server again, but will be displayed
        image1.display();
        System.out.println();

        // Image will be loaded from server and displayed
        image2.display();
        System.out.println();

        // Image will not be loaded from server again, but will be displayed
        image2.display();
    }
}

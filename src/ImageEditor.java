import java.io.IOException;

public class ImageEditor {
    public static void main(String[] args) throws IOException {
        ImageHandler imageHandler = new ImageHandler();
        imageHandler.getImage();
        imageHandler.getColor();
        imageHandler.changeColor();
        imageHandler.saveImage();
    }
}

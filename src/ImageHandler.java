import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageHandler {
    private BufferedImage image;
    private int cl;
    public void getImage() throws IOException {
        String imagePath = "input/image.png";
        image = ImageIO.read(new File(imagePath));
        System.out.println("Файл загружен");
    }
    void getColor() {
        cl = image.getRGB(0, 0);
        System.out.println("RGB: " + cl);
        int alpha = (cl >> 24) & 0xff;
        int red = (cl >> 16) & 0xff;
        int green = (cl >>  8) & 0xff;
        int blue = (cl) & 0xff;
        System.out.println("a: " + alpha + " r: " + red + " g: " + green + " b: " + blue);
    }
    void changeColor() {
        int width = image.getWidth();
        int height = image.getHeight();
        for (int i = 0; i < width; i++){
            for (int j = 0; j < height; j++){
                int originalColor = image.getRGB(i,j);
                if (originalColor == cl){
                    image.setRGB(i, j, Color.WHITE.getRGB());
                }
            }
        }
    }
    public void saveImage() throws IOException {
        File outputFile = new File("output/image.png");
        ImageIO.write(image, "PNG", outputFile);
        System.out.println("Файл записан");
    }
}

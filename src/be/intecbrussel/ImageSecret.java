package be.intecbrussel;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;

public class ImageSecret {

    public static void addImageSecret() {

        Path path = Path.of("./Secret_Folder/Secret_Picture.jpg");

        try {
            Files.createDirectories(path.getParent());
        }
        catch (IOException ioException) {
            ioException.printStackTrace();
        }

        BufferedImage image;
        File f;

        try {
            f = path.toFile();
            image = ImageIO.read(new URL("https://worldstories.org.uk/content/book/262/__picture_9352.jpg"));
            ImageIO.write(image, "jpg", f);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}

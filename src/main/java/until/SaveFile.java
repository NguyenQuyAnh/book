package until;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageOutputStream;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;
import java.util.List;

public class SaveFile {

    public static void saveToFile(List<String> urls, File file)
    {
        try {
            for (String url : urls)
            {
                URL imageURL = new URL(url);
                BufferedImage saveImage = ImageIO.read(imageURL);
                ImageIO.write(saveImage, "png", (ImageOutputStream) file);
            }
        } catch(Exception e)    {
            e.printStackTrace();
        }
    }
}

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Binarizer {

    public BufferedImage toBinary(BufferedImage buf){

        System.out.print("Binarizing image...");

        BufferedImage bw = new BufferedImage(buf.getWidth(), buf.getHeight(), BufferedImage.TYPE_BYTE_BINARY);
        File bwImg = new File("bw.jpg");

        Graphics2D gfx = bw.createGraphics();
        gfx.drawImage(buf, 0, 0, null);

        try {
            ImageIO.write(bw, "jpg", bwImg);
        }catch (IOException e){
            e.printStackTrace();
        }

        System.out.println("done.");
        return bw;
    }
}

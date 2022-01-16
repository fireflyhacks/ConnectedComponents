import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Grayscaler {

    BufferedImage buf = null;

    private void getBuf(String fileName){

        try {
            buf = ImageIO.read(getClass().getResource(fileName));
        } catch(IOException e){
            e.printStackTrace();
        }
    }

    public BufferedImage Grayscale(String fileName){

        System.out.print("Converting to grayscale...");

        int grayVal;
        Color getColor;
        Color grayScale;

        getBuf(fileName);

        for(int i = 0; i < buf.getWidth(); i++){
            for(int j = 0; j < buf.getHeight(); j++){

                getColor = new Color(buf.getRGB(i, j));
                grayVal = (int)(getColor.getRed()   * 0.299) +
                          (int)(getColor.getGreen() * 0.587) +
                          (int)(getColor.getBlue()  * 0.114);

                grayScale = new Color(grayVal, grayVal, grayVal);
                buf.setRGB(i, j, grayScale.getRGB());
            }
        }

        System.out.println("done.");
        return buf;
    }
}

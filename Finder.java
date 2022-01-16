import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class Finder {


    private HashMap<String, Integer> labels = new HashMap<>();
    private int pixLabel = 1;


    private String getTuple(int x, int y) {
        return "(" + x + "," + y + ")";
    }


    private void Recolor(BufferedImage buf) {

        BufferedImage Cbuf = new BufferedImage(buf.getWidth(), buf.getHeight(), BufferedImage.TYPE_INT_RGB);

        System.out.print("Writing colorized image...");

        for (int i = 0; i < buf.getWidth(); i++) {
            for (int j = 0; j < buf.getHeight(); j++) {

                String key = getTuple(j, i);

                Color green = new Color(0, 255, 0);
                Color blue = new Color(0, 0, 255);
                Color yellow = new Color(255, 255, 0);
                Color cyan = new Color(0, 255, 255);
                Color magenta = new Color(255, 0, 255);
                Color orange = new Color(255, 100, 0);
                Color purple = new Color(90, 0, 130);
                Color minty = new Color(66, 255, 145);
                Color lilac = new Color(116, 0, 255);
                Color red = new Color(255, 0, 0);
                Color lPink = new Color(255, 165, 255);
                Color dGreen = new Color(0, 50, 0);
                Color dRed = new Color(50, 0, 0);
                Color cheesy = new Color(167, 90, 0);
                Color gray = new Color(120, 120, 120);
                Color navy = new Color(0, 64, 88);
                Color guac = new Color(0, 104, 0);
                Color mocha = new Color(105, 51, 0);
                Color fresh = new Color(164, 228, 252);

                if (labels.get(key) == 2) {
                    Cbuf.setRGB(j, i, green.getRGB());
                } else if (labels.get(key) == 3) {
                    Cbuf.setRGB(j, i, blue.getRGB());
                } else if (labels.get(key) == 4) {
                    Cbuf.setRGB(j, i, yellow.getRGB());
                } else if (labels.get(key) == 5) {
                    Cbuf.setRGB(j, i, cyan.getRGB());
                } else if (labels.get(key) == 6) {
                    Cbuf.setRGB(j, i, magenta.getRGB());
                } else if (labels.get(key) == 7) {
                    Cbuf.setRGB(j, i, orange.getRGB());
                } else if (labels.get(key) == 8) {
                    Cbuf.setRGB(j, i, purple.getRGB());
                } else if (labels.get(key) == 9) {
                    Cbuf.setRGB(j, i, minty.getRGB());
                } else if (labels.get(key) == 10) {
                    Cbuf.setRGB(j, i, lilac.getRGB());
                } else if (labels.get(key) == 11) {
                    Cbuf.setRGB(j, i, red.getRGB());
                } else if (labels.get(key) == 12) {
                    Cbuf.setRGB(j, i, lPink.getRGB());
                } else if (labels.get(key) == 13) {
                    Cbuf.setRGB(j, i, dGreen.getRGB());
                } else if (labels.get(key) == 14) {
                    Cbuf.setRGB(j, i, dRed.getRGB());
                } else if (labels.get(key) == 15) {
                    Cbuf.setRGB(j, i, cheesy.getRGB());
                } else if (labels.get(key) == 16) {
                    Cbuf.setRGB(j, i, gray.getRGB());
                } else if (labels.get(key) == 17) {
                    Cbuf.setRGB(j, i, navy.getRGB());
                } else if (labels.get(key) == 18) {
                    Cbuf.setRGB(j, i, guac.getRGB());
                } else if (labels.get(key) == 19) {
                    Cbuf.setRGB(j, i, mocha.getRGB());
                } else if (labels.get(key) == 20) {
                    Cbuf.setRGB(j, i, fresh.getRGB());
                } else if (labels.get(key) == 21) {
                    Cbuf.setRGB(j, i, blue.getRGB());
                } else if (labels.get(key) == 22) {
                    Cbuf.setRGB(j, i, yellow.getRGB());
                } else if (labels.get(key) == 23) {
                    Cbuf.setRGB(j, i, cyan.getRGB());
                } else if (labels.get(key) == 24) {
                    Cbuf.setRGB(j, i, magenta.getRGB());
                } else if (labels.get(key) == 25) {
                    Cbuf.setRGB(j, i, orange.getRGB());
                } else if (labels.get(key) == 26) {
                    Cbuf.setRGB(j, i, purple.getRGB());
                } else if (labels.get(key) == 27) {
                    Cbuf.setRGB(j, i, minty.getRGB());
                } else if (labels.get(key) == 28) {
                    Cbuf.setRGB(j, i, lilac.getRGB());
                } else if (labels.get(key) == 29) {
                    Cbuf.setRGB(j, i, red.getRGB());
                } else if (labels.get(key) == 30) {
                    Cbuf.setRGB(j, i, lPink.getRGB());
                } else if (labels.get(key) == 31) {
                    Cbuf.setRGB(j, i, dGreen.getRGB());
                } else if (labels.get(key) == 32) {
                    Cbuf.setRGB(j, i, dRed.getRGB());
                } else if (labels.get(key) == 33) {
                    Cbuf.setRGB(j, i, cheesy.getRGB());
                } else if (labels.get(key) == 34) {
                    Cbuf.setRGB(j, i, gray.getRGB());
                } else if (labels.get(key) == 35) {
                    Cbuf.setRGB(j, i, navy.getRGB());
                } else if (labels.get(key) == 36) {
                    Cbuf.setRGB(j, i, guac.getRGB());
                } else if (labels.get(key) == 37) {
                    Cbuf.setRGB(j, i, mocha.getRGB());
                } else if (labels.get(key) == 38) {
                    Cbuf.setRGB(j, i, fresh.getRGB());
                } else if (labels.get(key) == 39) {
                    Cbuf.setRGB(j, i, blue.getRGB());
                } else if (labels.get(key) == 40) {
                    Cbuf.setRGB(j, i, yellow.getRGB());
                } else if (labels.get(key) == 41) {
                    Cbuf.setRGB(j, i, cyan.getRGB());
                } else if (labels.get(key) == 42) {
                    Cbuf.setRGB(j, i, magenta.getRGB());
                } else if (labels.get(key) == 43) {
                    Cbuf.setRGB(j, i, orange.getRGB());
                } else if (labels.get(key) == 44) {
                    Cbuf.setRGB(j, i, purple.getRGB());
                } else if (labels.get(key) == 45) {
                    Cbuf.setRGB(j, i, minty.getRGB());
                } else if (labels.get(key) == 46) {
                    Cbuf.setRGB(j, i, lilac.getRGB());
                } else if (labels.get(key) == 47) {
                    Cbuf.setRGB(j, i, red.getRGB());
                } else if (labels.get(key) == 48) {
                    Cbuf.setRGB(j, i, lPink.getRGB());
                } else if (labels.get(key) == 49) {
                    Cbuf.setRGB(j, i, dGreen.getRGB());
                } else if (labels.get(key) == 50) {
                    Cbuf.setRGB(j, i, dRed.getRGB());
                } else if (labels.get(key) == 51) {
                    Cbuf.setRGB(j, i, cheesy.getRGB());
                } else if (labels.get(key) == 52) {
                    Cbuf.setRGB(j, i, gray.getRGB());
                } else if (labels.get(key) == 53) {
                    Cbuf.setRGB(j, i, navy.getRGB());
                } else if (labels.get(key) == 54) {
                    Cbuf.setRGB(j, i, guac.getRGB());
                } else if (labels.get(key) == 55) {
                    Cbuf.setRGB(j, i, mocha.getRGB());
                } else if (labels.get(key) == 56) {
                    Cbuf.setRGB(j, i, fresh.getRGB());
                } else if (labels.get(key) == 57) {
                    Cbuf.setRGB(j, i, blue.getRGB());
                } else if (labels.get(key) == 58) {
                    Cbuf.setRGB(j, i, yellow.getRGB());
                } else if (labels.get(key) == 59) {
                    Cbuf.setRGB(j, i, cyan.getRGB());
                } else if (labels.get(key) == 60) {
                    Cbuf.setRGB(j, i, magenta.getRGB());
                } else if (labels.get(key) == 61) {
                    Cbuf.setRGB(j, i, orange.getRGB());
                } else if (labels.get(key) == 62) {
                    Cbuf.setRGB(j, i, purple.getRGB());
                } else if (labels.get(key) == 63) {
                    Cbuf.setRGB(j, i, minty.getRGB());
                } else if (labels.get(key) == 64) {
                    Cbuf.setRGB(j, i, lilac.getRGB());
                } else if (labels.get(key) == 65) {
                    Cbuf.setRGB(j, i, red.getRGB());
                } else if (labels.get(key) == 66) {
                    Cbuf.setRGB(j, i, lPink.getRGB());
                } else if (labels.get(key) == 67) {
                    Cbuf.setRGB(j, i, dGreen.getRGB());
                } else if (labels.get(key) == 68) {
                    Cbuf.setRGB(j, i, dRed.getRGB());
                } else if (labels.get(key) == 69) {
                    Cbuf.setRGB(j, i, cheesy.getRGB());
                } else if (labels.get(key) == 70) {
                    Cbuf.setRGB(j, i, gray.getRGB());
                } else if (labels.get(key) == 71) {
                    Cbuf.setRGB(j, i, navy.getRGB());
                } else if (labels.get(key) == 72) {
                    Cbuf.setRGB(j, i, guac.getRGB());
                } else if (labels.get(key) == 73) {
                    Cbuf.setRGB(j, i, mocha.getRGB());
                } else if (labels.get(key) == 74) {
                    Cbuf.setRGB(j, i, fresh.getRGB());
                } else if (labels.get(key) == 75) {
                    Cbuf.setRGB(j, i, blue.getRGB());
                } else if (labels.get(key) == 76) {
                    Cbuf.setRGB(j, i, yellow.getRGB());
                } else if (labels.get(key) == 77) {
                    Cbuf.setRGB(j, i, cyan.getRGB());
                } else if (labels.get(key) == 78) {
                    Cbuf.setRGB(j, i, magenta.getRGB());
                } else if (labels.get(key) == 79) {
                    Cbuf.setRGB(j, i, orange.getRGB());
                } else if (labels.get(key) == 80) {
                    Cbuf.setRGB(j, i, purple.getRGB());
                } else if (labels.get(key) == 81) {
                    Cbuf.setRGB(j, i, minty.getRGB());
                } else if (labels.get(key) == 82) {
                    Cbuf.setRGB(j, i, lilac.getRGB());
                } else if (labels.get(key) == 83) {
                    Cbuf.setRGB(j, i, red.getRGB());
                } else if (labels.get(key) == 84) {
                    Cbuf.setRGB(j, i, lPink.getRGB());
                } else if (labels.get(key) == 85) {
                    Cbuf.setRGB(j, i, dGreen.getRGB());
                } else if (labels.get(key) == 86) {
                    Cbuf.setRGB(j, i, dRed.getRGB());
                } else if (labels.get(key) == 87) {
                    Cbuf.setRGB(j, i, cheesy.getRGB());
                } else if (labels.get(key) == 88) {
                    Cbuf.setRGB(j, i, gray.getRGB());
                } else if (labels.get(key) == 89) {
                    Cbuf.setRGB(j, i, navy.getRGB());
                } else if (labels.get(key) == 90) {
                    Cbuf.setRGB(j, i, guac.getRGB());
                } else if (labels.get(key) == 91) {
                    Cbuf.setRGB(j, i, mocha.getRGB());
                } else if (labels.get(key) == 92) {
                    Cbuf.setRGB(j, i, fresh.getRGB());
                } else if (labels.get(key) == 93) {
                    Cbuf.setRGB(j, i, blue.getRGB());
                } else if (labels.get(key) == 94) {
                    Cbuf.setRGB(j, i, yellow.getRGB());
                } else if (labels.get(key) == 95) {
                    Cbuf.setRGB(j, i, cyan.getRGB());
                } else if (labels.get(key) == 96) {
                    Cbuf.setRGB(j, i, magenta.getRGB());
                } else if (labels.get(key) == 97) {
                    Cbuf.setRGB(j, i, orange.getRGB());
                } else if (labels.get(key) == 98) {
                    Cbuf.setRGB(j, i, purple.getRGB());
                } else if (labels.get(key) == 99) {
                    Cbuf.setRGB(j, i, minty.getRGB());
                } else if (labels.get(key) == 100) {
                    Cbuf.setRGB(j, i, lilac.getRGB());
                } else if (labels.get(key) == 101) {
                    Cbuf.setRGB(j, i, red.getRGB());
                } else if (labels.get(key) == 102) {
                    Cbuf.setRGB(j, i, lPink.getRGB());
                } else if (labels.get(key) == 103) {
                    Cbuf.setRGB(j, i, dGreen.getRGB());
                } else if (labels.get(key) == 104) {
                    Cbuf.setRGB(j, i, dRed.getRGB());
                } else if (labels.get(key) == 105) {
                    Cbuf.setRGB(j, i, cheesy.getRGB());
                } else if (labels.get(key) == 106) {
                    Cbuf.setRGB(j, i, gray.getRGB());
                } else if (labels.get(key) == 107) {
                    Cbuf.setRGB(j, i, navy.getRGB());
                } else if (labels.get(key) == 108) {
                    Cbuf.setRGB(j, i, guac.getRGB());
                } else if (labels.get(key) == 109) {
                    Cbuf.setRGB(j, i, mocha.getRGB());
                } else if (labels.get(key) == 110) {
                    Cbuf.setRGB(j, i, fresh.getRGB());
                }

            }
        }

        File re = new File("recolor.png");

        try {
            ImageIO.write(Cbuf, "png", re);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    private void PixUpdate(BufferedImage buf, int oldVal, int newVal){

        for(int i = 1; i < buf.getWidth(); i++) {
            for (int j = 1; j < buf.getHeight(); j++) {

                int thisPixel = labels.get(getTuple(j,i));

                if(thisPixel == oldVal){

                    labels.put(getTuple(j,i), newVal);
                }

            }

        }

    }


    private void FixIt6(BufferedImage buf){

        System.out.print("Second pass color labeling...");

        for(int i = 1; i < buf.getWidth(); i++) {
            for (int j = 1; j < buf.getHeight(); j++) {

                int thisPixel = labels.get(getTuple(j,i));
                int getUpper = labels.get(getTuple(j, i-1));

                if(thisPixel != 0){

                    if((getUpper != 0) && (getUpper != thisPixel)){

                        PixUpdate(buf, thisPixel, getUpper);
                    }

                }

            }
        }
        System.out.println("done.");
        Recolor(buf);
        System.out.println("done.");
    }


    private void ColorLabel2(BufferedImage buf){

        System.out.print("First pass color labeling...");

        for(int i = 1; i < buf.getWidth(); i++){
            for(int j = 1; j < buf.getHeight(); j++) {

                int thisPixel = labels.get(getTuple(j,i));

                if (thisPixel == 1) {

                    String up = getTuple(j, i - 1);
                    String left = getTuple(j - 1, i);

                    int getUpper = labels.get(up);
                    int getLeft = labels.get(left);

                    if ((getUpper == 0) && (getLeft == 0)) {
                        pixLabel++;
                        labels.put(getTuple(j, i), pixLabel);
                    }
                    else if((getUpper != 0) && (getLeft == 0)){
                        labels.put(getTuple(j,i), getUpper);
                    }
                    else if(getUpper == 0){
                        labels.put(getTuple(j,i), getLeft);
                    }
                    else if((getUpper == 1) || (getLeft > 1)){
                        labels.put(getTuple(j,i), getLeft);
                    }
                    else if((getUpper > 1) || (getLeft == 1)){
                        labels.put(getTuple(j,i), getUpper);
                    }

                }

            }

        }
        System.out.println("done.");
        FixIt6(buf);
    }


    public void BGLabel(BufferedImage buf) {

        System.out.print("Labeling binary components...");

        for (int i = 0; i < buf.getWidth(); i++) {
            for (int j = 0; j < buf.getHeight(); j++) {

                Color getColor = new Color(buf.getRGB(j, i));

                if (getColor.getRGB() == -1) {

                    labels.put(getTuple(j, i), 0); //change this to "1" for black background
                }
                else{
                    labels.put(getTuple(j, i),1); //change this to "0" for black background
                }

            }

        }
        System.out.println("done.");
        ColorLabel2(buf);
    }

}

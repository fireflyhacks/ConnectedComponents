import java.awt.image.BufferedImage;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello! Give me an image.");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Filename: ");
        String inputFile = sc.next();

        Grayscaler g = new Grayscaler();
        BufferedImage buf = g.Grayscale(inputFile);

        Binarizer b = new Binarizer();
        BufferedImage bwBuf = b.toBinary(buf);

        Finder f = new Finder();
        f.BGLabel(bwBuf);
    }
}

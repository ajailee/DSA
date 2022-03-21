package LeetCodeEasy;

// Java program to demonstrate
// creation of random pixel image

import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class RandomImage {
    public static void main(String args[]) throws IOException {
        // Image file dimensions
        int width = 1080, height = 1080;

        // Create buffered image object
        BufferedImage img = null;
        img = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

        // file object
        File f = null;

        // create random values pixel by pixel
        for (int y = 0; y < height; y++) {
            System.out.print("y->" + y);
            for (int x = 0; x < width; x++) {
                // generating values less than 256
                int a = (int) (Math.random() * 256);
                int r = (int) (Math.random() * 256);
                int g = (int) (Math.random() * 256);
                int b = (int) (Math.random() * 256);
                // pixel
                int p = (a << 24) | (r << 16) | (g << 8) | b;
                img.setRGB(x, y, p);

            }
        }

        // write image
        try

        {
            f = new File("mytest.png");
            ImageIO.write(img, "png", f);
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}

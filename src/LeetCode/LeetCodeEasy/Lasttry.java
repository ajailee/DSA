package LeetCodeEasy;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.awt.Graphics2D;
import java.io.File;

import javax.imageio.ImageIO;
import java.awt.*;

public class Lasttry {
    public static void main(String[] args) throws IOException {
        // Image file dimensions
        int width = 1080, height = 1080;

        // Create buffered image object
        BufferedImage img = null;
        img = new BufferedImage(width * 6, height * 6, BufferedImage.TYPE_INT_ARGB);

        final Graphics2D graphics2D = img.createGraphics();
        graphics2D.setBackground(Color.white);
        for (int y = 0; y < height; y++) {
            System.out.print("y->" + y);
            for (int x = 0; x < width; x++) {
                // generating values less than 256
                int a = (int) (Math.random() * 256);
                int r = (int) (Math.random() * 256);
                int g = (int) (Math.random() * 256);
                int b = (int) (Math.random() * 256);
                graphics2D.setColor(new Color(r, g, b, a));
                graphics2D.drawOval(width, height, 100 + x, 100 + y);
            }
        }
        graphics2D.dispose();

        ImageIO.write(img, "png", new File("lasttest1.png"));
    }
}

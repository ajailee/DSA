package LeetCodeEasy;

import java.io.IOException;
import java.awt.Graphics2D;
import java.io.File;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.awt.*;

public class ImageExample {

    public static void main(String[] args) throws IOException {
        final BufferedImage image = new BufferedImage(1000, 1000, BufferedImage.TYPE_INT_ARGB);
        final Graphics2D graphics2D = image.createGraphics();
        // background
        graphics2D.setPaint(Color.white);
        // this is the rectange size (0,0,width,height)
        graphics2D.fillRect(0, 0, 1000, 1000);
        // circle line color
        for (int i = 0; i < 225; i++) {
            for (int j = 0; j < 225; j++) {
                System.out.println("i->" + i);
                for (int k = 0; k < 255; k++) {
                    System.out.println("j->" + j);
                    graphics2D.setColor(new Color(i, j, k));
                    // this is the Rec size (0,0,width,height)
                    System.out.println("k->" + k);
                    graphics2D.drawOval(500, 500, 100 + i, 100 + i);
                }
            }
        }

        graphics2D.dispose();

        ImageIO.write(image, "png", new File("oveltest.png"));
    }

}
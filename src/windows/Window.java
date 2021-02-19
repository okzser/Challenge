package windows;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.Random;

public class Window extends JFrame {

    static final int SCREEN_WIDTH = 600;
    static final int SCREEN_HEIGHT = 600;

    ImageIcon icon = new ImageIcon("src/imgs/icon.png");

    ImageIcon hat = new ImageIcon(ImageIO.read(new File("imgs/hatsmall.png")));
    JLabel hatlbl = new JLabel();

    public Window() throws InterruptedException {

        hat.getImage().getScaledInstance(200,200, Image.SCALE_DEFAULT);
        hatlbl.setIcon(hat);

        this.add(hatlbl);
        this.setIconImage(icon.getImage());
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setIconImage(icon.getImage());
        this.setBounds(420, 420, 420, 420);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        Random r = new Random();
        int x  = 10;
        int y = 10;

        for (int i = 0; i < 1000000; i++) {
                    x  += 2;
                    y += 2;
            hatlbl.setLocation(x, y);
            if (hatlbl.getAlignmentX() == this.getWidth()) {
                x -= 2;
            } else if (hatlbl.getAlignmentY() == this.getHeight()) {
                y -= 2;
            }
            Thread.sleep(200);
        }
    }
    }



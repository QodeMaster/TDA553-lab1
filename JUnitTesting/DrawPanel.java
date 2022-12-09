package JUnitTesting;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.*;

// This panel represent the animated part of the view with the car images.

public class DrawPanel extends JPanel{

    ArrayList<Car> cars;

    // Initializes the panel and reads the images
    public DrawPanel(int x, int y) {
        this.setDoubleBuffered(true);
        this.setPreferredSize(new Dimension(x, y));
        this.setBackground(Color.green);

    }

    // This method is called each time the panel updates/refreshes/repaints itself
    // TODO: Change to suit your needs.
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for(Car c : cars) {
            if(c.img != null) {
                g.drawImage(c.img, (int)c.getXCord(), (int)c.getYCord(), null);
            }
            
        }
         // see javadoc for more info on the parameters
    }

    void update(ArrayList<Car> c) {
        cars = c;
        this.repaint();
    }
}

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

    String[] adresses;
    ArrayList<Car> cars;

    // Just a single image, TODO: Generalize

    //BufferedImage volvoImage;
    //BufferedImage saab95Image;
    //BufferedImage scaniaImage;
    // To keep track of a singel cars position
    Point volvoPoint = new Point();


    // TODO: Make this genereal for all cars
    void moveit(ArrayList<Car> c, int i, int x, int y){
        cars = c;
        cars.get(i).setXCord(x);
        cars.get(i).setYCord(y);
    }

    // Initializes the panel and reads the images
    public DrawPanel(int x, int y) {
        this.setDoubleBuffered(true);
        this.setPreferredSize(new Dimension(x, y));
        this.setBackground(Color.green);
        // Print an error message in case file is not found with a try/catch block
        /*try {
            // You can remove the "pics" part if running outside of IntelliJ and
            // everything is in the same main folder.
            // volvoImage = ImageIO.read(new File("Volvo240.jpg"));

            // Rememember to rightclick src New -> Package -> name: pics -> MOVE *.jpg to pics.
            // if you are starting in IntelliJ.
            String str = ("pics/" + car.getName() + jpg)
            volvoImage = ImageIO.read(DrawPanel.class.getResourceAsStream(str));
            saab95Image = ImageIO.read(DrawPanel.class.getResourceAsStream("JUnitTesting/pics/Saab95.jpg"));
           
        } catch (IOException ex)
        {
            ex.printStackTrace();
        }*/

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
}

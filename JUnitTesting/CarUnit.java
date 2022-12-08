package JUnitTesting;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.*;

public class CarUnit {
    String address;
    BufferedImage img;
    int x;
    int y;

    public CarUnit(String address, int x, int y) {
        this.address = address;
        this.x = x;
        this.y = y;
        try {
            img = ImageIO.read(DrawPanel.class.getResourceAsStream(address));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
} 
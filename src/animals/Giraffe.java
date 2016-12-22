package animals;


import classes.Animal;
import interfaces.Rotatable;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Giraffe extends Animal implements Rotatable {
    public Giraffe(String name, int age, int weight) {
        super(name, age, weight);
        setImage("/images/giraffe.png");
    }

    @Override
    public void onRotate(int angle) {
        ImageIcon imageIcon = new ImageIcon(getImage().getImage());
        BufferedImage bufferedImage = new BufferedImage(imageIcon.getIconWidth(), imageIcon.getIconHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics2D = bufferedImage.createGraphics();
        graphics2D.rotate(angle, imageIcon.getIconWidth()/2, imageIcon.getIconHeight()/2);
        graphics2D.drawImage(imageIcon.getImage(), 0, 0, imageIcon.getIconWidth(), imageIcon.getIconHeight(), 0, 0,
                imageIcon.getIconWidth(), imageIcon.getIconHeight(), null);
        graphics2D.dispose();
        setImage(new ImageIcon(bufferedImage));
    }




}

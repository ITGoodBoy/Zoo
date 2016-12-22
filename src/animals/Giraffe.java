package animals;


import classes.Animal;
import interfaces.Rotatable;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Giraffe extends Animal implements Rotatable {

//inheritance, and the addition of its features
    private int neckLength;
    public Giraffe(String name, int age, int weight, int neckLength) {
        super(name, age, weight);
        setImage("/images/giraffe.png");
        this.neckLength = neckLength;
    }
//change the rotation angle of the image
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

    @Override
    public void onVoice() {
        System.out.println("I communicate at low frequency");
    }

    public int getNeckLength() {
        return neckLength;
    }

    public void setNeckLength(int neckLength) {
        this.neckLength = neckLength;
    }

    @Override
    public String toString() {
        return super.toString() + " neckLength " + getNeckLength();
    }
}

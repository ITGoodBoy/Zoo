package animals;

import classes.Animal;
import interfaces.Increase;
import javax.swing.*;
import java.awt.*;


public class Rabbit extends Animal implements Increase {
    public Rabbit(String name, int age, int weight) {
        super(name, age, weight);
        setImage("/images/rabbit.png");
    }

//resizing images
    @Override
    public void onIncrease(int increase) {
        try {

            Image img = new ImageIcon(getClass().getResource("/images/rabbit.png")).getImage().
                    getScaledInstance(getImage().getIconWidth() + increase, getImage().getIconHeight() + increase, Image.SCALE_DEFAULT);
            setImage(new ImageIcon(img));
        }
        catch (IllegalArgumentException e)
        {
            setImage(getImage());
        }
    }

}

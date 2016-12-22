package classes;


import javax.swing.*;
import java.awt.*;

public abstract class Animal {
 //encapsulation
    private String name;
    private int age;
    private int weight;
    private ImageIcon image;

    public Animal() {

    }

    public Animal(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public ImageIcon getImage() {
        return image;
    }

    public void setImage(String image) {
        Image img = new ImageIcon(getClass().getResource(image)).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        this.image = new ImageIcon(img);
    }

    public void setImage(ImageIcon image) {
        this.image = image;
    }

    public abstract void onVoice();

    @Override
    public String toString() {
        return "Name " + getName() + " Age " + getAge() + " Weight " + getWeight();
    }
}


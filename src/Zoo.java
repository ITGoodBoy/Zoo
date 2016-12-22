

import animals.*;
import classes.Animal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Zoo extends JFrame {

    private JButton[][] jButtons = new JButton[3][3];
    private JPanel jPanel = new JPanel(new GridLayout(3, 3));
    private Animal[] animals = new Animal[]{new Pig("Бемби", 15, 25), new Elephant("Добряк", 23, 35),
            new Giraffe("Остряк", 15, 25, 4), new Monkey("Подруга", 23, 35, 7),
            new Panda("Пивовар", 15, 25, true), new Parrot("Говорун", 23, 35, 100, 25, false, true),
            new Penguin("Пушистик", 15, 25, 0, 0, false), new Rabbit("Хитрун", 23, 35),
            new Snake("Каа", 15, 25)};

    public Zoo()
    {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        int count = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                jButtons[i][j] = new JButton();
                jButtons[i][j].setIcon(animals[count++].getImage());
                jButtons[i][j].addActionListener(new Listener());
                jPanel.add(jButtons[i][j]);
            }
        }
        add(jPanel);
    }

    private class Listener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            Object object = e.getSource();

            int count = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (object == jButtons[i][j])
                    {
                        //polymorphism - all animals can make a sound, but each does their sound is different from other
                        animals[count].onVoice();


                        if (animals[count] instanceof Giraffe)
                        {
                            ((Giraffe) animals[count]).onRotate(24);
                            jButtons[i][j].setIcon(animals[count].getImage());
                        }
                        if (animals[count] instanceof Pig)
                        {
                            ((Pig) animals[count]).onSwipe();
                            jButtons[i][j].setIcon(animals[count].getImage());
                        }
                        if (animals[count] instanceof Pig)
                        {
                            ((Pig) animals[count]).onSwipe();
                        }
                        if (animals[count] instanceof Penguin)
                        {
                            ((Penguin) animals[count]).onIncrease(5);
                            jButtons[i][j].setIcon(animals[count].getImage());
                        }
                        if (animals[count] instanceof Rabbit)
                        {
                            ((Rabbit) animals[count]).onIncrease(-5);
                            jButtons[i][j].setIcon(animals[count].getImage());
                        }
                        if (animals[count] instanceof Parrot)
                        {
                            ((Parrot) animals[count]).onSwipe();
                            jButtons[i][j].setIcon(animals[count].getImage());
                        }
                        System.out.println(animals[count]);
                    }
                    count++;
                }
            }
        }
    }

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.setResizable(false);
        zoo.setSize(600, 600);
        zoo.setLocationRelativeTo(null);
        zoo.setVisible(true);
    }

}

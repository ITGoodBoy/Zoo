package animals;


import classes.Animal;
import interfaces.Swipe;
import interfaces.Voice;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Pig extends Animal implements Swipe, Voice {

    public Pig()
    {

    }

    public Pig(String name, int age, int weight)
    {
        super(name, age, weight);
        setImage("/images/pig.png");
    }


    @Override
    public void onSwipe() {
        String[] strings = new String[9];
        strings[0] = "/images/elephant.png";
        strings[1] = "/images/giraffe.png";
        strings[2] = "/images/monkey.png";
        strings[3] = "/images/panda.png";
        strings[4] = "/images/parrot.png";
        strings[5] = "/images/penguin.png";
        strings[6] = "/images/pig.png";
        strings[7] = "/images/rabbit.png";
        strings[8] = "/images/snake.png";

        int a = (int) (Math.random() * 9);
        if (a == 6)
        {
            onVoice();
        }
        setImage(strings[a]);
    }

    @Override
    public void onVoice() {
        try
        {
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(getClass().getResource("/sounds/pig.wav")));
            clip.start();
        }
        catch (Exception exc)
        {
            exc.printStackTrace(System.out);
        }
    }
}


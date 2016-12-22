package animals;

import classes.Animal;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


public class Monkey extends Animal {
    //inheritance, and the addition of its features
    private int numberOfBananas;

    public Monkey(String name, int age, int weight, int numberOfBananas) {
        super(name, age, weight);
        setImage("/images/monkey.png");
        this.numberOfBananas = numberOfBananas;
    }



//monkey sound
    @Override
    public void onVoice() {
        try
        {
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(getClass().getResource("/sounds/monkey.aiff")));
            clip.start();
        }
        catch (Exception exc)
        {
            exc.printStackTrace(System.out);
        }
    }

    public int getNumberOfBananas() {
        return numberOfBananas;
    }

    public void setNumberOfBananas(int numberOfBananas) {
        this.numberOfBananas = numberOfBananas;
    }

    @Override
    public String toString() {
        return super.toString() + " number of bananas " + getNumberOfBananas();
    }
}

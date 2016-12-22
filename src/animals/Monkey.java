package animals;

import classes.Animal;
import interfaces.Voice;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


public class Monkey extends Animal implements Voice {
    public Monkey(String name, int age, int weight) {
        super(name, age, weight);
        setImage("/images/monkey.png");
    }




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
}

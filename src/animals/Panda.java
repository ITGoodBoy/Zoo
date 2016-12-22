package animals;


import classes.Animal;
import interfaces.Voice;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Panda extends Animal implements Voice {
    public Panda(String name, int age, int weight) {
        super(name, age, weight);
        setImage("/images/panda.png");
    }

    @Override
    public void onVoice() {
        try
        {
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(getClass().getResource("/sounds/panda.aif")));
            clip.start();
        }
        catch (Exception exc)
        {
            exc.printStackTrace(System.out);
        }
    }
}

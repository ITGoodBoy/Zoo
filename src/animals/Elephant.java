package animals;


import classes.Animal;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Elephant extends Animal {

    public Elephant(String name, int age, int weight)
    {
        super(name, age, weight);
        setImage("/images/elephant.png");
    }
//elephant sound
    @Override
    public void onVoice() {
        try
        {
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(getClass().getResource("/sounds/elephant.wav")));
            clip.start();
        }
        catch (Exception exc)
        {
            exc.printStackTrace(System.out);
        }
    }


}

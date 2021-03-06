package animals;

import classes.Animal;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


public class Snake extends Animal {
    public Snake(String name, int age, int weight) {
        super(name, age, weight);
        setImage("/images/snake.png");
    }
//snake sound
    @Override
    public void onVoice() {
        try
        {
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(getClass().getResource("/sounds/snake_hiss.wav")));
            clip.start();
        }
        catch (Exception exc)
        {
            exc.printStackTrace(System.out);
        }
    }
}

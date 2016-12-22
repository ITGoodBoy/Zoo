package animals;


import classes.Animal;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Panda extends Animal {
    //inheritance, and the addition of its features

    private boolean kungfuMaster;

    public Panda(String name, int age, int weight, boolean kungfuMaster) {
        super(name, age, weight);
        setImage("/images/panda.png");
        this.kungfuMaster = kungfuMaster;
    }
//panda sound
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

    public boolean isKungfuMaster() {
        return kungfuMaster;
    }

    public void setKungfuMaster(boolean kungfuMaster) {
        this.kungfuMaster = kungfuMaster;
    }

    @Override
    public String toString() {
        return super.toString() + " Kungfu is the master? - " + isKungfuMaster();
    }
}

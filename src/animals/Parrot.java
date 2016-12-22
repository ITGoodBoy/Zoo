package animals;

import classes.Bird;
import interfaces.Swipe;

public class Parrot extends Bird implements Swipe{


    private boolean canSpeak;

    public Parrot(String name, int age, int weight, int flightHeight, int airSpeed, boolean fly, boolean canSpeak) {
        super(name, age, weight, flightHeight, airSpeed, fly);
        setImage("/images/parrot.png");
        this.canSpeak = canSpeak;
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
        setImage(strings[a]);
    }

    public boolean isCanSpeak() {
        return canSpeak;
    }

    public void setCanSpeak(boolean canSpeak) {
        this.canSpeak = canSpeak;
    }

    @Override
    public String toString() {
        return super.toString() + " is Can Speak? - " + isCanSpeak();
    }
}

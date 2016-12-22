package classes;

//Inheriting from the Animal and add its own features for Bird class
public class Bird extends Animal {

    private int flightHeight;
    private int airSpeed;
    private boolean fly;

    public Bird()
    {
        super();
    }


    public Bird(String name, int age, int weight, int flightHeight, int airSpeed, boolean fly)
    {
        super(name, age, weight);
        this.flightHeight = flightHeight;
        this.airSpeed = airSpeed;
        this.fly = fly;
    }

    public int getFlightHeight() {
        return flightHeight;
    }

    public void setFlightHeight(int flightHeight) {
        this.flightHeight = flightHeight;
    }

    public int getAirspeed() {
        return airSpeed;
    }

    public void setAirspeed(int airspeed) {
        this.airSpeed = airspeed;
    }

    public boolean isFly() {
        return fly;
    }

    public void setFly(boolean fly) {
        this.fly = fly;
    }

    @Override
    public void onVoice() {
        System.out.println("voice birds");
    }

    @Override
    public String toString() {
        return super.toString() + " flightHeight " + getFlightHeight() + " airSpeed " + airSpeed;
    }
}

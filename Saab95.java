import java.awt.*;

public class Saab95 extends Car {
    public boolean turboOn;

    public Saab95() {
        super(2,"Saab95",125,Color.red);
    }

    protected boolean setTurboOn() {
        return turboOn = true;
    }

    protected boolean setTurboOff() {
        return turboOn = false;
    }


    public double speedFactor() {
        double turbo = 1;
        if (turboOn) turbo = 1.3;
        return getEnginePower() * 0.01 * turbo;
    }


    }



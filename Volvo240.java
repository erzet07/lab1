import java.awt.*;

//Antar superklass Car
public class Volvo240 extends Car {
    public static final double TRIM_FACTOR = 1.25;

    public Volvo240(Color color) {
        super("Volvo240", 100, color);
    }

    public void incrementSpeed(double amount) {
        setCurrentSpeed(getCurrentSpeed() + speedFactor() * amount);
    }

    public void decrementSpeed(double amount) {
        setCurrentSpeed(getCurrentSpeed() - speedFactor() * amount);
    }
    
    protected double speedFactor() {
        return getEnginePower() * 0.01 * TRIM_FACTOR;
    }
}

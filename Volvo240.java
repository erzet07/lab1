import java.awt.*;

public class Volvo240 extends Car {
    public static final double TRIM_FACTOR = 1.25;

    public Volvo240() {
        super(4,"Volvo240", 100, Color.black);
    }

    public void incrementSpeed(double amount) {
        currentSpeed = getCurrentSpeed() + speedFactor() * amount;
    }

    public void decrementSpeed(double amount) {
        currentSpeed = getCurrentSpeed() - speedFactor() * amount;
    }

    public double speedFactor() {
        return getEnginePower() * 0.01 * TRIM_FACTOR;
    }


    protected void gas(double amount){
        if (amount >= 0 && amount <= 1) {
            incrementSpeed(amount);
        }
    }

    protected void brake(double amount){
        if (amount >= 0 && amount <= 1) {
            decrementSpeed(amount);
        }
    }

}

import java.awt.*;

public abstract class Car implements Movable {
    private double enginePower;
    private double currentSpeed;
    private Color color;
    private final String modelName;
    private Point position;
    private double direction;

    public Car(String modelName, double enginePower, Color color) {
        this.modelName = modelName;
        this.enginePower = enginePower;
        this.color = color;
        this.currentSpeed = 0;
        this.position = new Point();
        this.direction = 0.0;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    protected void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getModelName() {
        return modelName;
    }

    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        this.position = position;
    }

    public double getDirection() {
        return direction;
    }

    public void setDirection(double direction) {
        this.direction = direction;
    }

    public void startEngine() {
        currentSpeed = 0.1;
    }

    public void stopEngine() {
        currentSpeed = 0;
    }

    public void gas(double amount) {
        if (amount >= 0 && amount <= 1) {
            incrementSpeed(amount);
        }
    }

    public void brake(double amount) {
        if (amount >= 0 && amount <= 1) {
            decrementSpeed(amount);
        }
    }

    protected abstract double speedFactor();


    protected void incrementSpeed(double amount) {
        double newSpeed = getCurrentSpeed() + speedFactor() * amount;
        currentSpeed = Math.min(newSpeed, enginePower);
    }

    protected void decrementSpeed(double amount) {
        double newSpeed = getCurrentSpeed() - speedFactor() * amount;
        currentSpeed = Math.max(newSpeed, 0);
    }
    @Override
    public void move() {
        int xMovement = (int) Math.round(Math.cos(Math.toRadians(direction)) * currentSpeed);
        int yMovement = (int) Math.round(Math.sin(Math.toRadians(direction)) * currentSpeed);
        position.translate(xMovement, yMovement);
    }

    @Override
    public void turnLeft() {
        direction = (direction - 90) % 360;
        if (direction < 0) {
            direction += 360;
        }
    }
    
    @Override
    public void turnRight() {
        direction = (direction + 90) % 360;
    }
}



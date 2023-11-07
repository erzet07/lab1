import java.awt.*;


public class Cars implements Movable{

    public Cars(int nrDoors, Color color, int enginePower, String modelName) {
        this.nrDoors = nrDoors;
        this.color = color;
        this.enginePower = enginePower;
        this.modelName = modelName;
        this.position = new Point(0,0);
        this.facing = 0;
        stopEngine();

    }

    public void move() {
        calculateMove();
    }





    public void turnLeft() {
        this.facing += -1;

    }
    public void turnRight() {
        this.facing += 1;
    }
    private void calculateMove() {
        if (this.facing % 4 == -1 || this.facing % 4 == 3) {

            this.position = new Point((int)this.position.getX() - (int)getCurrentSpeed(),(int)this.position.getY());
        }
        else if (this.facing % 4 == -2 || this.facing % 4 == 2) {
            this.position = new Point((int)this.position.getX(),(int)this.position.getY() -(int)getCurrentSpeed());
        }
        else if (this.facing % 4 == -3 ||this.facing % 4 == 1) {
            this.position = new Point((int)this.position.getX()+(int)getCurrentSpeed(),(int)this.position.getY());
        }
        else {
            this.position = new Point((int)this.position.getX(),(int)this.position.getY()+(int)getCurrentSpeed());
        }
    }

    public String getPosition() {
        return (this.position.getX() + " " + this.position.getY());
    }
    private Point position;
    public int facing;
    public int nrDoors; // Number of doors on the car
    public double enginePower; // Engine power of the car
    public double currentSpeed; // The current speed of the car
    public Color color; // Color of the car
    public String modelName; // The car model name

    public int getNrDoors(){
        return nrDoors;
    }
    public double getEnginePower(){
        return enginePower;
    }

    public double getCurrentSpeed(){
        return currentSpeed;
    }

    public Color getColor(){
        return color;
    }

    public void setColor(Color clr){
        color = clr;
    }

    public void startEngine(){
        currentSpeed = 0.1;
    }

    public void stopEngine(){
        currentSpeed = 0;
    }












}

import org.w3c.dom.ls.LSOutput;
import java.awt.*;
import java.sql.SQLOutput;
import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
    Volvo240 x = new Volvo240();
        x.startEngine();
        System.out.println(x.getCurrentSpeed());
        x.turnLeft();

        System.out.println(x.getCurrentSpeed());
        x.move();
        System.out.println(x.getPosition());
    }


}

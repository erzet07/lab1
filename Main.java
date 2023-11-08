public class Main {
    public static void main(String[] args) {
        // Skapa instanser av Volvo240 och Saab95
        Volvo240 volvo = new Volvo240(java.awt.Color.BLACK);
        Saab95 saab = new Saab95(java.awt.Color.RED);

        // Testa gas-funktionen
        System.out.println("Testar gas-funktionen:");
        volvo.gas(0.5);
        saab.gas(1.0);
        System.out.println("Volvo hastighet: " + volvo.getCurrentSpeed());
        System.out.println("Saab hastighet: " + saab.getCurrentSpeed());

        // Testa move-funktionen
        System.out.println("\nTestar move-funktionen:");
        volvo.move();
        saab.move();
        System.out.println("Volvo position: " + volvo.getPosition());
        System.out.println("Saab position: " + saab.getPosition());

        // Testa brake-funktionen
        System.out.println("\nTestar brake-funktionen:");
        volvo.brake(0.3);
        saab.brake(0.5);
        System.out.println("Volvo hastighet efter bromsning: " + volvo.getCurrentSpeed());
        System.out.println("Saab hastighet efter bromsning: " + saab.getCurrentSpeed());

        // Testa sväng-funktioner
        System.out.println("\nTestar sväng-funktionerna:");
        volvo.turnLeft();
        saab.turnRight();
        volvo.move();
        saab.move();
        System.out.println("Volvo position efter sväng vänster och flytt: " + volvo.getPosition());
        System.out.println("Saab position efter sväng höger och flytt: " + saab.getPosition());
    }
}

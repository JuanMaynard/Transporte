package trasnporte;

public class Main {

    public static void main(String[] args) {
        
        //creo lo objeto avion y helicoptero
        Avion avion = new Avion();
        Helicoptero helicoptero = new Helicoptero();
        
        //llamo a setVelMax
        avion.setVelMax(1200);
        helicoptero.setVelMax(500);
        
        //imprimo por pantalla comparando velocidad entre ambos
        System.out.println(avion.compareTo(helicoptero));
        System.out.println(helicoptero.compareTo(avion));
    }
}

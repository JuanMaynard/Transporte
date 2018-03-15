package trasnporte;

public abstract class Trasnporte implements Comparable {

    public int velocidadMax;

    public void setVelMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public int getVelMax() {
        return this.velocidadMax;
    }

    //comparo velocidad de transporte
    public int compareTo(Object obj) {
        Trasnporte t = (Trasnporte) obj;
        if (velocidadMax < t.getVelMax()) {
            return -1;
        }
        if (velocidadMax == t.getVelMax()) {
            return 0;
        }
        return 1;
    }
}

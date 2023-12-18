
package jatek;

import java.util.ArrayList;

public class Karakter {
    private int eletero, ugyesseg, szerencse;
    private ArrayList<String> felszereles;
    public Karakter(int eletero, int ugyesseg, int szerencse) {
        this.eletero = eletero;
        this.ugyesseg = ugyesseg;
        this.szerencse = szerencse;
    }

    public int getEletero() {
        return eletero;
    }

    public void setEletero(int eletero) {
        this.eletero = eletero;
    }

    public int getUgyesseg() {
        return ugyesseg;
    }

    public void setUgyesseg(int ugyesseg) {
        this.ugyesseg = ugyesseg;
    }

    public int getSzerencse() {
        return szerencse;
    }

    public void setSzerencse(int szerencse) {
        this.szerencse = szerencse;
    }

    @Override
    public String toString() {
        return "Karakter{" + "eletero=" + eletero + ", ugyesseg=" + ugyesseg + ", szerencse=" + szerencse + '}';
    }
    
    
}

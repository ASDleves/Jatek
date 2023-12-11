
package jatek;

import java.util.ArrayList;
import java.util.Random;

public class Karakter {
    private static final Random rnd = new Random();
    private int eletero, ugyesseg, szerencse;
    private ArrayList<Targy> felszerelesek;
    
    public Karakter() {
        setEletero(12);   
        setUgyesseg(6);  
        setSzerencse(6); 
        this.felszerelesek = new ArrayList<>();
    }
    
    public void Felvesz(Targy felszereles) {
        felszerelesek.add(felszereles);
    }
    public void Felvesz(Targy felszereles, int szam) {
        for (int i = 0; i < szam; i++) {
            felszerelesek.add(felszereles);
        }
    }
    public int getEletero() {
        return eletero;
    }

    public void setEletero(int eletero) {
        this.eletero = rnd.nextInt(eletero)+12;
    }

    public int getUgyesseg() {
        return ugyesseg;
    }

    public void setUgyesseg(int ugyesseg) {
        this.ugyesseg = rnd.nextInt(ugyesseg)+6;
    }

    public int getSzerencse() {
        return szerencse;
    }

    public void setSzerencse(int szerencse) {
        this.szerencse = rnd.nextInt(szerencse)+6;
    }

    @Override
    public String toString() {
        return "Karakter{" + "eletero=" + eletero + ", ugyesseg=" + ugyesseg + ", szerencse=" + szerencse + ", felszerelesek=" + felszerelesek + '}';
    }


    
    
}

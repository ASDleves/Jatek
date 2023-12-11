
package jatek;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Karakter {
    private static final Random rnd = new Random();
    private int eletero, ugyesseg, szerencse;
    private ArrayList<Targy> felszerelesek;
    
    public Karakter() {
        this.eletero = dobas()+dobas() + 12;   
        this.ugyesseg = dobas()+6; 
        this.szerencse = dobas()+6;
        this.felszerelesek = new ArrayList<>();
    }
    
    public void Felvesz(Targy felszereles) {
        Felvesz(felszereles, 1);
    }
    public void Felvesz(Targy felszereles, int szam) {
        for (int i = 0; i < szam; i++) {
            felszerelesek.add(felszereles);
        }
    }
    
    public void hasznal(String targy){
        hasznal(targy, 1, false);
    }
    public void hasznal(String targy, int db){
        hasznal(targy, db, false);
    }
    
    public void hasznal(String targy,int db, boolean eleg){
       int megtalaltDb = 0;
        // Először megszámoljuk, hány darab van a kívánt tárgyból
        for (Targy aktTargy : felszerelesek) {
            if (aktTargy.getNev().equals(targy)) {
                megtalaltDb++;
            }
        }
        if (megtalaltDb >= db) {
            Iterator<Targy> iterator = felszerelesek.iterator();
            while (iterator.hasNext() && db > 0) {
                Targy aktTargy = iterator.next();
                if (aktTargy.getNev().equals(targy)) {
                    iterator.remove();
                    db--;
                }
            }
            System.out.println(megtalaltDb + " " + targy + " elhasználva");
        } else {
            System.out.println("Nincs elegendő " + targy + " (" + megtalaltDb + " darab van)");
        }
    }
    
    
    public int getEletero() {
        return eletero;
    }


    public int getUgyesseg() {
        return ugyesseg;
    }

    public int getSzerencse() {
        return szerencse;
    }

    public int dobas(){
        return rnd.nextInt(6) + 1;
    }
    @Override
    public String toString() {
        return "Karakter{" + "eletero=" + eletero + ", ugyesseg=" + ugyesseg + ", szerencse=" + szerencse + ", felszerelesek=" + felszerelesek + '}';
    }


    
    
}

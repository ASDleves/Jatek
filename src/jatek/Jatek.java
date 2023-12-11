
package jatek;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Jatek {

    public static void main(String[] args) {
        Karakter k1 = new Karakter();
        Targy kendo = new Targy("Kendő", "ruha");
        Targy bajital = new Targy("Bájital", "varázslatos folyadék");
        k1.Felvesz(kendo);
        k1.Felvesz(bajital, 2);
        System.out.println(k1);
        k1.hasznal("Bájital");
        System.out.println(k1);
        k1.Felvesz(bajital, 2);
        k1.hasznal("Bájital", 3);
        k1.hasznal("Bájital", 5, true);
        Karakter[] karakterek = {k1};
        try(ObjectOutputStream objKi= new ObjectOutputStream(new FileOutputStream("karakterek.bin"))){
 
            objKi.writeObject(karakterek);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Jatek.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Jatek.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("gép kikapcsolva:"+ karakterek);

        karakterek = null;
        

        try(ObjectInputStream objBe= new ObjectInputStream(new FileInputStream("karakterek.bin"))){

            karakterek = (Karakter[]) objBe.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Jatek.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Jatek.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("játék állása betöltés után:"+ karakterek);
    }
    }
    


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jatek;

/**
 *
 * @author bella.richard
 */
public class Jatek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Karakter k1 = new Karakter();
        Targy kendo = new Targy("Kendő", "ruha");
        Targy bajital = new Targy("Bájital", "varázslatos folyadék");
        k1.Felvesz(kendo);
        k1.Felvesz(bajital, 5);
        System.out.println(k1);
        
    }
    
}

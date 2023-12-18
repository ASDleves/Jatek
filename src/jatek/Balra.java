/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jatek;

/**
 *
 * @author bella.richard
 */
public class Balra extends Helyszin implements MasikIrany{

    public Balra() {
    }

    @Override
    public String leiras() {
        return "Ez van balra!";
    }

    @Override
    public String BalFelirat() {
        return "Irány Észak";
    }
    @Override
    public String JobbFelirat() {
        return "Irány Dél";
    }

    @Override
    public Helyszin BalIrany() {
        return new Eszak();
    }

    

    @Override
    public Helyszin JobbIrany() {
        return new Del();
    }
    
}

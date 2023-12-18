/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jatek;


public class Kezdes extends Helyszin implements MasikIrany{
    @Override
    public String leiras() {
        return "ez a kezdés! Jobbra vagy balra?";
    }

    @Override
    public Helyszin BalIrany() 
    {   
        return new Balra();
        
    }

    @Override
    public String BalFelirat() {
        return "Balra";
    }
    @Override
    public String JobbFelirat(){
        
        return "Jobbra";
        
    }
    @Override
    public Helyszin JobbIrany() 
    {
        return new Jobbra();
    }
}

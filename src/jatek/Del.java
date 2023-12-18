/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jatek;

/**
 *
 * @author bella.richard
 */
public class Del extends Helyszin implements MasikIrany{

    public Del() {
    }

    @Override
    public String leiras() {
        return "Ez Dél!";
    }

    @Override
    public String BalFelirat() {
        return "D1";
    }

    @Override
    public Helyszin BalIrany() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String JobbFelirat() {
        return "D2";
    }

    @Override
    public Helyszin JobbIrany() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

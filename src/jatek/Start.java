package jatek;

public class Start extends Helyszin {

    @Override
    public String leiras() {
        return "Ez a start. haladj tovabb";
    }

    @Override
    public Helyszin BalIrany() {
        return new Kezdes();
    }

    @Override
    public String BalFelirat() {
        return "Tovább";
    }

    @Override
    public String JobbFelirat() {
        return "Tovább";
    }

    @Override
    public Helyszin JobbIrany() {
        return new Kezdes();
    }

}

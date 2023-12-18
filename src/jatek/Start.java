package jatek;

public class Start extends Helyszin {

    @Override
    public String leiras() {
        return "Ez a start. haladj tovabb";
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


package jatek;

import java.util.UUID;

class Targy {
    private String nev, leiras;
    private UUID id;

    public Targy(String nev, String leiras) {
        this.nev = nev;
        this.leiras = leiras;
        UUID randomUUID = UUID.randomUUID();
        this.id = randomUUID;
    }
    
    
}

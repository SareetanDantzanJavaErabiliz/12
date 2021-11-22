/**
 *
 * Egileak: Iñaki Goirizelaia eta Maider Huarte. UPV/EHU.
 */

import java.io.File;

class Fitxategia {
    File fitxategia;
    
    Fitxategia( String izena ) {
        fitxategia = new File( izena );
    }
    
    void fitxategiaEzabatu( ) {
        if ( fitxategia.exists( ) ) {
            fitxategia.delete( );
        }
    }    
}

/*
 * Egileak: Iñaki Goirizelaia eta Maider Huarte. UPv/EHU
 * 
 * Fitxategia.java: Fitxategi bitarrak irakurri/idatzi
 * 
 * 
 * 
 * 
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

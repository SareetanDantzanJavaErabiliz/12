/**
 *
 * Egileak: Iñaki Goirizelaia eta Maider Huarte. UPV/EHU.
 */

package fitxategiak2;

import java.io.File;

public class Fitxategiak2 {

  
    public static void main( String[ ] parametroak ) { 

	File fitxategia = new File( "NireFitxategia.txt" );
	System.out.println( fitxategia.length ( ) );
        System.out.println( fitxategia );
    }
}



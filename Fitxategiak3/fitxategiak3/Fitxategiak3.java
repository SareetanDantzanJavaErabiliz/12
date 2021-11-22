/**
 *
 * Egileak: Iñaki Goirizelaia eta Maider Huarte. UPV/EHU.
 */

package fitxategiak3;

import java.io.File;

public class Fitxategiak3 {

    public static void main( String[ ] parametroak ) {
        
		File direktorioa = new File( "NireKarpeta" );
		File fitxategia = new File( direktorioa, "NireFitxategia.txt" );
                System.out.println( fitxategia );
		System.out.println( fitxategia.getAbsolutePath( ) );
                
                //Oraindik NireFitxategia.txt ez dago sortuta. 
                //Bakarrik beraren informazioa gordeko duen "fitxategia" objektua.

	}
}

    
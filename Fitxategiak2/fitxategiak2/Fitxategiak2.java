
package fitxategiak2;
import java.io.File;

/**
 *
 * Egileak: Iñaki Goirizelaia eta Maider Huarte. UPV/EHU.
 */
public class Fitxategiak2 {

  
    public static void main( String[ ] parametroak ) { 

	File fitxategia = new File( "c:/NireFitxategia.txt" );
	System.out.println( fitxategia.length ( ) );
        System.out.println( fitxategia );
    }
}



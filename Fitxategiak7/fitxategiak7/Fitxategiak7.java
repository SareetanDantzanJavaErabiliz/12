/**
 *
 * Egileak: Iñaki Goirizelaia eta Maider Huarte. UPV/EHU.
 */

package fitxategiak7;

import java.io.FileInputStream;
import java.io.IOException;

public class Fitxategiak7 {

    public static void main( String[ ] parametroak ) throws IOException {

        try( FileInputStream irakurri = new FileInputStream( "fitxategia.dat" ) ) {              
            int k;    
            while ( (k = irakurri.read( ) ) != -1 ) {    
                System.out.print( ( char ) k );
            }
        }
        catch( Exception s ) {
              System.out.println( "Salbuespena:"+ s.getMessage( ) );
        }
    }
}

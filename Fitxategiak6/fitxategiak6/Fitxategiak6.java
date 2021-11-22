/**
 *
 * Egileak: Iñaki Goirizelaia eta Maider Huarte. UPV/EHU.
 */

package fitxategiak6;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fitxategiak6 {

    public static void main( String[ ] parametroak ) throws IOException {

        try( FileOutputStream fos1 = new FileOutputStream( "f1.dat" );
        	 FileOutputStream fos2 = new FileOutputStream( "f2.dat" );
        	 ByteArrayOutputStream baos = new ByteArrayOutputStream( ) ) {              
        	
        	// ByteArrayOutputStreamean 'N' karakteari dagokion kodea idazten da
        	baos.write( 78 );
        	
        	// ByteArrayOutputStreamean dagoena FileOutputStreamean idatzi
        	// Horrela fitxategi bi hauetan idazten dugu
        	baos.writeTo( fos1 );
        	baos.writeTo( fos2 );
        }
        catch( Exception s ) {
        	System.out.println( "Salbuespena:"+ s.getMessage( ) );
        }
    }
}

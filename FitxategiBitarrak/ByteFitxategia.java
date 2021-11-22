/**
 *
 * Egileak: Iñaki Goirizelaia eta Maider Huarte. UPV/EHU.
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

class ByteFitxategia extends Fitxategia {
    
    ByteFitxategia( String izena ) {
        super( izena );
    }  
        
    void byteFitxategiaSortu( ) {
        fitxategiaEzabatu( );

        byte[] buffer = new byte[ 20 ];//20 bytetako array bat sortu
        Random r = new Random( );//Random objektu bat sortzen du
        r.nextBytes( buffer );//random objektuarekin 160 bytetako arraya ausazko 160 bytekin betetzen du    
        
        try (FileOutputStream fos = new FileOutputStream( fitxategia ) ) {
            System.out.println( "\n"+fitxategia.getName()+" fitxategia sortzen..." );            
            fos.write( buffer, 0, buffer.length );
            System.out.println( fitxategia.getName( )+" fitxategia sortua izan da." );
        }
        catch( IOException s ) {
            System.out.println( s.getMessage( ) );
        }
    }
        
    void byteFitxategiaBistaratu( ) {
        
        byte[ ] buffer;
        
        try( FileInputStream fis = new FileInputStream( fitxategia ) ) {
            long irakurtzeke = fitxategia.length( );
            buffer = new byte[ 128 ];
            int irakurriak = 0;

            System.out.println( fitxategia.getName( )+" fitxategiaren edukia: " );
            while ( irakurtzeke > 0 ) {
                irakurriak = fis.read( buffer );
                System.out.print( ""+new String( buffer, 0, irakurriak ) );
                irakurtzeke = irakurtzeke - irakurriak;
            }
            System.out.println( );

        }
        catch( IOException s ) {
            System.out.println( s.getMessage( ) );
        }
    }   
}

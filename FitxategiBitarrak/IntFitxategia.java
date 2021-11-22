/**
 *
 * Egileak: Iñaki Goirizelaia eta Maider Huarte. UPV/EHU.
 */

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

class IntFitxategia extends Fitxategia {
    
    IntFitxategia( String izena ) {
        super( izena );
    }
    
    void intFitxategiaSortu( ) {
        fitxategiaEzabatu( );
        
        Random r = new Random( );
        int balioa;
        
        try( DataOutputStream dos = new DataOutputStream( new FileOutputStream( fitxategia ) ) ) {
            System.out.println( "\n"+fitxategia.getName( )+" fitxategia sortzen..." );
            for ( int i = 0; i < 4; i++ ) {
                balioa = r.nextInt( );
                dos.writeInt( balioa );
            }
            System.out.println( "\n"+fitxategia.getName( )+" fitxategia sortua izan da." );
        }
        catch( IOException s ) {
            System.out.println( s.getMessage( ) );
        }
    }
        
    void intFitxategiaBistaratu( ) {
        
        try( DataInputStream dis = new DataInputStream( new FileInputStream( fitxategia ) ) ) {
            long irakurtzeke = fitxategia.length( ) / ( Integer.SIZE/8 );
            int balioa;
            System.out.println( fitxategia.getName( )+" fitxategiaren edukia: " );                
            while ( irakurtzeke > 0 ) {
                balioa = dis.readInt( );
                irakurtzeke--;
                    
                System.out.print( balioa+"\t" );
            }
            System.out.println( );

        }
        catch( IOException s ) {
            System.out.println( s.getMessage( ) );
        }
    }  
}

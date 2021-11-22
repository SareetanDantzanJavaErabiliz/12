/**
 *
 * Iñaki Goirizelaia eta Maider Huarte. UPV/EHU.
 */

package aegana;

import java.io.IOException;
import java.io.RandomAccessFile;

class RAFFitxategia extends Fitxategia {
    
    RAFFitxategia( String izena ) {
        super( izena );
    }

    void testuFitxategiaSortu ( ) {
        fitxategiaEzabatu ( );
                
        try( RandomAccessFile raf = new RandomAccessFile( fitxategia, "rw" ) ) {
                raf.writeBytes( "Hirurogeita hamabost urte\n" );
                raf.writeBytes( "urte gozo ta urte latz\n" );
                raf.writeBytes( "orduko haien amets bera da\n" );
                raf.writeBytes( "gure hauspo ta gure hats.\n" );
                raf.writeBytes( "Ezagutza da aldaketa nahiz\n" );
                raf.writeBytes( "hobekuntza denen ardatz,\n" );
                raf.writeBytes( "Unibertsitate honek jada\n" );
                raf.writeBytes( "eman ditu hainbat urrats,\n" );
                raf.writeBytes( "segiko dugu sustraiak bertan\n" ); 
                raf.writeBytes( "eta adarrak mundurantz\n" );
                System.out.println( fitxategia.getName( )+" fitxategia sortua izan da." );                                
        }
        catch( IOException s ) {
            System.out.println( s.getMessage( ) );
        }
    }

    void testuFitxategiaBistaratu ( ) { 
        
        try( RandomAccessFile raf = new RandomAccessFile(fitxategia, "r") ) {
                String lerroa;
                System.out.println(fitxategia.getName( )+" fitxategiaren edukia: " );  
                
                while ( ( lerroa = raf.readLine( ) )!= null ) {
                    System.out.println( lerroa );
                }
                System.out.println( );                
        }
        catch( IOException s ) {
            System.out.println( s.getMessage( ) );
        }
    }    
}


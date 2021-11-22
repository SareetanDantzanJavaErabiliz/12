/**
 *
 * Egileak: Iñaki Goirizelaia eta Maider Huarte. UPV/EHU.
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class SA9_2AD {

    public static void main( String [ ] parametroak ) {
        ByteFitxategia fitxategi1 = new ByteFitxategia( "Fitxategi1.bmp" );
        fitxategi1.byteFitxategiaSortu( );
        fitxategi1.byteFitxategiaBistaratu( );
        
        IntFitxategia fitxategi2 = new IntFitxategia( "Fitxategi2.dat" );
        fitxategi2.intFitxategiaSortu( );
        fitxategi2.intFitxategiaBistaratu( );
        
        ObjectFitxategia fitxategi3 = new ObjectFitxategia( "Fitxategi3.dat" );
        fitxategi3.objectFitxategiaSortu( );
        fitxategi3.objectFitxategiaBistaratu( );
        
        kopiatu( "Fitxategi1.bmp","Fitxategi1Kopia.bmp" );
        ByteFitxategia fitxategi1Kopia = new ByteFitxategia( "Fitxategi1Kopia.bmp" );
        fitxategi1Kopia.byteFitxategiaBistaratu( );
        
        kopiatu( "Fitxategi2.dat","Fitxategi2Kopia.dat" );
        IntFitxategia fitxategi2Kopia = new IntFitxategia( "Fitxategi2Kopia.dat" );
        fitxategi2Kopia.intFitxategiaBistaratu( );
        
        kopiatu( "Fitxategi3.dat","Fitxategi3Kopia.dat" );
        ObjectFitxategia fitxategi3Kopia=new ObjectFitxategia( "Fitxategi3Kopia.dat" );
        fitxategi3Kopia.objectFitxategiaBistaratu( );      
    }
    
    private static void kopiatu( String kopiatzekoa, String kopia ) {

        try( FileInputStream fis = new FileInputStream( kopiatzekoa );
             FileOutputStream fos = new FileOutputStream( kopia ) ) {
            
            byte[] buffer = new byte[ 256 ];
            int irakurriak;
            while ( (irakurriak = fis.read( buffer ) ) > 0 ) {
                    fos.write( buffer, 0, irakurriak );
            }     
            
        }
        catch( Exception s ) {
            System.err.println( "Fitxategiak kopiatzerakoan errorea " + s.getMessage( ) );
        }        
    }    
}

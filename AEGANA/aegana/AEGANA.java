/**
 *
 * Iñaki Goirizelaia eta Maider Huarte. UPV/EHU.
 */

package aegana;

import java.io.IOException;
import java.io.RandomAccessFile;

public class AEGANA {
    public static void main( String[ ] parametroak ) {
        System.out.println( "Bertsoa.txt: 1. bertsioa" );        
        RAFFitxategia rAFFitxategia=new RAFFitxategia( "Bertsoa.txt" );
        rAFFitxategia.testuFitxategiaSortu( );
        rAFFitxategia.testuFitxategiaBistaratu( );

        System.out.println( "Bertsoa.txt: 2. bertsioa" );
        aldatu( "Bertsoa.txt" );
        rAFFitxategia.testuFitxategiaBistaratu( );
    }
    
    private static void aldatu( String aldatzekoa ) {        
        try( RandomAccessFile raf = new RandomAccessFile( aldatzekoa,"rw" ) ) {

            //RandomAccessFile raf aldagaia sortzen dugu, "aldatzekoa" deitutako fitxategian idazteko (eta irakurtzeko)
            //Irakurri/idazteko indizea amaierara mugitu
            raf.seek( raf.length ( ) ); 
            raf.writeBytes( "1936an sorturiko Universidad Vasca / Euzko Irakastola Nagusiaren omenez\n" );

            //Fitxategiaren amaieran idatzi
            raf.writeBytes( "Andoni Egaña, 2011\n" ); 
        }
        catch( IOException s ) {
            System.out.println( s.getMessage ( ) );
        }
    }
}


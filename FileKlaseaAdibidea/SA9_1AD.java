/**
 *
 * Iñaki Goirizelaia eta Maider Huarte. UPV/EHU.
 */

import java.io.File;

public class SA9_1AD {
    public static void main( String[ ] parametroak ) {
        
        //MAIN-ARI PASATUTAKO PARAMETROEN KOPURUA EGIAZTATZEN DA.
        if ( parametroak.length > 0 ) {       

            for ( int i = 0; i < parametroak.length; i++ ) {              
                File f = new File( parametroak[ i ] );
                System.out.println( "Parametro gisa adierazitako "+(i+1)+". fitxategiaren izena: "+f.getName( ) );
                System.out.println( "Parametro gisa adierazitako "+(i+1)+". fitxategiaren kokapena: "+f.getParent( ) );
                System.out.println( "Parametro gisa adierazitako "+(i+1)+". fitxategiaren kokapena+izena: "+f.getPath( ) );

                if ( f.exists( ) ) {
                    System.out.print( "Fitxategia existitzen da" );
                    if( f.canRead ( ) ) {
                        System.out.print( ", irakur daiteke" );
                    }
                    if ( f.canWrite ( ) ) {
                        System.out.print( " eta baita idatzi ere" );
                    }
                    
                    System.out.println( "." );
                    System.out.println( "Fitxategiaren tamaina "+f.length( )+" byte da" );
                }
                else {
                    System.out.println( "Parametro gisa adierazitako "+(i+1)+". fitxategia ez da existitzen kokapen horretan" );
                }
            }
        }
        else{
            System.out.println( "Fitxategi bat adierazi behar duzu exekuzioaren argumentu modura" );
        }  
    }    
}

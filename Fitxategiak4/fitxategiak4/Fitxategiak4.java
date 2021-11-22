/**
 *
 * Egileak: Iñaki Goirizelaia eta Maider Huarte. UPV/EHU.
 */

package fitxategiak4;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class Fitxategiak4 {
  
    public static void main( String[ ] parametroak ) {
        
        String irteerakoFitxategia = "datuprimitiboak.dat";

        try( DataOutputStream dos = new DataOutputStream(
                                        new FileOutputStream (
                                            irteerakoFitxategia ) ) ) {

          dos.writeInt( 13 );
          dos.writeDouble( 18.89 );
          dos.writeBoolean( true );
          
          //utf kodea erabiliz karaktere kate bat idazten du
          dos.writeUTF( "fitxategiak idazten ikasten ari gara" ); 
          dos.flush();//Bufferra garbitzen du

          System.out.println( "Datuak ondoko fitxategian idatzi dira "+ 
                             ( new File( irteerakoFitxategia ) ).getAbsolutePath( ) );
        } 
        catch (Exception e) {
          e.printStackTrace();
        }
 
    }
    
}


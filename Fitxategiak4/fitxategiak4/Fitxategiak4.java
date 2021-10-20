/*
 *
 * Egileak: Iñaki Goirizelaia eta Maider Huarte. UPV/EHU.
*/
package fitxategiak4;

import java.io.FileOutputStream;
import java.io.DataOutputStream;
import java.io.File;

public class Fitxategiak4 {

  
    public static void main( String[ ] parametroak ) {
        
        String irteerakoFitxategia = "datuprimitiboak.dat";

        try( DataOutputStream dos = new DataOutputStream(
                                        new FileOutputStream (
                                            irteerakoFitxategia ) ) ) {

          dos.writeInt( 765 );
          dos.writeDouble( 6789.50 );
          dos.writeBoolean( true );
          
          //utf kodea erabiliz karaktere kate bat idazten du
          dos.writeUTF( "fitxategiak idazten ikasten ari gara" ); 
          dos.flush();//Bufferra garbitzen du

          System.out.println("Datuak ondoko fitxategian idatzi dira "+ 
                             (new File( irteerakoFitxategia ) ).getAbsolutePath( ) );
        } 
        catch (Exception e) {
          e.printStackTrace();
        }
 
    }
    
}


/**
 *
 * Egileak: Iñaki Goirizelaia eta Maider Huarte. UPV/EHU.
 */

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class XalbadorBertsolaria {

   public static void main( String[] parametroak )throws IOException {
       
      try( FileWriter idatzi = new FileWriter( "Xalbador.txt" ) ) {    
          idatzi.write ( " aunitz\n maite \n duenak \n"+" aunitz\n sofritzen \n du \n Xalbador" );
          idatzi.flush ( );
          
          try( FileReader irakurri = new FileReader( "Xalbador.txt" ) ) {

              char [] arraya = new char[ 100 ];
              irakurri.read( arraya );
              
              for(char k : arraya) {
                System.out.print( k ); 
              }
          }
          catch (IOException ios) {
              ios.getMessage();
          }
        
      }
      catch (IOException s) {
          s.getMessage();
      }
   }
}


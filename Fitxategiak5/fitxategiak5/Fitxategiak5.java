/*
 * 
 * Egileak: Iñaki Goirizelaia eta Maider Huarte. UPV/EHU.
 */

package fitxategiak5;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fitxategiak5 {

   public static void main( String [] parametroak )/*throws IOException*/ {

      // UTF-8 kodea erabiliz karaktere kate bat idatzi fitxategian
      try ( DataOutputStream idatzi = new DataOutputStream ( new FileOutputStream( "fitxategia5.txt" ) );
            DataInputStream irakurri = new DataInputStream( new FileInputStream( "fitxategia5.txt") ) ) {
          
        idatzi.writeUTF( "Nafarroako dantza ederrak" );
        idatzi.writeUTF( "Lesakako Zubigaineko dantza" );
        
        System.out. println( "Karaktere kateak irakurtzen:" );
        while ( irakurri.available ( ) > 0 ) {
            String karaktereKatea = irakurri.readUTF( );
            System.out.println( karaktereKatea );
        }

      }
      catch (IOException s) {
          s.printStackTrace();
      }
      
      try (DataInputStream irakurri2 = new DataInputStream( new FileInputStream( "fitxategia5.txt" ) ) ) {
            System.out.println( "\nKarakterez karaktere irakurtzen:" );
            while ( irakurri2.available ( ) > 0 ) {
                char k = (char) irakurri2.read( );
                System.out.print( k );
            }
      }
      catch (IOException s) {
            s.printStackTrace();
      }

   }
}
   

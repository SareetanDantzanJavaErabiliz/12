import java.io.*;
public class Fitxategiak4-1 {
    public static void main( String[ ] parametroak ) {     
      try ( FileOutputStream fos1 = new FileOutputStream( "f1.dat" );    
            FileOutputStream fos2 = new FileOutputStream( "f2.dat" );
            ByteArrayOutputStream baos = new ByteArrayOutputStream( ) ) {       

            // ByteArrayOutputStreamean N karakteari dagokion kodea idazten da 
            baos.write( 78 );
  
            // ByteArrayOutputStreamean dagoena FileOutputStreamean idatzi 
            // Horrela fitxategi bi hauetan idazten dugu
            baos.writeTo( fos1 );    
            baos.writeTo( fos2 );              
        }
        catch( IOException s ) {
            System.out.println( s.getMessage( ) );
        }        
    }    
}


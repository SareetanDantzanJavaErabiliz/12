/*
 * 2013-2015 Maider Huarte Arrayago (maider.huarte@ehu.eus)
 * 
 * ObjectFitxategia.java: Fitxategi bitarrak irakurri/idatzi
 * 
 * 
 * 
 * 
*/

import java.io.*;
import java.util.Date;

class ObjectFitxategia extends Fitxategia {
    
    ObjectFitxategia( String izena ) {
        super( izena );
    }
    
    void objectFitxategiaSortu( ) {
        fitxategiaEzabatu( );

        String eguna = "Gaur: ";
        Date d = new Date( ); // data gordetzen duen objketua sortu
        
        try( ObjectOutputStream oos = new ObjectOutputStream( new FileOutputStream( fitxategia ) ) ) {
            System.out.println( "\n"+fitxategia.getName( )+" fitxategia sortzen..." );            
            oos.writeObject( eguna );  //String objektua fitxategian idatzi              
            oos.writeObject( d ); //Date objektua fitxategian idatzi
            System.out.println( "\n"+fitxategia.getName( )+" fitxategia sortua izan da." );                

        }
        catch( IOException s ) {
            System.out.println( s.getMessage( ) );
        }
    }
        
    void objectFitxategiaBistaratu( ) {
        
        try( ObjectInputStream ois = new ObjectInputStream(new FileInputStream( fitxategia ) ) ) {
            System.out.println( fitxategia.getName( )+" fitxategiaren edukia: " );                
            String s = (String)ois.readObject( );
            Date d = (Date)ois.readObject( );
            System.out.println( s );
            System.out.println( d );
        } 
        catch( Exception s ) {
            System.out.println( s.getMessage( ) );
        }
    }  
}

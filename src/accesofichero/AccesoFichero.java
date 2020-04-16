

package accesofichero;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class AccesoFichero {

   
    public static void main(String[] args) {
        
         FileReader archivo=null;
        try {
            //String archivo="C:\\Users\\JOZE RODRIGUEZ\\Documents\\accesodesdejava.txt";
            archivo = new FileReader("C:\\Users\\JOZE RODRIGUEZ\\Documents\\accesodesdejava.txt");
            AccederFichero archivoLeer=new AccederFichero();
            //archivoLeer.LeerArchivo(archivo);
            archivoLeer.leerArchivoConBuffer(archivo);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AccesoFichero.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                archivo.close();
            } catch (IOException ex) {
                Logger.getLogger(AccesoFichero.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
}

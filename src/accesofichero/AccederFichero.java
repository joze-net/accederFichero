
package accesofichero;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class AccederFichero {
    
    public void LeerArchivo(String fichero){
        
        try {
            FileReader archivo= new FileReader( fichero);//la clase FileReader se usa para leer archivos,aqui accedemos al archivo
            int entero=archivo.read();//la lectura lo que hace es obtener el codigo de cada caraacter del archivo, por eso se guarda en variable entera
            
            while(entero != -1){//cuando se detecte -1 durante la lectura quiere decir que termino de leer el archivo
                char letra=(char)entero;//hacemos un casting para convertir el entero en un caracter
                System.out.print(letra);//mostramos la letra
                entero=archivo.read();//ya que se debe seguir leyendo el resto de caracteres se debe volver a leer dentro del ciclo
                
            }
        } catch (IOException ex) {
            //Logger.getLogger(AccederFichero.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("No se encontro el archivo, ocurrio un error");
        }
        
    }
    
}

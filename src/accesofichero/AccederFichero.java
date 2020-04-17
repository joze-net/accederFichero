
package accesofichero;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


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
            archivo.close();
        } catch (IOException ex) {
            //Logger.getLogger(AccederFichero.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("No se encontro el archivo, ocurrio un error");
        }
        
    }
    
    
   public void escribirArchivo(){
       String frase="Frase de java 2";//la frase que se ingresara al documento
       
        try {
            FileWriter archivo= new FileWriter("C://Users/JOZE RODRIGUEZ/Documents/EsScribiendoDesdeJava.txt",true);//aqui ponemos la ruta de creacion del archivo y agregamos verdadero si y existe el archivo
            
              for(int i=0;i<frase.length();i++){
                  
                  archivo.write(frase.charAt(i));
                  
              }
              
              archivo.flush();//se necesita este metodo para cargar los caracteres al documento
        } catch (IOException ex) {
            System.out.println("A ocurrido un error");
        }
        
        
   }
   
   public void leerArchivoConBuffer(FileReader ruta){
       
       BufferedReader leerArchivo=new BufferedReader(ruta);//para leer medio bufer sr necesita el tipo de dato filereader
       
       String texto="";
       
       while(texto!=null){
           
           try {
               texto=leerArchivo.readLine();//con este metodo leemos el contenido del texto y lo guardamos en n string
               if(texto!=null){
               System.out.println(texto);
               }
           } catch (IOException ex) {
               System.out.println("a ocurrido un error");
           }
           
       }
       
   }
    
}

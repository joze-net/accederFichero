
package claseFile.manipularArchivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class SubPrincipal {

   
    public static void main(String[] args) {
       
       File nuevoCarpeta=new File("C:"+File.separator+"Users"+File.separator+"JOZE RODRIGUEZ"+File.separator+"documents"+File.separator+"nuevo-desde-java");
        nuevoCarpeta.mkdir();//asi creamos  una nueva carpeta en la ruta que seleccionemos
        File nuevoArchivo=new File("C:"+File.separator+"Users"+File.separator+"JOZE RODRIGUEZ"+File.separator+"documents"+File.separator+"nuevo-desde-java"+File.separator+"archivo_desde_java.txt");
      
        try{
        nuevoArchivo.createNewFile();//y asi creamos un archivo en la ruta que dispongamos en este caso en la nueva carpeta que creamos
        }catch(IOException n){
            System.out.println("error al crear el archivo");
        }
        
        
        try{
            
            //----- aqui vamos a escribir sobre el archivo creado antes -----------------------------------------
        FileWriter escribir=new FileWriter(nuevoArchivo.getAbsoluteFile());//esta clase nos permite escribir sobre un archivo en especifico
        String frase="pude de diferente manera";//creamos la frase que pondremos en el archivo
           
       for (int i=0;i<frase.length();i++){ 
        escribir.write(frase.charAt(i));//iteramos para escribir caracter por caracter en el documento
       }
       escribir.close();//cerramos el documento
        }catch(IOException e){
            System.out.println("No se pudo es ribir sobre el archivo");
        }
        //-------------------------------------------------------------------------------------------------------------
        
       eliminarArchivo(nuevoCarpeta);
       
       
    }
    
    
    
     public static void eliminarArchivo( File archivoEliminar){//metodo para eliminar un archivo o carpeta
            
        archivoEliminar.delete();//instruccio para eliminar el archivo pasado por parametro...
         
     }
    

    
}
//NOTA para usar este codigo se debe manipular para ser utilizadoen algun programa, este se realizo solo de manera para practicar codigo..
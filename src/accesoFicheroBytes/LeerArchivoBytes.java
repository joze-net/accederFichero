
package accesoFicheroBytes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class LeerArchivoBytes {
    
   public void leerAArchivoByte(){
       
        try
        {
            FileInputStream archivo=new FileInputStream("C:/users/JOZE RODRIGUEZ/pictures/3D LOGO.png");//aqui podemos abrir o acceder al archivo
            int BytesDeArchivo;//en esta varibable guardamos los bytes del archivo
            int totalDatos=0;//contador
            int arrayDatos[]=new int [12357];//creamos un array para almacenar los datos del archivo
            boolean finArchivo=false;//con esta variable manejaremos cuando se llegue al final del archivo
            
            while(!finArchivo){
                
                BytesDeArchivo=archivo.read();//leemos los datos del archivo y lo guardamos en una variable
                
                if(BytesDeArchivo!=-1){
                    
                    arrayDatos[totalDatos]=BytesDeArchivo;///guardamos los bytes obtenidos dentro del array
                    System.out.println(arrayDatos[totalDatos]);//y los vamos mostrando
                    totalDatos++;//vamos aumnetado el contador aqui ya que es donde no ha terminado el archivo
                    
                   
                }else{//cuando esta variable sea 1-1 quiere decir que es el final del archivo
                    finArchivo=true;//de tal forma cambiamos el valor a la variable booleana y salir del ciclo
                     
                }
                
            }
            
            System.out.println(totalDatos);
            copiar_archivo(arrayDatos);///pasamos los datos contenidos en el arraydatos al metodo encargado de crear una copia del archivo 
            
        }catch(IOException e)
        {
            System.out.println("A ocurrido un error");
        }
       
   }
   
   static void copiar_archivo(int datos_de_bytes[]){//metodo de clase para crear copia del archivo usando los datos pasados en bytes por medio del array
       
       try {
           
           FileOutputStream copia=new FileOutputStream("C:/users/JOZE RODRIGUEZ/pictures/3D LOGO_copia.png");//creamos el nuevo archivo copia
           
           for(int i=0;i<datos_de_bytes.length;i++){
               
               copia.write(datos_de_bytes[i]);//dentro del ciclo copiamos byte por byte en la nueva ruta
               
           }
       } catch (IOException e) {
           
           System.out.println("No se pudo copiar el archivo");
       }
       
   }
    
}

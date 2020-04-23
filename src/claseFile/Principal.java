
package claseFile;

import java.io.File;


public class Principal {

  
    public static void main(String[] args) {
      
            File archivo=new File("C:/Users/JOZE RODRIGUEZ/documents");//asi podemos explorar una ruta o archivo en especifico
            
            
            String [] listaArchivos=archivo.list();//el metodo lis() devuelve la lista de un directoritorio especifico
            
            for (String listado:listaArchivos){///dentro de este for listaremos la lista de archivos de un subdirectorio en especifico
                File subdirectorio=new File(archivo.getAbsolutePath(),listado);//creamos una nueva vari con la ruta anterior y con cada uno de los archivos dentro del
                
                if(subdirectorio.isDirectory() && subdirectorio.getName().equals("DRIVERS")){//aqui analizaremos cada uno de los archivos para saber si es carpeta y debe llamarse DRIVERS
                    String[] listaArchiSub=subdirectorio.list();//Y ASI LISTAMOS LOS ARCHIVOS DE ESE SUBDIRECTORIO
                    
                    for(String l:listaArchiSub){
                        System.out.println(l);//y dentro de un for each mostramos los resultados en consola
                    }
                };
            }
        
    }
    
}

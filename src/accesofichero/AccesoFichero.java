

package accesofichero;


public class AccesoFichero {

   
    public static void main(String[] args) {
        
        String archivo="C:\\Users\\JOZE RODRIGUEZ\\Documents\\entrevista.txt";
        AccederFichero archivoLeer=new AccederFichero();
        archivoLeer.LeerArchivo(archivo);
        
    }
    
}

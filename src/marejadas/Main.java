package marejadas;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.*;

public class Main {
    public static void main(String[] args){
        LectorArchivo lector = new LectorArchivo();
        List<Dato> datos = lector.leer("");
        
       // for(Dato d : datos){
         //   d.mostrar();
      //  }
      /***Consulta directa al sitio web***/
    }
    try{
    //1. definir la URL
    String urlStr = "https://fundacion-instituto-profesional-duoc-uc.github.io/ATY1102-Surf/Nodo%205%20(-27,-72)%20-%20Bahia%20Inglesa.txt";
    var url = new URL(urlStr);
    //2. Crear un archivo temporal:
    File tempFile = File.createTempFile("NodoIquique", ".txt");
    TempFile.deleteOnExit();
    //3. Copiar desde la url desde el archivo temporal:
    try(InputStream in = url.openStream()){
        Files.copy(in, tempFile.toPath(),StandardCopyOption.REPLACE_EXISTING);
        
        
    }
    //4.Unificar el archivo temporal con los objetos 
    LectorArchivo lector = new LectorArchivo();
    List<Dato> datos = lector.leer(tempFile.getAbsolutePath());
    //5.Mostrar los resultados
    for(Dato d : datos){
        d.mostrar();
    }
}

}
catch(Exception e){
    e.printStackTrace();
}

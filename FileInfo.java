import java.io.File;
import java.util.Date;

public class FileInfo{
    public static void main(String[] args){
        //1. recibe un argumento que será el nombre de un fichero
        if (args.length != 1){
            System.out.println("Error: Debes proporciona el nombre del fichero.");
            System.out.println("Ejemplo: java FileInfo barcos.txt");
            return;
        }

        String nombreOriginal = args[0];
        File fichero = new File(nombreOriginal);

        System.out.println("--- Información del fichero ---");

        //2. obtiene info del fichero y la imprime por pantalla
        if (fichero.exists()){
            System.out.println("Estado: El fichero EXISTE.");
            System.out.println("Ruta completa: " + fichero.getAbsolutePath());
            System.out.println("Tamaño: " + fichero.length() + " bytes.");
            System.out.println("Permiso de lectura: " + (fichero.canRead() ? "Sí" : "No"));
            System.out.println("Permiso de escritura: " + (fichero.canWrite() ? "Sí" : "No"));
            System.out.println("Permiso de ejecución: " + (fichero.canExecute() ? "Sí" : "No"));

            Date fechaModificacion = new Date(fichero.lastModified());
            System.out.println("Última modificación: " + fechaModificacion);

            //3. Cambia su nombre por otro
            File nuevoFichero = new File("modificado_" + nombreOriginal);
            boolean renombrado = fichero.renameTo(nuevoFichero);

            System.out.println("\n--- Operación de renonmrado ---");
            if(renombrado){
                System.out.println("Éxito: El fichero ha sido renombrado a '" + nuevoFichero.getName() + "'.");
            } else{
                System.out.println("Error: No se pudo renombrar el fichero.");
            }
            
        } else{
            System.out.println("Error: El fichero '" + nombreOriginal + "' no existe en el directorio actual.");
        }

    
    }
}
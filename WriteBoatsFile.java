import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteBoatsFile{
    
    public static void main(String[] args){
        //Recibe unn argumento con el nombre del fichero
        if (args.length !=1){
            System.out.println("Error: Debes proporcionar el nombre del fichero.");
            System.out.println("Ejemplo: java WriteBoatsFile barcos.txt");
            return;
        }

        String nombreFichero = args[0];
        File fichero = new File(nombreFichero);
        Scanner teclado = new Scanner(System.in);


        //2. Comprueba si el fichero ya existe
        if(fichero.exists()) {
            System.out.println("Aviso: El fichero '" + nombreFichero + "' ya existe.");
            System.out.print("¿Deseas continuar? (S/N): ");
            String respuesta = teclado.nextLine();

            if (!respuesta.equalsIgnoreCase("S")) {
                System.out.println("Operación cancelada.");
                System.exit(0); //Termina la ejecucion del programa
            }
        }

        //3. Crear el fichero y escribir en él
        try (PrintWriter escritor = new PrintWriter(new FileWriter(fichero))){
            // Comentario al principio
            escritor.println("# Lista de embarcaciones atracadas en el puerto");

            //Barco recreativo (B): Matricula; Nombre; Eslora (con coma); Cuota; Fechas
            escritor.println("B;ABC1234;Santa Maria;12,1;40;02/04/2024;30/11/2024");

            //Velero
            escritor.println("V;CDR4321;Furor;14,6;55;09/08/2024");

            //Comentario entree lineas 
            escritor.println("# Datos de la flota pesquera");

            //Barco pesquero (P) - No lleva lista de fechas
            escritor.println("P;FTY7531;Titanic;22,2;80");

            //comentario al final
            escritor.println("# Fin de la lista");

            System.out.println("Fichero '" + nombreFichero + "' creado correctamente.");
        } catch (IOException e){
            System.out.println("Error de entrada/salida al procesar el fichero: " + e.getMessage());
        } finally{
            teclado.close();
        }

    }
}
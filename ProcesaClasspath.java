import java.util.Scanner;

public class ProcesaClasspath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //leer linea del teclado con formato classpath
        System.out.println("Introduce la ruta CLASSPATH: ");
        String classpath = scanner.nextLine();

        //Dividir cadena en componentes separados por :
        String [] componentes = classpath.split(":");

        System.out.println("Número total de componentes: " + componentes.length);
        System.out.println("Componentes: ");

        //contadores
        int contadorJars = 0;
        int contadorDirectorios = 0;
        int contadorUsr = 0;

        //Imprimir cada componente y analizar tipo de componente
        for (int i= 0; i<componentes.length; i++){
            String componente = componentes[i];
            System.out.println(componente);

            //contar ficheros jar, dir y descendientes de usr
            if (componente.endsWith(".jar")) {
                contadorJars++;
            } else {
                contadorDirectorios++;
            }

            if (componente.startsWith("/usr")){
                contadorUsr++;
            }
        }
        
        //Mostrar recuento total
        System.out.println("\n--- Informe del CLASSPATH ---");
        System.out.println("Directorios: " + contadorDirectorios);
        System.out.println("Ficheros JAR: " + contadorJars);
        System.out.println("Componentes que descienden de /usr: " + contadorUsr);

        scanner.close();
    }
}
import java.util.Scanner;

public class EncriptaCadena{
    public static void main(String[] args){ 
        Scanner scanner = new Scanner(System.in);
        //Leer una línea del teclado introducida por el usuario e Imprimirla por pantalla
        System.out.println("Introduce una cadena: ");
        String linea = scanner.nextLine();
        System.out.println("Cadena introducida: " + linea);

        //Informar de longitud, imprimir su versión en mayúsculas y minúsculas
        System.out.println("Longitud de la cadena: " + linea.length());
        System.out.println("Cadena en mayúsculas: " + linea.toUpperCase());
        System.out.println("Cadena en minúsculas: " + linea.toLowerCase());


        //Encripar la cadena introducida por el usuario, sumando a cada caracter su posición en la cadena
        StringBuilder cadenaEncriptada = new StringBuilder();

        for (int i=0; i<linea.length(); i++){
            char caracterOriginal = linea.charAt(i);

            char caracterEncriptado = (char) (caracterOriginal + i);
            cadenaEncriptada.append(caracterEncriptado);
        }

        System.out.println("Cadena encriptada: " + cadenaEncriptada.toString());
        
        scanner.close();
    }
}
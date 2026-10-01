import java.util.Scanner;
import java.util.Arrays;

public class LeeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numeros = new int[5];
        System.out.println("Introduce 5 números enteros: ");

        //Leer del teclado 5 numeros enteros y almacenarlos en un array
        for (int i=0; i < numeros.length; i++) {
            System.out.print("Número " + (i+1) + ": ");
            String linea = scanner.nextLine();
            numeros[i] = Integer.parseInt(linea);   
        }
        //REcorrer el array y mostrar los números introducidos
        System.out.println("Array original: ");
        for (int i= 0; i<numeros.length; i++){
            System.out.print(numeros[i] + " ");
        }
        System.out.println(); //SAlto de línea

        //Ordenar el array
        Arrays.sort(numeros);

        //imprimir el array con una sola instruccion
        System.out.println("Array ordenado: " + Arrays.toString(numeros));

        scanner.close();
    }
}
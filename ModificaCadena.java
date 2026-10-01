import java.util.Scanner;

public class ModificaCadena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // El usuario introduce una cadena, la leemos e imprimimos
        System.out.println("Introduce una cadena: ");
        String linea = scanner.nextLine();
        System.out.println("Cadena introducida: " + linea);

        boolean contieneNueve = linea.contains("nueve");
        System.out.println("¿La cadena contiene la palabra nueve? " + contieneNueve);

        int comparacion = linea.compareTo("nueve");
        if (comparacion < 0) {
            System.out.println("La cadena introducida es alfabéticamente MENOR que nueve.");
        } else if (comparacion > 0) {
            System.out.println("La cadena introducida es alfabéticamente MAYOR que nueve.");
        } else {
            System.out.println("La cadena introducida es alfabéticamente IGUAL que nueve.");
        }

        // Reemplazar la palabra nueve por el número 9
        String lineaModificada = linea.replace("nueve", "9");
        System.out.println("Cadena modificada: " + lineaModificada);

        // Cambiar la primera y última aparición de '0' por 'cero'
        int primeraAparicion = lineaModificada.indexOf('0');
        int ultimaAparicion = lineaModificada.lastIndexOf('0');

        if (primeraAparicion != -1) {
            if (primeraAparicion == ultimaAparicion) {
                // Solo hay un 0
                lineaModificada = lineaModificada.substring(0, primeraAparicion)
                        + "cero"
                        + lineaModificada.substring(primeraAparicion + 1);
            } else {
                // Hay varios 0: cambia la primera y la última
                lineaModificada = lineaModificada.substring(0, primeraAparicion)
                        + "cero"
                        + lineaModificada.substring(primeraAparicion + 1, ultimaAparicion)
                        + "cero"
                        + lineaModificada.substring(ultimaAparicion + 1);
            }
        }

        System.out.println("Cadena modificada tras cambiar '0' por 'cero': " + lineaModificada);

        scanner.close();
    }
}








import java.util.Scanner;

public class ProcesaClasspath2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //1.leer linea del teclado con formato classpath y dividir componentes
        System.out.println("Introduce la ruta CLASSPATH: ");
        String classpath = scanner.nextLine();

        String [] componentes = classpath.split(":");

        //2. Array bidimensional==> filas = numero de componenetes
        String[] [] matrizClasspath = new String[componentes.length][];

        //3. Procesar cada componente y dividirlo en subcomponentes
        for (int i=0; i<componentes.length; i++){
            String ruta = componentes[i];

            if(ruta.startsWith("/")){
                ruta = ruta.substring(1);

            }

            matrizClasspath[i] = ruta.split("/");
        }

        System.out.println("\nComponentes procesados: ");

        //4. recorrer el array bidimensional e imprimir separados por '-'
        for (int i=0; i<matrizClasspath.length; i++){
            for (int j=0;j<matrizClasspath[i].length; j++){
                System.out.print(matrizClasspath[i][j]);
                
                //añade el guion '-' si no es el último subcomponente de la fila
                if (j<matrizClasspath[i].length-1){
                    System.out.print("-");
                }
            }
            System.out.println();
        }

        scanner.close();
            

    }
}
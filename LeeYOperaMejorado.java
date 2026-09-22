public class LeeYOperaMejorado{
    public static void main(String[] args)
    if(args.length==0){
        System.out.println("Error: Debes proporcionar 3 argumentos (operador num1 num2).");
        System.out.println("Ejemplo: java LeeYOpera + 8 2");
    }

    //Declaramos las variables
    int num1 = Integer.parseInt(args[1]);
    int num2 = Integer.parseInt(args[2]);
    String operacion = args[0];

    switch(operacion){
        case "+":
            System.out.printl("Resultado de la suma: " + (num1+num2));
            break;
        case "-":
            System.out.printl("Resultado de la resta: " + (num1-num2));
            break;
        case "x":
            System.out.printl("Resultado de la multiplicación: " + (num1*num2));
            break;
        case "/":
            if(num!=0){
            System.out.println("División entera: " + (num1/num2));
            System.out.println("División real: " + ((float)num1/num2));
            break;}else{
                System.out.println("Error: No se puede dividir entre cero.");
            }
        case "^":
            double potencia = Math.pow(num1, num2);
            System.out.print("Resultado de la potencia: " + potencia);
            break;
        default:
            System.out.println("Operador inválido. Utiliza +, -, x, /.");
            break;
    
    }

}
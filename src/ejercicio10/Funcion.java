package ejercicio10;
import java.util.Scanner;

public class Funcion {



    public static double operar(double num1, double num2, String operador) {
        switch (operador) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return num1 / num2;
            case "%":
                return num1 % num2;
            case "**":
                return Math.pow(num1, num2);
            default:
                System.out.println("Operador inválido.");
                return Double.NaN; 
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();
        System.out.print("Ingrese el operador (+, -, *, /, %, **): ");
        String operador = scanner.next();


        double resultado = operar(num1, num2, operador);


        System.out.println("El resultado de la operación es: " + resultado);

        scanner.close();
    }
}
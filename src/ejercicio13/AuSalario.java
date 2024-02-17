package ejercicio13;
import java.util.Scanner;


public class AuSalario {

    public static double Aumento_Salario(double salario_Actual) {
        if (salario_Actual <= 800000) {
            return salario_Actual * 0.10;
        } else if (salario_Actual <= 1200000) {
            return salario_Actual * 0.08;
        } else {
            return salario_Actual * 0.05;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese el salario actual del empleado: ");
        double salario_Actual = scanner.nextDouble();


        double aumento_Salario = Aumento_Salario(salario_Actual);


        double nuevo_Salario = salario_Actual + aumento_Salario;


        System.out.println("El aumento de salario es: $" + aumento_Salario);
        System.out.println("El nuevo salario del empleado es: $" + nuevo_Salario);

        scanner.close();
    }
}
package ejercicio7;
import java.util.Scanner;

public class Distancia {

    public static double calcular_Distancia(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(y2 - y1, 2) + Math.pow(x2 - x1, 2));
    }

 
    public static double calcular_Pendiente(double x1, double y1, double x2, double y2) {
        return (y2 - y1) / (x2 - x1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Ingrese las coordenadas del primer punto:");
        System.out.print("x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("y1: ");
        double y1 = scanner.nextDouble();

        System.out.println("Ingrese las coordenadas del segundo punto:");
        System.out.print("x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("y2: ");
        double y2 = scanner.nextDouble();


        double distancia = calcular_Distancia(x1, y1, x2, y2);


        double pendiente = calcular_Pendiente(x1, y1, x2, y2);


        System.out.println("La distancia entre los dos puntos es: " + distancia);
        System.out.println("La pendiente de la recta que une los dos puntos es: " + pendiente);

        scanner.close();
    }
}

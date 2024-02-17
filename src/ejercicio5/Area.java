package ejercicio5;
import java.util.Scanner;

public class Area {


    public static double Area_Circulo(double radio) {
        return Math.PI * radio * radio;
    }
    

    public static double calcularAreaCoronaCircular(double radioGrande, double radioPequeno) {
        double areaCirculoGrande = Area_Circulo(radioGrande);
        double areaCirculoPequeno = Area_Circulo(radioPequeno);
        return areaCirculoGrande - areaCirculoPequeno;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Ingrese el radio grande (R): ");
        double radioGrande = scanner.nextDouble();
        System.out.print("Ingrese el radio pequeño (r): ");
        double radioPequeno = scanner.nextDouble();
        

        double areaCoronaCircular = calcularAreaCoronaCircular(radioGrande, radioPequeno);
        

        System.out.println("El área de la corona circular es: " + areaCoronaCircular);
        
        scanner.close();
    }
}

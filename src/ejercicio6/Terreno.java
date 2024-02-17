package ejercicio6;
import java.util.Scanner;

public class Terreno {


    public static double Area_Rectangulo(double base, double altura) {
        return base * altura;
    }
    

    public static double cal_Hipotenusa(double cateto1, double cateto2) {
        return Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);
    }
    

    public static double Area_Triangulo(double base, double altura) {
        return base * altura / 2.0;
    }
    

    public static double calcularPerimetroTerreno(double ladoA, double ladoB, double ladoC) {
        double hipotenusa = cal_Hipotenusa(ladoA, ladoB);
        return ladoA + ladoB + ladoC + hipotenusa;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Ingrese el lado A del terreno: ");
        double ladoA = scanner.nextDouble();
        System.out.print("Ingrese el lado B del terreno: ");
        double ladoB = scanner.nextDouble();
        System.out.print("Ingrese el lado C del terreno: ");
        double ladoC = scanner.nextDouble();
        

        double perimetro = calcularPerimetroTerreno(ladoA, ladoB, ladoC);
        

        double semiperimetro = perimetro / 2.0;
        double area = Math.sqrt(semiperimetro * (semiperimetro - ladoA) * (semiperimetro - ladoB) * (semiperimetro - ladoC));
        

        System.out.println("El área del terreno es: " + area);
        System.out.println("El perímetro del terreno es: " + perimetro);
        
        scanner.close();
    }
}

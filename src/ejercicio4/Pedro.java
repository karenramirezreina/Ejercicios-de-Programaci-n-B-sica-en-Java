package ejercicio4;
import java.util.Scanner;

public class Pedro {

    public static double Gasto_Arriendo(double sueldo) {
        return sueldo * 0.4;
    }
    

    public static double Gasto_Comida(double sueldo) {
        return sueldo * 0.15;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
 
        System.out.print("Ingrese el sueldo de Pedro: ");
        double sueldo = scanner.nextDouble();
        

        double gastoArriendo = Gasto_Arriendo(sueldo);
        

        double gastoComida = Gasto_Comida(sueldo);

        double dineroRestante = sueldo - gastoArriendo - gastoComida;
        

        System.out.println("Gasto en arriendo: $" + gastoArriendo);
        System.out.println("Gasto en comida: $" + gastoComida);
        System.out.println("Dinero restante después del arriendo y la comida: $" + dineroRestante);
        
        scanner.close();
    }
}

package ejercicio12;
import java.util.Scanner;

public class NomDía {

    public static String Dia_Siguiente(String dia) {
        switch (dia.toLowerCase()) {
            case "lunes":
                return "Martes";
            case "martes":
                return "Miércoles";
            case "miércoles":
                return "Jueves";
            case "jueves":
                return "Viernes";
            case "viernes":
                return "Sábado";
            case "sábado":
                return "Domingo";
            case "domingo":
                return "Lunes";
            default:
                return "Día inválido";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese el nombre de un día: ");
        String dia = scanner.nextLine();

        String diaSiguiente = Dia_Siguiente(dia);

        System.out.println("El día siguiente a " + dia + " es " + diaSiguiente);

        scanner.close();
    }
}

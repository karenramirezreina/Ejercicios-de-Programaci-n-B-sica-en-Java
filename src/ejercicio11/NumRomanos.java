package ejercicio11;
import java.util.Scanner;

public class NumRomanos {


    public static int obtener_Decenas(int numero) {
        return numero / 10;
    }

    public static int obtener_Unidades(int numero) {
        return numero % 10;
    }

    public static String UnidadARomano(int numero) {
        switch (numero) {
            case 0:
                return "";
            case 1:
                return "I";
            case 2:
                return "II";
            case 3:
                return "III";
            case 4:
                return "IV";
            case 5:
                return "V";
            case 6:
                return "VI";
            case 7:
                return "VII";
            case 8:
                return "VIII";
            case 9:
                return "IX";
            default:
                return "";
        }
    }

  
    public static String DecenasARomano(int numero) {
        switch (numero) {
            case 1:
                return "X";
            case 2:
                return "XX";
            case 3:
                return "XXX";
            case 4:
                return "XL";
            case 5:
                return "L";
            case 6:
                return "LX";
            case 7:
                return "LXX";
            case 8:
                return "LXXX";
            case 9:
                return "XC";
            default:
                return "";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese un número entero entre 1 y 99: ");
        int numero = scanner.nextInt();

        if (numero >= 1 && numero <= 99) {
            int decenas = obtener_Decenas(numero);
            int unidades = obtener_Unidades(numero);


            String romanoDecenas = DecenasARomano(decenas);
            String romanoUnidades = UnidadARomano(unidades);

            System.out.println("El número en números romanos es: " + romanoDecenas + romanoUnidades);
        } else {
            System.out.println("Error: El número debe ser un entero positivo entre 1 y 99.");
        }

        scanner.close();
    }
}

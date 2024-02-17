package ejercicio8;
import java.util.Scanner;

public class Universidad {



    public static int Numero_Salones(int numero_Estudiantes, int capacidad_Salon) {
        return (int) Math.ceil((double) numero_Estudiantes / capacidad_Salon);
    }


    public static int Numero_Pisos(int numeroSalones, int salonesPorPiso) {
        return (int) Math.ceil((double) numeroSalones / salonesPorPiso);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

  
        System.out.print("Ingrese el número de estudiantes en la universidad: ");
        int numero_Estudiantes = scanner.nextInt();
        System.out.print("Ingrese la capacidad de un salón: ");
        int capacidad_Salon = scanner.nextInt();
        System.out.print("Ingrese el número de salones por piso del nuevo edificio: ");
        int salonesPorPiso = scanner.nextInt();

        int numeroSalones = Numero_Salones(numero_Estudiantes, capacidad_Salon);
        int numeroPisos = Numero_Pisos(numeroSalones, salonesPorPiso);

        System.out.println("El nuevo edificio tendrá " + numeroSalones + " salones.");
        System.out.println("El nuevo edificio tendrá " + numeroPisos + " pisos.");

        scanner.close();
    }
}
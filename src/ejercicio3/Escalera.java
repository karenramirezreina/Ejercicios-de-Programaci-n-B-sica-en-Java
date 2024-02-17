package ejercicio3;

public class Escalera {


    public static double calcular_Longitud(double altura, double angulo) {

        double angulo_Radianes = Math.toRadians(angulo);
        

        double longitud = altura / Math.tan(angulo_Radianes);
        
        return longitud;
    }

    public static void main(String[] args) {

        double altura = 5.0;
        

        double angulo = 30.0;
        

        double longitud = calcular_Longitud(altura, angulo);
        

        System.out.println("La longitud de la escalera es: " + longitud + " metros.");
    }
}
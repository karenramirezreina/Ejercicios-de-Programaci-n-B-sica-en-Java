package ejercicio1;

public class Funcion {

   
    public static double calcular_Valor(double x, double y) {
        return x*x + 2*x*y + y*y;
    }

    public static void main(String[] args) {

        double x = 3.0;
        double y = 2.0;

      
        double resultado = calcular_Valor(x, y);

      
        System.out.println("El valor de la función para x = " + x + " y y = " + y + " es: " + resultado);
    }
}


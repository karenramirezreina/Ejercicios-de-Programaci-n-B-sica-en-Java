package ejercicio2;

public class Paseo {

    public static int calcular_Buses(int sillasPorBus, int estudiantes_Gordos, int estudiantes_Flacos) {

        int total_Estudiantes = estudiantes_Gordos * 2 + estudiantes_Flacos;
        
      
        int buses_Necesarios = total_Estudiantes / sillasPorBus;
        if (total_Estudiantes % sillasPorBus != 0) {
            buses_Necesarios++; 
        }
        
        return buses_Necesarios;
    }

    public static void main(String[] args) {
   
        int sillasPorBus = 50; 
        int estudiantesGordos = 10; 
        int estudiantesFlacos = 30; 
        
      
        int busesNecesarios = calcular_Buses(sillasPorBus, estudiantesGordos, estudiantesFlacos);
        
  
        System.out.println("Se necesitan alquilar " + busesNecesarios + " buses para llevar a todos los estudiantes al paseo.");
    }
}

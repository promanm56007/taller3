
import java.util.Scanner;
import java.lang.Math;


public class Ejercicio1

{
    /*Escriba un programa en Java que lea un conjunto de n números double, los almacene en un arreglo o
      lista, y luego calcule la desviación estándar de esos números, representada por la siguiente expresión
      matemática: */

          public static double [] agregar_elementos()
          {
              
              
              Scanner teclado = new Scanner(System.in);
              int numero_de_elementos;
              System.out.println("Ingrese el Número de Elementos " );
              numero_de_elementos = teclado.nextInt();
              double [] arreglo;
              arreglo = new double [numero_de_elementos];
                          
              
              
                for(int i = 0; i < numero_de_elementos; i++)
                   {
                       System.out.println("Ingrese el Elemento de la Posición " + i);
                       arreglo[i] = teclado.nextDouble();
                    }   
                    
                    return arreglo;
          }   
     
          
          public static double promedio(double [] arreglo )
           {
            
            double promedio = 0.0;
            double sumatoria = 0.0;
            
            for(int i = 0; i < arreglo.length; i++)
                   {
                       sumatoria = arreglo[i]+ sumatoria;
                    }   
                    
                 promedio = sumatoria / arreglo.length;   
                 return promedio;
 }
          
          public static double desviacion (double [] arreglo )
           {
            
            double promedio = 0.0;
            double sumatoria = 0.0;
            promedio = promedio(arreglo);
            double desviacion;
            
            for(int i = 0; i < arreglo.length; i++)
                   {
                       sumatoria = (Math.pow((arreglo[i] - promedio),2));
                    }   
                    
                 desviacion = Math.sqrt(sumatoria / arreglo.length);   
                 return desviacion;
 }
        
        
      
        public static void main (String [] args)
             {
               
                 
               double []arreglo;
               arreglo = agregar_elementos();
               double promedio = promedio(arreglo);
               double desviacion = desviacion(arreglo);
               
               System.out.println("La Desviación Es  " + desviacion);
             
             }
    
}   
     
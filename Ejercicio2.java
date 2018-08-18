import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio2 
        //

{
    


    //funcion para crer el arreglo a
    public static double [] crear_arreglo_a()
          {
              
      
              Scanner teclado = new Scanner(System.in);
             
              int numero_de_elementos;
              System.out.println("Ingrese el Número de Elementos del Arreglo A"  );
              numero_de_elementos = teclado.nextInt();
              
              double [] arreglo_a;
              arreglo_a = new double [numero_de_elementos];
                          
              
              
                for(int i = 0; i < numero_de_elementos; i++)
                   {
                       System.out.println("Ingrese el Elemento de la Posición [ " + i +"] del Arreglo A");
                       arreglo_a[i] = teclado.nextDouble();
                    }   
                    
                    return arreglo_a;
          }   
     
          
          public static double [] crear_arreglo_b()
          {
              
              
              Scanner teclado = new Scanner(System.in);
              
              int numero_de_elementos;
              System.out.println("Ingrese el Número de Elementos del Arreglo B" );
              numero_de_elementos = teclado.nextInt();
              
              //se crea el arreglo b
              double [] arreglo_b;
              arreglo_b = new double [numero_de_elementos];
                          
              
              //se ingresan los daros al arreglo b
                for(int i = 0; i < numero_de_elementos; i++)
                   {
                       System.out.println("Ingrese el Elemento de la Posición [" + i +"] del Arreglo B");
                       arreglo_b[i] = teclado.nextDouble();
                    }   
                    // se devuelve el arreglo b
                    return arreglo_b;
          }      
        
//funcion que toma como parametros dos arreglo y crea un tercero con los numero NO repetidos 
          public static double [] duplicados(double arreglo_a[], double arreglo_b[])
            {
            int [] posiciones = new int [arreglo_a.length + arreglo_b.length]; //se le da un tamaño grande
            int [] posiciones_b = new int [arreglo_a.length + arreglo_b.length]; //se le da un tamaño grande
                               double aux ;
                int contador= 0 ;
                int contador_1 = 0;
                double [] arreglo_c;
                
               if (arreglo_a.length < arreglo_b.length)  
                {   
                Arrays.sort(arreglo_a);//ordenar de menor a mayor el arreglo
                 for (int i = 0; i < arreglo_b.length; i++)
                    {
        
                         aux = arreglo_b[i];
                   int index_de_a = Arrays.binarySearch(arreglo_a, aux);
                   int posicion_actual = i ;     
                   if (index_de_a < 0)
                        {
                         posiciones_b [contador] = posicion_actual ;
                         contador ++;
                        }
                   
                        
                    }
                   contador_1= contador;
                   Arrays.sort(arreglo_b);
                   for (int z = 0; z < arreglo_a.length; z++)
                    {
        
                         aux = arreglo_a[z];
                   int index = Arrays.binarySearch(arreglo_b, aux);
                  
                   int posicion_actual_arreglo_a = z ;     
                           
                   if (index < 0)
                        {
                         posiciones [contador] = posicion_actual_arreglo_a ;
                         contador ++;
                        }
                        
                    }
                    arreglo_c = new double [contador];
                     
                    
                    for (int j = 0; j < contador; j++)
                    {
                        
                        if (j<contador_1){
                        arreglo_c [j] = arreglo_b[posiciones_b [j]]; 
                        }else{
                        arreglo_c [j] = arreglo_a[posiciones [j]]; 
                        }
                        
                    }
                   
                }
                
                 else{
                    
                Arrays.sort(arreglo_b);
                 for (int i = 0; i < arreglo_a.length; i++)
                    {
        
                         aux = arreglo_a[i];
                   int index_de_b = Arrays.binarySearch(arreglo_b, aux);
                   int posicion_actual = i ;     
                   if (index_de_b < 0)
                        {
                         posiciones[contador] = posicion_actual ;
                         contador ++;
                        }
                   
                        
                    }
                   contador_1= contador;
                   Arrays.sort(arreglo_a);
                   for (int z = 0; z < arreglo_b.length; z++)
                    {
        
                         aux = arreglo_b[z];
                   int index = Arrays.binarySearch(arreglo_a, aux);
                  
                   int posicion_actual_arreglo_b= z ;     
                           
                   if (index < 0)
                        {
                         posiciones_b [contador] = posicion_actual_arreglo_b ;
                         contador ++;
                        }
                        
                    }
                    arreglo_c = new double [contador];
                     
                    
                    for (int j = 0; j < contador; j++)
                    {
                        
                        if (j<contador_1){
                        arreglo_c [j] = arreglo_a[posiciones [j]]; 
                        }else{
                        arreglo_c [j] = arreglo_b[posiciones_b [j]]; 
                        }
                        
                    }
                  
                }
           Arrays.sort(arreglo_c);     
                return arreglo_c;
                
            }   
      
        public static void main (String [] args)
             {
               
                 
               double []arreglo_a;
               arreglo_a = crear_arreglo_a();
               double []arreglo_b;
               arreglo_b = crear_arreglo_b();
               double []arreglo_c;
               arreglo_c = duplicados(arreglo_a,arreglo_b);
               System.out.println("Los Numeros Sin Repetir Son  ");
               
               for (int j = 0; j < arreglo_c.length ; j++)
                    {
                        
                     System.out.println(arreglo_c[j]);
                        
                        
                        
                    }
               
             }
    
}       
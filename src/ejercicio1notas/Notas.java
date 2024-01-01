
package ejercicio1notas;

import java.util.Scanner;

public class Notas {
    
    private String nombre = "";
    private final double[] notas = new double [3];    
    private double notaProm;     
   
    public void ingresoNotas () {
        
        boolean pruebaN = false;
        String notaprueba;
        double pruebaNeg = 1;    
         
        Scanner entrada = new Scanner(System.in); 
         
         System.out.println("Programa para obtenener el promedio de notas de un estudiante\n");
                
         System.out.println("Ingrese el nombre del estudiante:");         
         nombre = entrada.nextLine();
         
         while (pruebaN == false){                                          
             for (int i=0; i<nombre.length() ;i++){                                                        
                 if (Character.isLetter(nombre.charAt(i))){                                                  
                     pruebaN = true;                                                  
                     break;                                              
                 }                                             
                 else {                                                                                              
                     pruebaN = false;                                                                  
                 }                                                                     
             }                                           
             if (pruebaN == false){                                           
                 System.out.println("Error, ingresó un valor numérico\nPor favor ingrese el nombre del estudiante:\n");                        
                 nombre = entrada.nextLine();                                   
             } 
         }
  
         for(int cont = 0; cont < notas.length; cont++){
             switch (cont){
                 case 0:                      
                     System.out.println("Ingrese la nota de trabajos (T) del ciclo en porcentaje:");                                       
                     notaprueba = entrada.nextLine();  
                     
                     while (pruebaN == true || pruebaNeg <= 0){                    
                         for (int i=0; i<notaprueba.length() ;i++){                                
                             if (Character.isLetter(notaprueba.charAt(i))){                   
                                 pruebaN = true;                   
                                 break;                 
                             }                
                             else {                                                              
                                 pruebaN = false;                                     
                             }                                            
                         }                  
                         if (pruebaN==false){              
                             pruebaNeg = Double.parseDouble(notaprueba);            
                         }        
                         else{                
                             System.out.println("Error, no ingresó un valor numérico\nPor favor ingrese la nota de trabajos (T) del ciclo en porcentaje:\n");                              
                             notaprueba = entrada.nextLine();                  
                         }           
                         if (pruebaNeg <= 0 && pruebaN == false){                           
                             System.out.println("Error, ingresó un valor negativo o cero\nPor favor ingrese la nota de trabajos (T) del ciclo en porcentaje:\n");                      
                             notaprueba= entrada.nextLine();                                                       
                         }                         
                         if (pruebaNeg > 0 && pruebaN == false){             
                             notas[0] = Double.parseDouble(notaprueba);           
                         }           
                     }   
                     pruebaN = true;
                     pruebaNeg = 1;                     
                     break;                     
                 case 1: 
                     System.out.println("Ingrese la nota de medio (M) ciclo del curso en porcentaje:");
                     notaprueba = entrada.nextLine(); 
                     
                     while (pruebaN == true || pruebaNeg <= 0){                    
                         for (int i=0; i<notaprueba.length() ;i++){                                
                             if (Character.isLetter(notaprueba.charAt(i))){                   
                                 pruebaN = true;                   
                                 break;                 
                             }                
                             else {                                                              
                                 pruebaN = false;                                     
                             }                                            
                         }                  
                         if (pruebaN==false){              
                             pruebaNeg = Double.parseDouble(notaprueba);            
                         }        
                         else{                
                             System.out.println("Error, no ingresó un valor numérico\nPor favor ingrese la nota de medio (M) ciclo en porcentaje:\n");                              
                             notaprueba = entrada.nextLine();                  
                         }           
                         if (pruebaNeg <= 0 && pruebaN == false){                           
                             System.out.println("Error, ingresó un valor negativo o cero\nPor favor ingrese la nota de medio (M) ciclo en porcentaje:\n");                      
                             notaprueba= entrada.nextLine();                                                       
                         }                         
                         if (pruebaNeg > 0 && pruebaN == false){             
                             notas[1] = Double.parseDouble(notaprueba);           
                         }           
                     }   
                     pruebaN = true;
                     pruebaNeg = 1;                     
                     break;                                          
                 case 2: 
                     System.out.println("Ingrese la nota de fin (F) de ciclo en porcentaje:");
                     notaprueba = entrada.nextLine(); 
                     
                     while (pruebaN == true || pruebaNeg <= 0){                    
                         for (int i=0; i<notaprueba.length() ;i++){                                
                             if (Character.isLetter(notaprueba.charAt(i))){                   
                                 pruebaN = true;                   
                                 break;                 
                             }                
                             else {                                                              
                                 pruebaN = false;                                     
                             }                                            
                         }                  
                         if (pruebaN==false){              
                             pruebaNeg = Double.parseDouble(notaprueba);            
                         }        
                         else{                
                             System.out.println("Error, no ingresó un valor numérico\nPor favor ingrese la nota de fin (F) de ciclo en porcentaje:\n");                              
                             notaprueba = entrada.nextLine();                  
                         }           
                         if (pruebaNeg <= 0 && pruebaN == false){                           
                             System.out.println("Error, ingresó un valor negativo o cero\nPor favor ingrese la nota de fin (F) de ciclo en porcentaje:\n");                      
                             notaprueba= entrada.nextLine();                                                       
                         }                         
                         if (pruebaNeg > 0 && pruebaN == false){             
                             notas[2] = Double.parseDouble(notaprueba);           
                         }           
                     }   
                     pruebaN = true;
                     pruebaNeg = 1;                     
                     break;                
             }      
        }    
    }
    
    public double calculoNotaProm () {
        notaProm = 0;
        for(int cont = 0; cont < notas.length; cont++){
            notaProm = notas[cont] + notaProm;          
        }    
        
        notaProm = notaProm/notas.length;

        return notaProm;
    }
    
    public void catalogoNotas () {
        if (20.0 < calculoNotaProm()) {
            System.out.printf("El promedio de %s es de %.1f y se catalogaría como: Excelente\n", nombre, calculoNotaProm());
        }
        if (16.0 <= calculoNotaProm() && calculoNotaProm() <= 20.0) {
            System.out.printf("El promedio de %s es de %.1f y se catalogaría como: Bueno\n", nombre, calculoNotaProm ());
        }
        if (11.0 <= calculoNotaProm() && calculoNotaProm() <= 15.0) {
            System.out.printf("El promedio de %s es de %.1f y se catalogaría como: Regular\n", nombre, calculoNotaProm ());
        }
        if (6.0 <= calculoNotaProm() && calculoNotaProm() <= 10.0) {
            System.out.printf("El promedio de %s es de %.1f y se catalogaría como: Normal\n", nombre, calculoNotaProm ());
        }
        if (0.0 <= calculoNotaProm() && calculoNotaProm() <= 5.0) {
            System.out.printf("El promedio de %s es de %.1f y se catalogaría como: Bajo\n", nombre, calculoNotaProm ());
        }
    }
}

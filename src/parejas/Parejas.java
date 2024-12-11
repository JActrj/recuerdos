package parejas;

import java.util.Scanner;


public class Parejas {

   
      public static void main(String[] args) {
          Scanner scanner= new Scanner(System.in);
         
          int numeroderecuerdos;
          
         
          
          System.out.println("coloque la cantidad de recuerdos que quiere Elena: ");
           numeroderecuerdos = scanner.nextInt();scanner.nextLine();
          
          String[] Elena= new String[numeroderecuerdos];
          
          System.out.println("coloque los recuerdos con su pareja ");
          for(int i=0; i<numeroderecuerdos; i++){
              System.out.println((i+1) +"coloque el recuerdo: ");
              Elena[i] = scanner.nextLine();
          }
          System.out.println("los recuerdos son: ");
          for(int i=0; i<numeroderecuerdos; i++){
              System.out.println(Elena[i]);
          }
          
          
        
          System.out.println("coloque la cantidad de recuerdos que quiere Francisco: ");
           numeroderecuerdos = scanner.nextInt();scanner.nextLine();
          
          String[] Francisco= new String[numeroderecuerdos];
          
          System.out.println("coloque los recuerdos con su pareja ");
          for(int i=0; i<numeroderecuerdos; i++){
              System.out.println((i+1) +"coloque el recuerdo: ");
              Francisco[i] = scanner.nextLine();
          }
          System.out.println("los recuerdos son: ");
          for(int i=0; i<numeroderecuerdos; i++){
              System.out.println(Francisco[i]);
          }
           String[] recuerdosCombinados = new String[numeroderecuerdos * 2];

        // Llenar el arreglo de recuerdos combinados
        for (int i = 0; i<numeroderecuerdos; i++) {
            recuerdosCombinados[i] = Elena[i]; // Copiar recuerdos del primer participante
            recuerdosCombinados[numeroderecuerdos + i] = Francisco[i]; // Copiar recuerdos del segundo participante
        }

        // Mostrar los recuerdos combinados
        System.out.println("\nRecuerdos combinados de la pareja:");
        for (int i = 0; i < recuerdosCombinados.length; i++) {
            System.out.println("Recuerdo " + (i + 1) + ": " + recuerdosCombinados[i]);
        }
          
          }
               
      }

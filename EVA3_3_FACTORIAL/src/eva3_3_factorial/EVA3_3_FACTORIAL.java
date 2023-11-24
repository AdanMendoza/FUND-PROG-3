/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_3_factorial;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA3_3_FACTORIAL {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      //Llamada a función:
      System.out.println("El factorial de 5 = " + calcularFactorial(5));
      System.out.println("5 elevado a la 3 = " + calcularPotencia(5, 3));
      
   }
   
   public static int calcularFactorial(int num){
   //factorial de 5: 1x2x3x4x5 = 120
   //usar ciclos
   //regresar el valor calculado
      int resu = 1;
      for (int i = 1; i <= num; i++) {
         resu *= i; //resu = resu * i
      }
      return resu;
   }
   
   //crear una función que calcule la potencia de un número entero.
   public static int calcularPotencia(int base, int exp){
      int resu = 1;
   
      for (int i = 0; i < exp; i++) {
         resu *= base; //rsu = rsu * base
      }
      return resu;
   }
   
}

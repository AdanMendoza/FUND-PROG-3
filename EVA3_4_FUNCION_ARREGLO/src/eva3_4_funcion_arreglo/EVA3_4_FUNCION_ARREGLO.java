/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_4_funcion_arreglo;

/**
 *
 * @author invitado
 */
public class EVA3_4_FUNCION_ARREGLO {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      int[] arreglo = crearArreglo(10, 100);
      for(int valor: arreglo)
         System.out.println("[" + valor + "]");
   }
   
   public static int[] crearArreglo(int tama, int rango){
   int[] arreglo = new int[tama];
      for (int i = 0; i < arreglo.length; i++) {
         arreglo[i] = (int)(Math.random() * rango);
      }
      return arreglo;
   }
}

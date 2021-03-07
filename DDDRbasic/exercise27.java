//27) Crear una aplicación que nos permite insertar números hasta que insertemos un -1. Calcular el numero de números introducidos.

package practiceNVIM;

import java.util.Scanner;
public class exercise27{
  public static void main(String[] args) {
  Scanner reader = new Scanner(System.in);

  //INPUT
  int n;


  do {
  System.out.println("Ingrese un numero");
  n = reader.nextInt();
  	
  } while (n != -1);
  }
} 

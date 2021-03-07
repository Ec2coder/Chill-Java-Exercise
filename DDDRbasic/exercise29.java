//29) Pedir al usuario que nos escriba frases de forma infinita hasta que insertemos una cadena vacia. Mostrar la cadena resultante

package praticeNVIM;

import java.util.Scanner;

public class exercise29{
  public static void main(String[] args) {
      Scanner reader = new Scanner(System.in);

      //INPUT
      String palabras;

      System.out.println("Ingrese una cadena de caracteres");
      palabras = reader.nextLine();

      while(palabras != ""){
      System.out.println("Ingrese una cadena de caracteres");
      palabras = reader.nextLine();

      if(palabras.isEmpty()){
	    break;
      }
      }

  }
} 

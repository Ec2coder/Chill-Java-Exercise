//34) Dada una frase, separarlo en palabras.

package DDDRbasic;

import java.util.Scanner;

public class exercise34{
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.println("Ingrese una frase");
    String srt = reader.nextLine();

    //el split lo que hace es es eliminar el caracter que le pasamos como parametro al metodo split, si le pasamos. 
    String palabras[] = srt.split(" ");

    for (int i = 0; i < palabras.length; i++) {
      System.out.print(palabras[i]);
    }
  }
} 

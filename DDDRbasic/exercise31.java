//31) Mostrar la longitud de una cadena.

package practiceNVIM;

public class exercise31{
  public static void main (String[] args) {
  	
    int acum = 0;
    String cadena = "Hola como estas";

    for (int i = 1; i <= cadena.length(); i++) {
    	acum++;
    }
    System.out.println(cadena);
    System.out.println(acum);
  }
} 

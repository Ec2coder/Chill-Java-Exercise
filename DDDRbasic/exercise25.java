//25) Crea una aplicación llamada CalculadoraPolacaInversaApp, nos pedirá 2 operandos (int) y un signo aritmético (String), según este último se realizara la operación correspondiente. Al final mostrara el resultado en un cuadro de dialogo.

package practiceNVIM;

import java.util.Scanner;
public class exercise25{
  public static void main(String[] args) {
  	//CalculadoraPolacaInversaApp
	Scanner reader = new Scanner(System.in);
	int a,b;
	System.out.println("Ingrese el primer numero");
	  a = reader.nextInt();

	  System.out.println("Ingrese el segundo numero");
	  b = reader.nextInt();

	  System.out.println("Que operacion matematima decea hacer");
	  System.out.println("+");
	  System.out.println("-");
	  System.out.println("*");
	  System.out.println("/");
	  System.out.println("^");
	  System.out.println("%");
	  String r = reader.next();
	  
	  reader.nextLine();

	 System.out.println();

	  if ("+".equals(r)) {
	  	System.out.println("El resulado es: "+(a+b));
	  }
	  else if ("-".equals(r)) {
	  	System.out.println("El resulado es: "+(a-b));
	  }

	  else if ("*".equals(r)) {
	  	System.out.println("El resulado es: "+(a*b));
	  }
	  else if ("/".equals(r)) {
	  	System.out.println("El resulado es: "+(a/b));
	  }
	  else if ("^".equals(r)) {
	  	System.out.println("El resulado es: "+(a^b));
	  }
	  else if ("%".equals(r)) {
	  	System.out.println("El resulado es: "+(a%b));
	  }
  }
} 

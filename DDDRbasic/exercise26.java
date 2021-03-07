//26 Realizar la suma del 1 al numero que indiquemos, este debe ser mayor que 1.

package practiceNVIM;

import java.util.Scanner;

public class exercise26{
  public static void main (String[] args) {
	 Scanner reader = new Scanner(System.in);

	 //IMPUT
	 int n;
	 int acum = 0;
	 System.out.println("Ingrese un numero");
	 n = reader.nextInt();

	 for (int i = 1; i <= n; i++) {
		  System.out.println(i);
		  acum = acum + i;
	 }
	 System.out.println("La suma de los numeros desde el 1 hasta n es:"+acum);

  }
} 

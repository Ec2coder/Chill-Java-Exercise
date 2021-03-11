//32) Pedir dos palabras por teclado, indicar si son iguales.

package practiceNVIM;

import java.util.Scanner;

public class exercise32{
  public static void main (String[] args) {
  	Scanner reader = new Scanner(System.in);
	String p1;
	String p2;
	int acum = 0;

	System.out.println("Ingrese una palabra");
	p1 = reader.nextLine();
	
	System.out.println();

	System.out.println("Ingrese otra palabra");
	p2 = reader.nextLine();

	for(int i = 0; i <= p1.length(); i++){
	  if(p1.charAt(i) == p2.charAt(i)){
	    System.out.println("Genial el Caracter: "+(i+1)+" de la palabra: "+p1+" es igual al caracter: "+(i+1)+" de la palabra "+p2);
	      acum++;
	  } else{
	    System.out.println("Que mal, el caracter numero : "+(i+1)+" de la palabra "+p1+" es diferentes de la palabra "+p2);
	    System.out.println("Que mal estos caracteres son diferentes por lo tanto las palabras no son iguales");
	    break;
	  }
	  if(acum == p1.length()){
	    System.out.println("Genial estas plabras son iguales");
	    break;
	  }
	}
	reader.close();
  }
} 

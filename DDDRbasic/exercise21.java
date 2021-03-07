/*21) Muestra los números primos entre 1 y 100.
los numeros primos son aquellos que son divisibles entre ellos mismos y 1, si si divisibles con mas numeros son numeros compuestos
*/
package practiceNVIM;

public class exercise21{

  public static void main(String[] args) {
      for (int i = 2; i <= 100; i++) {
	int acum = 0;
	for (int j = 1; j <= 10; j++){
	  if(i%j == 0){
	    acum++;
	  }
   	}
	if(acum <= 2){
	      System.out.println(i);
	}
      } 
}
}

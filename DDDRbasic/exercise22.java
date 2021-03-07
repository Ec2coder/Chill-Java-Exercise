//22) Del siguiente String “La lluvia en Sevilla es una maravilla” cuenta cuantas vocales hay en total (recorre el String con charAt).

package exercise22;

public class exercise22 {

  public static void main(String[] args) {
  	String oracion = "la lluvia en Sevilla es una maravilla";
		  int acum = 0;
	for (int i = 1; i < oracion.length(); i++) {
		  if (oracion.charAt(i) == 'a'|| oracion.charAt(i) == 'e' || oracion.charAt(i) == 'i' || oracion.charAt(i) == 'o' || oracion.charAt(i) == 'u'){
		    acum++;
		  }
	}
	System.out.println("El numero de vocales en la oracion es: "+ acum);
  }
}

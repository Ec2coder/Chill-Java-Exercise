//24) Recorue el String del ejercicio 22 y transforma cada carácter a su código ASCII. Muestralos en linea recta, separados por un espacio entre cada carácter.

package practiceNVIM;

public class exercise24{
  public static void main(String[] args) {
  	String oracion = "La lluvia de Sevilla es la mas bella";

	for (int i = 0;i < oracion.length();i++) {
		//Hacemos el casting para convertir el char a int
		System.out.print((int)oracion.charAt(i)+" ");

	}
  }
}

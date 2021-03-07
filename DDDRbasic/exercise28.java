//28) Eliminar los espacios de una frase pasada por consola por el usuario.

package praticeNVIM;
public class exercise28{
  public static void main (String[] args) {
  	
    String oracion = "La lluvia de Sevilla es la mas Bella";
    System.out.println(oracion);
    System.err.println(" ");
    
    System.out.print(oracion.replace(" ",""));
    System.err.println(" ");
  }
} 

//33) Dada una cadena, extraer la cuarta y quinta letra usando el método substring.

package DDDRbasic;

public class exercise33{
  public static void main(String[] args) {
    String srt = "Programmer";
    //el metodo substring lo que hace es tomar el indice del primer numero que le pasemos y el indice anterior al segundo numero que le pasemos y guarda los caracteres que se cuentran en ese rango.
    System.out.println(srt.substring(4,5)+srt.substring(5,6));
  }
}

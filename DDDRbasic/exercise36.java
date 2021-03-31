//36) Modifica el anterior enum para indicar que es día laborable directamente (usar toString).
package DDDRbasic;

import java.util.*;

public class exercise36{

  public enum weekDays {
    LUNES(true),
    MARTES(true),
    MIERCOLES(true),
    JUEVES(true),
    VIERNES(true),
    SABADO(false),
    DOMINGO(false);

    private boolean laborable;

    private weekDays(boolean laborable){
      this.laborable = laborable;
    }
    @Override
    public String toString(){
      if (laborable) {
	return "El dia " + this.name().toLowerCase() + " es laborable";
      } else{
	return "El dia " + this.name().toLowerCase() + " es no laborable";
      }
    }
  }

  public static void main (String[] args) {
    Scanner reader = new Scanner(System.in);
    String a;
    System.out.println("Introduce a Day of the week");
    a = reader.nextLine();

    weekDays days = weekDays.valueOf(a.toUpperCase());
    System.out.println(days.toString());
  } 
}


//35) Crea un enum con los días de la semana, pide un día de la semana e indica si es laboral o no (en el main). 

package DDDRbasic;

import java.util.*;

public class exercise35{

  public enum weekDays {
    LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO;
  }
  public static void main (String[] args) {
    Scanner reader = new Scanner(System.in);
    String a;
    System.out.println("Introduce a Day of the week");
    a = reader.nextLine();

    weekDays d = weekDays.valueOf(a.toUpperCase());

    switch (d) {
      case LUNES:
      case MARTES:
      case MIERCOLES:
      case JUEVES:
      case VIERNES:
	System.out.println("Es un dia de semena");
	break;

      case SABADO:
      case DOMINGO:
	System.out.println("Es fin de semana");
	break;
    }
  }
} 


package practiceNVIM;

import java.util.Scanner;

public class hackerrank{
  public static void main (String[] args) {
  	Scanner reader = new Scanner(System.in);
	int n;

	n = reader.nextInt();

	if(n%2 != 0){
	  System.out.print("Wierd");
	} 
	else if(n%2 == 0 && n >= 2 && n < 5){
	  System.out.print("Not Weird");

	} else if( n >= 6 && n <= 20 && n%2 == 0){
	  System.out.print("Weird");

	} else if(n > 20 && n%2 == 0){
	  System.out.print("Not Weird");
	}

  }
} 

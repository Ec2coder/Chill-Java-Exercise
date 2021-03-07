//20) Pide un número por teclado e indica si es un número primo o no. Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
//Un buen truco para calcular la raíz cuadrada del numero e ir comprobando que si es divisible desde ese numero hasta 1.
//NOTA: Si se introduce un numero menor o igual que 1, directamente es no primo.
//Adios.
package practiceNVIM;

import java.util.Scanner;

public class exercise20{

public static void main(String args[]){
	Scanner reader = new Scanner(System.in);

	//INPUT
	//numeros primos: son aquellos solo son divisibles entre ellos mismos y el 1, si son divisibles con mas numeros pasan a ser compuestos

	int acum = 0;
	int num;
	
	//PROCESS
      

	System.out.println("Ingrese un numero");
	num = reader.nextInt();

	while(num <= 0){

		System.out.print("Ingrese un numero que sea mayor a 0");
		num = reader.nextInt();
	}

	if(num >= 1){
		System.out.println("Los numeros divisibles son: ");
		for(int i = 1; i <=10; i++){
			if(num%i == 0){
				System.out.print(i + ", ");
				acum++;		
			}
		}
		if(acum == 2){
			System.out.println("El numero es primo");
		}
		else if(acum > 2){
			System.out.println("El numero es compuesto");
		}
	} 
	reader.close();
}

}

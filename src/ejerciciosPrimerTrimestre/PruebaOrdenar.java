package ejerciciosPrimerTrimestre;
/*
 * PruebaOrdenar.class
 * El siguiente programa ordenará de mayor a menor dos números introducidos por teclado
 */

import java.util.Scanner;

public class PruebaOrdenar {
	
	//Así se declaran las variables globales:
	
	public static int num1;
	public static int num2;
	public static int aux;
	
	public static void ordenaVariables(){
		if (num1>=num2){
		}
		else{
		aux=num2;
		num2=num1;
		num1=aux;
		}
	}
	
	public static void main (String args[]) {
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduce el primer numero");
		num1=teclado.nextInt();
		System.out.println("Introduce el segundo numero");
		num2=teclado.nextInt();
		ordenaVariables();
		System.out.println(num1+ " "+ num2);
		
	}
}


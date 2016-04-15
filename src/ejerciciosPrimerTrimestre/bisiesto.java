package ejerciciosPrimerTrimestre;
//Nombre de mi programa: bisiesto

/** Nuestro programa devolverá si un año es bisiesto o no
 * siguiendo las normas del enunciado.
 * Como entrada tendremos un número natural.
 * Como sálida tendremos una variable que tendrá los valores cierto y falso.
 */
 
/* Pseudocódigo Generalizado
 * Inicio
 * preguntarContinuar
 * mientras
 * 	leerDatos
 * 	hacerComprobaciones
 * 	preguntarContinuar
 * finMientras
 * Fin
 */

import java.util.Scanner;
import java.lang.Math;
public class bisiesto
{
	public static void main (String[] args)
	{
		//declararVariables
		int anno;
		char continuar;
		boolean bisies=false;
		Scanner teclado=new Scanner(System.in);
		
		//preguntarContinuar
		System.out.println("Quieres realizar la operacion?(S/N)");
		continuar=Character.toUpperCase(teclado.next().charAt(0));
		//mientras
		while (continuar=='S')
		{	
			//leerDatos
			System.out.println("Introduzca el anio");
			anno=teclado.nextInt();
			//hacerComprobaciones
			if (anno%400==0 ||( anno%4==0 && anno%100!=0))
				bisies=true;
			else
				bisies=false;
			System.out.println(bisies);
			//preguntarContinuar
			System.out.println("Quieres realizar la operacion?(S/N)");
			continuar=Character.toUpperCase(teclado.next().charAt(0));
		}		
	}
 }

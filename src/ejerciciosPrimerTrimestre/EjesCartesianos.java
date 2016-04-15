package ejerciciosPrimerTrimestre;
//Nombre de mi programa:EjesCartesianos

/** En este programa, el usuario introducirá dos números reales
 * y el programa le devolverá el cuadrante al que pertenece dicho punto.
 * Suponemos que le primer número introducido por el usuario es la cordenada
 * X, mientras que el segundo es la coordenada Y. Además en esta primera 
 * versión, no tendremos en cuentas los ejes de coordenadas.
 */

/*Pseudocódigo generalizado
 * Inicio
 * PreguntarContinuar
 * MientrasContinuar
 * 	LeerDatos
 * 	MientrasDatosCorrectos
 * 		ComprobarCuadrante
 * 	FinMientrasDatosCorrectos
 * 	PreguntarContinuar
 * FinMientrasContinuar
 * Fin
 */

import java.util.Scanner;
import java.lang.Math;
public class  EjesCartesianos
{
		public static void main (String[] args)
		{
			//Declaración de Variables
			double x=0, y=0;
			char continuar;
			Scanner teclado=new Scanner(System.in);
			//PreguntarContinuar
			do
			{
				System.out.println("Quieres realizar la operacion?(S/N)");
				continuar=Character.toUpperCase(teclado.next().charAt(0));
			}
			while (continuar!='S' && continuar!='N');
			//LeerDatos
			while (continuar=='S')
			{	
				do
				{
					System.out.println("Introduzca la coordenada X");
					x=teclado.nextDouble();
					System.out.println("Introduzca la coordenada Y");
					y=teclado.nextDouble();
				}
				while (x==0 || y==0);
				//ComprobarCuadrante
				if (x>0)
					if (y>0)
						System.out.println("Esta en el primer cuadrante");
					else
						System.out.println("Esta en el cuarto cuadrante");
				else
					if (y>0)
						System.out.println("Esta en el segundo cuadrante");
					else
						System.out.println("Esta en el tercer cuadrante");
				//PreguntarContinuar
				do
				{
					System.out.println("Quieres realizar la operacion?(S/N)");
					continuar=Character.toUpperCase(teclado.next().charAt(0));
				}
				while (continuar!='S' && continuar!='N');
			}	
		}
}

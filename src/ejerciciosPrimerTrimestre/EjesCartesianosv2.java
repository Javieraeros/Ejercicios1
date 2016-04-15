package ejerciciosPrimerTrimestre;
//Nombre de mi programa:EjesCartesianosv2

/** En este programa, el usuario introducirá dos números reales
 * y el programa le devolverá el cuadrante al que pertenece dicho punto.
 * Suponemos que el primer número introducido por el usuario es la cordenada
 * X, mientras que el segundo es la coordenada Y. Tendremos en cuenta si 
 * la coordenada pertecene a algunos de los ejes, o al origen de coordenadas.
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
public class  EjesCartesianosv2
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
				System.out.println("Introduzca la coordenada X");
				x=teclado.nextDouble();
				System.out.println("Introduzca la coordenada Y");
				y=teclado.nextDouble();
				//ComprobarCuadrante
				if (x==0 || y==0)
					if (x!=0)
						System.out.println("Está en el eje OX");
					else
						if (y!=0)
							System.out.println("Está en el eje OY");
						else
							System.out.println("Está en el origen de coordenadas");
				else
					if (x>0)
						if (y>0)
							System.out.println("Está en el primer cuadrante");
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

package ejerciciosPrimerTrimestre;
//Nombre de mi programa=ComprobarTriangulo

/**Este programa comprobará si un triángulo es obtusángulo,rectángulo o acutángulo
 * Necesitaremos 3 números reales y como salida pintará en pantalla el tipo de triángulo que es.
 * Los lados tendrán que ser mayores que 0.
 */
/* Pseudocódigo Generalizado
 * Inicio
 * preguntarContinuar
 * mientrasContinuar
 * 	leerDatos
 * 	ordenarLados
 * 	hacerComprobaciones
 * 	preguntarContinuar
 * finMientras
 * Fin
 */

import java.util.Scanner;
import java.lang.Math;
public class ComprobarTriangulo2
{
	public static void main (String[] args)
	{
		//declararVariables
		double lado1, lado2, lado3, A=0, B=0, C=0;
		char continuar;
		Scanner teclado=new Scanner(System.in);
		
		//preguntarContinuar
		System.out.println("Quieres realizar la operacion?(S/N)");
		continuar=Character.toUpperCase(teclado.next().charAt(0));
		
		//Comienza el mientras, no es un módulo, estructura de control
		while (continuar=='S')
		{
			//leerValidarDatos
			System.out.println("Introduzca el primer lado");
			lado1=teclado.nextDouble();
			System.out.println("Introduzca el segundo lado");
			lado2=teclado.nextDouble();
			System.out.println("Introduzca el tercer lado");
			lado3=teclado.nextDouble();
			while (lado1==0 || lado2==0 || lado3==0)
			{
				System.out.println("Error, los lados deben ser diferentes de 0");
				System.out.println("Introduzca el primer lado");
				lado1=teclado.nextDouble();
				System.out.println("Introduzca el segundo lado");
				lado2=teclado.nextDouble();
				System.out.println("Introduzca el tercer lado");
				lado3=teclado.nextDouble();
			}
			//ordenarLados
			if (lado1>=lado2 && lado1>=lado3)
			{
					A=lado1;
					B=lado2;
					C=lado3;
			}
			else
				if (lado2>=lado3)
				{
					A=lado2;
					B=lado3;
					C=lado1;
				}
				else
				{
					A=lado3;
					B=lado1;
					C=lado2;
				}
			//hacerComprobaciones
			if (A<B+C)
			{
				if (A*A==B*B+C*C)
					System.out.println("Es un triangulo rectangulo");
				else
					if (A*A>B*B+C*C)
						System.out.println("Es triangulo obtusangulo");
					else
						System.out.println("Es triangulo acutangulo");
			}
			else
				System.out.println("Error, no se puede construir el triangulo");
			
			//preguntarContinuar
			System.out.println("Quieres realizar la operacion?(S/N)");
			continuar=Character.toUpperCase(teclado.next().charAt(0));
		}
	}	
}

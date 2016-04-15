package ejerciciosPrimerTrimestre;
//Nombre de mi programa=ecuacionsegundogrado
/**Calculeremos la solución REAL de una ecuación de segundo grado,
 * conociendo sus coeficientes e introduciéndolos en el orden 
 * CORRECTO. No tendremos en cuenta la solución de una ecuación de
 * primer grado.
 */
/*Pseudocódigo generalizado
 * Inicio
 * preguntarContinuar
 * mientras
 * 	leerDatos
 * 	siDatosValidos
 * 		calcularSolucion
 * 		mostrarSolucion
 * 	sino
 * 		mensajeError
 * 	finSi
 * 	preguntarContinuar
 * finMientras
 * Fin
 */
import java.util.Scanner;
import java.lang.Math;
public class ecuacionsegundogrado
{
	public static void main (String[] args)
	{
		//declararVariables
		double a=0, b=0, c=0, aux=0, x1=0, x2=0;
		char continuar;
		Scanner teclado=new Scanner(System.in);
		
		//preguntarContinuar
		System.out.println("Quieres realizar la operacion?(S/N)");
		continuar=Character.toUpperCase(teclado.next().charAt(0));
		//comienza mientras continuar
		while (continuar=='S' || continuar=='s')
		{	
			//leerDatos
			System.out.println("Introduzca el primer coeficiente");
			a=teclado.nextDouble();
			System.out.println("Introduzca el segundo coeficiente");
			b=teclado.nextDouble();
			System.out.println("Introduzca el tercer coeficiente");
			c=teclado.nextDouble();
			aux=b*b-4*a*c;
			//Comienza la comprobación de datos
			if (aux>=0)
			{
				//calcularSolucion
				x1=(-b+Math.sqrt(aux))/(2*a);
				x2=(-b-Math.sqrt(aux))/(2*a);
				//mostrarSolucion
				System.out.println("La primera solucion es: "+x1);
				System.out.println("La segunda solucion es: "+x2);
			}
			else
				//mensajeError
				System.out.println("ERROR, el resultado no es un numero real");
				
				
		System.out.println("Quieres realizar la operacion?(S/N)");
		continuar=Character.toUpperCase(teclado.next().charAt(0));	
		}
		
	}
} 

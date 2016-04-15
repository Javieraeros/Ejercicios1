package ejerciciosPrimerTrimestre;
//Nombre de mi programa=triangulo
/** En este programa, calcularemos el perimetro de un triángulo
 * así como su área mediante uan función especial.
 * Tendremos en cuenta que los lados han de ser mayores de 0.
 * No tendremos en cuenta si con los números introducidos se puede crear
 * un triángulo.
 */
/* Pseudocódigo generalizado
 * Inicio
 * 	leerDatos
 * 	siDatosValidos
 * 		calcularSemiperimetro
 * 		calcularArea
 * 		mostrarResultados
 * 	sino
 * 		mostrarError
 * 	finSi
 * Fin
 */
import java.util.Scanner;
import java.lang.Math;
public class  triangulo
{
	public static void main (String[] args)
	{
		//declaraciónDeVariables
		double a=0, b=0, c=0, semiper=0, area=0;
		Scanner teclado=new Scanner(System.in);
		//leerDatos
		System.out.println("Introduzca los lados del triangulo: ");
		a=teclado.nextFloat();
		b=teclado.nextFloat();
		c=teclado.nextFloat();
		//siDatosValidos
		if (a>0 && b>0 && c>0)
		{
			//calcularPerimetro
			semiper=(a+b+c)/2;
			//calcularArea
			area=Math.sqrt(semiper*(semiper-a)*(semiper-b)*(semiper-c));
			//mostrarResultados
			System.out.println("El area del triangulo es "+area);
		}
		else
			//mostrarError
			System.out.println("Error, los lados del triángulo deben ser mayores de 0");
		
	}
}

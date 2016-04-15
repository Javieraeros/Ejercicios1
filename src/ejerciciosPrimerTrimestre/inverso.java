package ejerciciosPrimerTrimestre;
//Nombre de mi programa=Inverso
/**Calcularemos el inverso de un número
 * teniendo en cuenta que en caso de que sea 0
 * no podremos calcularlo, por lo que mostraremos un mensaje de error
 */
/*Pseudocódigo generalizado:
 * Inicio
 * 	obtenerDatos
 * 	calcularYMostrarResultados
 * Fin
 */

import java.util.Scanner;
public class inverso
{
	public static void main(String[] args)
	{
		//declaraciónDeDatos
		double numero=0, inv=0;
		Scanner teclado=new Scanner(System.in);
		//obtenerDatos
		System.out.println("Introduce el numero: ");
		numero=teclado.nextDouble();
		//calcularMostrarResultados
		if (numero==0)
		System.out.println("Error, el número debe ser diferente de 0");
		else
		{
			inv=1/numero;
			System.out.println("El inverso es: "+inv);
		}
	}
}

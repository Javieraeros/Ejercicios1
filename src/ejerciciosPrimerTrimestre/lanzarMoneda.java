package ejerciciosPrimerTrimestre;
//Nombre de mi programa: lanzarMoneda

/**En este programa, el usuario lanzará una moneda al aire, y el ordenador
 * devolverá si ha lanzado cara o cruz.
 * El usuario podrá repetir está operación tantas veces quiera.
 * Entradas
 * 		-Caracter: Si quiere ejecutar el programa
 * Salidas
 * 		-Pintamos en pantalla el resultado
 * 
 */
 
 /*Pseudocódigo generalizado
  * Inicio
  * PreguntarValidarContinuar
  * MientrasJugadorQuiera
  * 	LanzarMoneda
  * 	MostrarResultado
  * 	PreguntarValidarContinuar
  * Fin_Mientras
  * Fin
  */
  
import java.util.Scanner;
import java.util.Random;

public class lanzarMoneda
{
	public static void main(String [] args)
	{
		//DeclararVariables
		int moneda;
		char continuar;
		Scanner teclado=new Scanner(System.in);
		Random aleatorio=new Random();
		
		//PreguntarValidarContinuar
		
		/* El siguiente bucle está controlado por centinela, se inicializa 
		 * y actualiza en:  continuar=Character.toUpperCase(teclado.next().charAt(0));
		 * El usuario siempre entrará en el bucle y saldrá cuando introduzca:
		 * s, S,n ó N
		 */
		do
		{
			System.out.println("Desea ejecutar el programa? S/N");
			continuar=Character.toUpperCase(teclado.next().charAt(0));
			if (continuar!='S' && continuar!='N')
				System.out.println("ERROR, introduzca S/N");
		}
		while (continuar!='S' && continuar!='N');
		
		/* El siguiente bucle,controlado por centinerla, se inicializa anterioremente
		 * en:  continuar=Character.toUpperCase(teclado.next().charAt(0));
		 * y se actualiza al final del mismo en el mismo código
		 * El usuario entrará en el bucle si ha escrito anteriormente s ó S
		 * y saldrá cuando escriba n ó N
		 */
		while (continuar=='S')
		{
			//LanzarMoneda
			moneda=aleatorio.nextInt(2);
			/*System.out.println(moneda); tras un error, lo usé para comprobar
			 * cuál era el error (use 1 detro de nextInt())
			 */
			
			//MostrarResultados
			if (moneda==1)
				System.out.println("El resultado es Cara");
			else
				System.out.println("El resultado es Cruz");
			
			//PreguntarValidarContinuar
		
			/* El siguiente bucle está controlado por centinela, se inicializa 
			 * y actualiza en:  System.out.println("Desea ejecutar el programa? S/N");
			 * El usuario siempre entrará en el bucle y saldrá cuando introduzca:
			 * s, S,n ó N
			 */
			do
			{
				System.out.println("Desea ejecutar el programa? S/N");
				continuar=Character.toUpperCase(teclado.next().charAt(0));
				if (continuar!='S' && continuar!='N')
					System.out.println("ERROR, introduzca S/N");
			}
			while (continuar!='S' && continuar!='N');
		}
	}
}

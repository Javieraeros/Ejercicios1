package ejerciciosPrimerTrimestre;
//Nombre de mi programa=comprobarHora
/** Nuestro programa devolverá un saludo en inglés, dependiendo
 * de la hora que el usuario introduzca en el sistema.
 * El programa detectará si las horas y minutos están mal introducidos,
 * pero no detectará cual de los dos es el incorrecto.
 * Para ayudarnos, usaremos una variable llamada aux, en la que guardaremos
 * el total de minutos.
 * Entradas:
 * -Dos numeros enteros
 * Salidas:
 * Pintamos en pantalla el saludo
 */
/*Pseudocódigo generalizado
 * Inicio
 * preguntarContinuar
 * mientras
 * 	leerDatos
 * 	siDatosCorrectos
 * 		usarAuxiliar
 * 		comprobarHoraSaludar
 * 	sino
 * 		mostrarError
 * 	finSi
 * 	preguntarContinuar
 * finMientras
 * Fin
 */
import java.util.Scanner;
import java.lang.Math;
public class comprobarHora
{
	public static void main(String[] args)
	{
		//declaracionVariables
		int horas=0, minutos=0, aux=0;
		char continuar;
		Scanner teclado=new Scanner(System.in);
		//preguntarContinuar
		System.out.println("Quieres realizar la operacion?(S/N)");
		continuar=Character.toUpperCase(teclado.next().charAt(0));
		while (continuar=='S')
		{
			//leerDatos
			System.out.println("Introduce la hora(00-23)");
			horas=teclado.nextInt();
			System.out.println("Introduce los minutos(00-59)");
			minutos=teclado.nextInt();
			if ( horas<=23 && horas>0 && minutos>0 && minutos<=59)
				{
					//usarAuxiliar
					aux=horas*60+minutos;
					//comprobarHoraSaludar
					if (aux>=450 && aux<=1230)
						{
							if (aux<=840)
								System.out.println("Good morning");
							else
								System.out.println("Good afternoon");
						}
					else
						System.out.println("Good night");
				}
			else
				//mostrarError
				System.out.println("Error introduce una hora valida");
			
			//preguntarContinuar
			System.out.println("Quieres realizar la operacion?(S/N)");
			continuar=Character.toUpperCase(teclado.next().charAt(0));
		}
	
	}
}

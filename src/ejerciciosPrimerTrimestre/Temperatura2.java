package ejerciciosPrimerTrimestre;
//Nombre de mi programa: Temperatura2

/**En este programa, el usuario introducirá una temperatura, (previamente
 * definidad por el mismo) y se convertirá a Celsius/Fahrenheit.
 * Tendremos en cuenta el 0 absoluto en ambos casos.
 * Leeremos un numero real, así como la medida.
 * Devolveremos un número real pintado en pantalla.
 */

/*Pseudocódigo generalizado
 * Inicio
 * MostrarValidarMenu
 * MientrasDiferenteS
 * 	Según (opcion)
 * 		caso C
 * 			LeerComprobarTemperaturaFahrenheit
 * 			TransformarMostrarCelsius
 * 		caso F
 * 			LeerComprobarTemperaturaCelsius
 * 			TransformarMostrarFahrenheit
 * 	FinSegun
 * 	MostrarValidarMenu
 * FinMientras
 * Fin
 */

import java.util.Scanner;
import java.lang.Math;
public class  Temperatura2
{
		public static void main (String[] args)
		{
			//Declaración de Variables
			int bandera=0, error;
			double TEntrada=0, TSalida=0;
			char opcion=0;
			Scanner teclado=new Scanner(System.in);
			//MostrarValidarMenu
			do
			{
				if (bandera==-1)
						System.out.println("\nError, introduce una letra valida\n");
				System.out.println("Introduce C para convertir a Celsius");
				System.out.println("Introduce F para convertir a Fahrenheit");
				System.out.println("Introduce S para Salir");
				opcion=Character.toUpperCase(teclado.next().charAt(0));
				
				bandera=-1;
			}
			while (opcion!='C' && opcion!='F' && opcion!='S');
			while (opcion!='S')
			{
				bandera=0;
				error=0;
				switch (opcion)
				{	
					case 'C':
						//LeerComprobarTemperaturaFahrenheit
						do
						{
							if (error==-1)
								System.out.println("\nError, introduce una temperatura valida\n");
							System.out.println("Introduce la temperatura en grados Fahrenheit");
							TEntrada=teclado.nextDouble();
							error=-1;
						}
						while (TEntrada<-459.67);
						//TransformarMostrarCelsius
						TSalida=(TEntrada-32)/1.8;
						System.out.println("Su temperatura es: "+TSalida+ " grados C");
						break;
					case 'F':
						//LeerComprobarTemperaturaCelsius
						do
						{
							if (error==-1)
								System.out.println("\nError, introduce una temperatura valida\n");
							System.out.println("Introduce la temperatura en grados Celsius");
							TEntrada=teclado.nextDouble();
							error=-1;
						}
						while (TEntrada<-273.15);
						//TransformarMostrarFahrenheit
						TSalida=TEntrada*1.8+32;
						System.out.println("Su temperatura es: "+TSalida+ " grados F");
						break;
				}
				//MostrarValidarMenu
				do
				{
					if (bandera==-1)
						System.out.println("\nError, introduce una letra valida\n");
					System.out.println("Introduce C para convertir a Celsius");
					System.out.println("Introduce F para convertir a Fahrenheit");
					System.out.println("Introduce S para Salir");
					opcion=Character.toUpperCase(teclado.next().charAt(0));
					bandera=-1;
						
				}
				while (opcion!='C' && opcion!='F' && opcion!='S');
			}
			System.out.println("Gracias por usar este programa ^^\n");
		}
}

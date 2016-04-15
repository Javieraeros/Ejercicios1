package ejerciciosPrimerTrimestre;
//Nombre de mi programa: Temperatura

/**En este programa, el usuario introducirá una temperatura, (previamente
 * definidad por el mismo) y se convertirá a Celsius/Fahrenheit.
 * Tendremos en cuenta el 0 absoluto en ambos casos.
 * Leeremos un numero real, así como la medida.
 * Devolveremos un número real pintado en pantalla.
 */

/*Pseudocódigo generalizado
 * Inicio
 * PreguntarContinuar
 * MientrasContinaur
 * 	LeerEscala
 * 	SegúnEscala
 * 		para Escala==C
 * 		LeerComprobarTemperaturaFahrenheit
 * 		TransformarMostrarCelsius
 * 		para Escala==F
 * 		LeerComprobarTemperaturaCelsius
 * 		TransformarMostrarFahrenheit
 * 	FinSegun
 * 	PreguntarContinuar
 * FinMientrasContinuar
 * Fin
 */

import java.util.Scanner;
import java.lang.Math;
public class  Temperatura
{
		public static void main (String[] args)
		{
			//Declaración de Variables
			double TEntrada=0, TSalida=0;
			char continuar, escala;
			Scanner teclado=new Scanner(System.in);
			//PreguntarContinuar
			do
			{
				System.out.println("Quieres realizar la operacion?(S/N)");
				continuar=Character.toUpperCase(teclado.next().charAt(0));
			}
			while (continuar!='S' && continuar!='N');
			while (continuar=='S')
			{
				//LeerEscala
				do
				{
					System.out.println("Introduce C para convertir a Celsius o F para convertir a Fahrenheit");
					escala=Character.toUpperCase(teclado.next().charAt(0));
				}
				while (escala!='C' && escala!='F');
				switch (escala)
				{	
					case 'C':
						//LeerComprobarTemperaturaFahrenheit
						do
						{
							System.out.println("Introduce la temperatura en grados Fahrenheit");
							TEntrada=teclado.nextDouble();
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
							System.out.println("Introduce la temperatura en grados Celsius");
							TEntrada=teclado.nextDouble();
						}
						while (TEntrada<-273.15);
						//TransformarMostrarFahrenheit
						TSalida=TEntrada*1.8+32;
						System.out.println("Su temperatura es: "+TSalida+ " grados F");
				}
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

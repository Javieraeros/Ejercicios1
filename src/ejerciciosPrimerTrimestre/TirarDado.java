package ejerciciosPrimerTrimestre;
//Nombre de mi programa: TirarDado

/** En este programa tiraremos un dado (valores de 1 a 6)
 * tantas veces como el usuario quiera. Guardaremos los resultados
 * para después mostrar el número de veces que ha salido cada dado en forma 
 * de porcentaje.
 * Entradas:
 * 		Caracter para controlar si el usuario quiere continuar.
 * Salidas:
 * 		Porcentaje de salida de cada dado
 */

/*Pseudocódigo generalizado
 * Inicio
 * 	PreguntaryValidarContinuar
 * 	MientrasContinuar
 * 		TirarDado
 * 		según tirada
 *			para tirada==1
 * 				MostrarTirada1Calcular
 * 			para tirada==2
 * 				MostrarTirada2Calcular
 * 			para tirada==3
 * 				MostrarTirada3Calcular
 * 			para tirada==4
 * 				MostrarTirada4Calcular
 * 			para tirada==5
 * 				MostrarTirada5Calcular
 * 			para tirada==6
 * 				MostrarTirada6Calcular
 * 		Fin_segun
 * 		PreguntaryValidarContinuar
 * 		MostarResultados
 * 	Fin_MientrasContinuar
 * Fin
 */

import java.util.Random;
import java.util.Scanner;

public class TirarDado
{
	public static void main (String[] args)
	{
		//DeclararVariables
		char continuar;
		int dado1=0, dado2=0, dado3=0;
		int dado4=0 ,dado5=0 ,dado6=0;
		int tirada, totaltiradas=0, i;
		Scanner sc=new Scanner(System.in);
		Random dado=new Random();
		
		
		//PreguntaryValidarContinuar
		
		/* En este bucle, validaremos si el usuario quiere entrar al programa.
		 * Está controlado por centinela, se inicializa y actualiza en la línea 64
		 * Entraremos mínimo una vez, y saldremos cuando el usuario escriba:
		 * 's' ó 'S' ó 'n' ó 'N'.
		 */
		do
		{
			System.out.println("Quieres tirar un dado (S/N)");
			continuar=sc.next().charAt(0);
			continuar=Character.toUpperCase(continuar);
			if (continuar!='S' && continuar!='N')
				System.out.println("ERROR INTRODUCE UNA LETRA VALIDA");
		}
		while(continuar!='S' && continuar!='N');
		
		
		 while (continuar=='S')
		 {
			 //TirarDado
			 tirada=dado.nextInt(6)+1;
			 
			 switch (tirada)
			 {
				 case 1:
					 //MostrarTirada1Calcular
					 System.out.println("Su tirada ha salido 1");
					 dado1=dado1+1;
				 break;
				 case 2:
					 //MostrarTirada2Calcular
					 System.out.println("Su tirada ha salido 2");
					 dado2=dado2+1;
				 break;
				 case 3:
					 //MostrarTirada3Calcular
					 System.out.println("Su tirada ha salido 3");
					 dado3=dado3+1;
				 break;
				 case 4:
					 //MostrarTirada4Calcular
					 System.out.println("Su tirada ha salido 4");
					 dado4=dado4+1;
				 break;
				 case 5:
					  //MostrarTirada5Calcular
					 System.out.println("Su tirada ha salido 5");
					 dado5=dado5+1;
				 break;
				 case 6:
					 //MostrarTirada6Calcular
					 System.out.println("Su tirada ha salido 6");
					 dado6=dado6+1;
				 break;
			 }
			 //PreguntaryValidarContinuar
			
			 /* En este bucle, validaremos si el usuario quiere entrar al programa.
			  * Está controlado por centinela, se inicializa y actualiza en la línea PONER LINEA
			  * Entraremos mínimo una vez, y saldremos cuando el usuario escriba:
			  * 's' ó 'S' ó 'n' ó 'N'.
			  */
			 do
			 {
				 System.out.println("Quieres tirar un dado (S/N)");
				 continuar=Character.toUpperCase(sc.next().charAt(0));
				 if (continuar!='S' && continuar!='N')
					 System.out.println("ERROR INTRODUCE UNA LETRA VALIDA");
			 }
			 while(continuar!='S' && continuar!='N');
		 }
		 //MostrarResultados
		 totaltiradas=dado1+dado2+dado3+dado4+dado5+dado6;
		 System.out.println("El porcentaje del dado 1 es: " +(float)dado1/totaltiradas*100+"%");
		 System.out.println("El porcentaje del dado 2 es: " +(float)dado2/totaltiradas*100+"%");
		 System.out.println("El porcentaje del dado 3 es: " +(float)dado3/totaltiradas*100+"%");
		 System.out.println("El porcentaje del dado 4 es: " +(float)dado4/totaltiradas*100+"%");
		 System.out.println("El porcentaje del dado 5 es: " +(float)dado5/totaltiradas*100+"%");
		 System.out.println("El porcentaje del dado 6 es: " +(float)dado6/totaltiradas*100+"%");
	}
}

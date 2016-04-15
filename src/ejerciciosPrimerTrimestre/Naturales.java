package ejerciciosPrimerTrimestre;
//Nombre de mi programa:Naturales

/**En este programa, el usuario introducirá un número natural, diferente
 * de 0. Tendremos como salida 3*n+1 numeros naturales, que son, el número en
 * si, el cuadrado del número, el cubo y la suma de todos estos números.
 * */

/*Pseudocódigo generalizado
 * Inicio
 * DeclararVariables
 * PreguntarContinuar
 * MientrasContinuar
 * 	LeerNumero
 * 	Para (inicializar contador=0,mientras contador<numero,contador=contador+1)
 * 		MuestraResultados
 * 	FinPara
 * 	PreguntarContinaur
 * FinMientras
 * Fin
 */
import java.util.Scanner;
 
public class Naturales
{
	public static void main (String[] args)
	{
			//DeclararVariables
			int numero=0, acum, bandera=0, i;
			char continuar;
			Scanner teclado=new Scanner(System.in);
			//PreguntarContinuar
			do
			{
				if (bandera==-1)
					System.out.println("Error, introduce S o N");
				System.out.println("Quieres ejecutar el programa? (S/N)");
				continuar=Character.toUpperCase(teclado.next().charAt(0));
				bandera=-1;
			}
			while (continuar!='S' & continuar!='N');
			bandera=0; //Volvemos a inicializar bandera para un posterior uso
			while (continuar=='S')
			{
				acum=0; //iniciamos el acumulador para un uso posterior
				//LeerNumero
				do
				{
					if (bandera==-1)
						System.out.println("Error, introduce un numero natural mayor que 0");
					else
						System.out.println("Introduce un numero natural menor de 302");
					numero=teclado.nextInt();
					bandera=-1;
				}
				while(numero<=0);
				bandera=0;//Volvemos a inicializar bandera para un posterior uso
				
				for (i=1;i<=numero;i=i+1)
				//MuestraResultados
				{
					//System.out.println("En construccion");
					//Muestra Resultados
					acum=acum+i+i*i+i*i*i;
					System.out.println(i);
					System.out.println(i*i);
					System.out.println(i*i*i);
					if (i==numero)
						System.out.println("El total de la suma es: "+acum);
						
				}
				//PreguntarContinuar
				do
				{
					if (bandera==-1)
						System.out.println("Error, introduce S o N");
					System.out.println("Quieres ejecutar el programa? (S/N)");
					continuar=Character.toUpperCase(teclado.next().charAt(0));
					bandera=-1;
				}
				while (continuar!='S' & continuar!='N');
				bandera=0;//Volvemos a inicializar bandera para un posterior uso
			}
	}
}
 

package ejerciciosPrimerTrimestre;
//Nombre de mi programa: Combinatorio

/** El programa devolverá el valor de un número combinatorio.
 * El usuario podrá repetir el proceso tantas veces como quiera.
 * 		Entradas: Dos números enteros
 * 		Salidas: Un número, pintado en pantalla
 */

/* Pseudocódigo generalizado
 * Inicio
 * 	PreguntaryValidarSiContinuar
 * 	Mientras quiera continuar
 * 		LeeryValidarNumeros
 * 		CalcularNumeroCombinatorio
 * 		MostrarResultado
 * 		PreguntaryValidarSiContinuar
 * Fin
 */

import java.util.Scanner;
public class Combinatorio {
	
	
	public static void main (String args[]) {
		long numeron,numerom,numerador,auxiliar,denominador;
		double resultado;
		char opcion;
		Scanner teclado=new Scanner(System.in);
		//PreguntaryValidarSiContinuar
		
		/* Bucle controlado por centinela,mínimo se entrará una vez y se saldrá cuando opcion sea S o N.
		 * La VCB se inicializa en linea 36 y se actualiza en linea 36
		 */
		do{
			System.out.println("Gracias por usar Combinatorio de Fco Javier Ruiz Rodriguez");
			System.out.println("Desea realizar la operacion combinatoria?(s/n)");
			opcion=Character.toUpperCase(teclado.next().charAt(0));
			if (opcion!='S' && opcion!='N'){
				System.out.println("Por favor, introduzca una letra valida");
			}
		}
		while(opcion!='S' && opcion!='N');
		
		/***************************************************************
		 * En el siguiente bucle, controlado por centinela se entrará si el usuario
		 * ha introducido anteriormente (línea 37):
		 * 			-s
		 * 			-S
		 * Y se repetirá mientras en la línea -------- no introduzca:
		 * 			-n
		 * 			-N
		 */
		
		while (opcion=='S'){
			//LeeryValidarNumeros
			
			/*En el siguiente bucle, controlado por centinela, validaremos dos números.
			 * Entraremos mínimo una vez, y saldremos cuando ambos sean mayor que 0, 
			 * y el primero sea mayor que el segundo. La VCB se inicializa y actualiza en la 
			 * línea 
			 */
			 do{
				 System.out.println("Introduzca el numero superior");
				 numeron=teclado.nextLong();
				 System.out.println("Introduzca el numero inferior");
				 numerom=teclado.nextLong();
				 if (numeron<=0 || numerom<0 || numeron<=numerom){
					 System.out.println("Error, los números tienen que ser mayor o igual que 0");
					 System.out.println("Y el numero superior mayor que el inferior");
				 }
				 
			 }while(numeron<=0 || numerom<0 || numeron<=numerom);
			 
			 //CalcularNumeroCombinatorio
			 numerador=FuncionesBoletin5.Factorial(numeron);
			 auxiliar=FuncionesBoletin5.Factorial(numeron-numerom);
			 denominador=FuncionesBoletin5.Factorial(numerom)*auxiliar;
			 resultado=numerador/denominador;
			 
			 //MostarResultados
			 System.out.println("El resultado de su número combinatorio es: "+denominador);
			 
			 //PreguntaryValidarSiContinuar
		
			/* Bucle controlado por centinela,mínimo se entrará una vez y se saldrá cuando opcion sea S o N.
			 * La VCB se inicializa y se actualiza en la línea 91.
			 */
			do{
				System.out.println("Gracias por usar Combinatorio de Fco Javier Ruiz Rodriguez");
				System.out.println("Desea realizar la operacion combinatoria?");
				opcion=Character.toUpperCase(teclado.next().charAt(0));
				if (opcion!='S' && opcion!='N'){
					System.out.println("Por favor, introduzca una letra valida");
				}
			}
			while(opcion!='S' && opcion!='N');
		}
	}
}


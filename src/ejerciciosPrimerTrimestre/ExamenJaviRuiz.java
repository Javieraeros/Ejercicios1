package ejerciciosPrimerTrimestre;
//Nombre de mi programa: ExamenJaviRuiz
 
/*Pseudocódigo generalizado Programa Principal
  * Inicio
  * 	MostarMenuValidarDatos
  * 	RepetirMientras
  * 		Segun (opcion)
  * 			caso '1':
  * 				PintarCuadrado
  * 			caso '2':
  * 				NumeroColega
  * 			caso '3':
  * 				CartaMagica
  * 		Fin_Segun
  * 		MostrarMenuValidarDatos
  * 	fin_RepetirMientras
  * Fin
*/
/*Pseudocódigo generalizado CartaMagica
 * Inicio
 * LeernumeroJugadas
 * Para (Jugadas=1,Jugadas<=numeroJugadas,jugadas=jugadas+1)
 * 	CalcularMostrarJugadas
 * Fin_Para
 * MostrarResultados
 * Fin
 */ 

import java.util.Scanner;
import java.lang.Math;

public class ExamenJaviRuiz
{
	public static void main (String[] args)
	{
		//DeclaracionVariables
		boolean usuario=true;
		char caracterCuadrado;
		int opcion;
		int numeroCuadrado, numeroJugadas,jugadas;
		int jugadaUsuario, jugadaOrdenador; //jugadas del usuario o del ordenador
		int empates, ganaUsuario, ganaOrdenador;
		Scanner teclado=new Scanner(System.in);
		
		
		
		//MostrarMenuValidarDatos
		/*
		 * El siguiente bucle,controlado por centinela, valida la entrada del menu
		 * mediante la variable opcion.Minimo se entrará una vez, y se saldrá cuando el usuario
		 * introduzca 1,2 ó 3.
		 * 
		 */
		do
		{	
			System.out.println("Introduzca 1 para ejecutar: PintarCuadrado");
			System.out.println("Introduzca 2 para ejecutar: NumeroColega");
			System.out.println("Introduzca 3 para ejecutar: CartaMagica");
			System.out.println("Introduzca 0 para salir");
			opcion=teclado.nextInt(); //Actualización de la VCB
			if (opcion>=4 || opcion<0)
				System.out.println("ERROR, introduce un numero valido");
		}
		while (opcion>=4 || opcion<0);
		
		
		/*
		 * En el siguiente bucle, se entrará si el usuario ha introducido
		 * 1 ó 2 ó 3. Es un bucle controlado por centinela, del que se saldrá cuando el usuario
		 * (al ser preguntado previamente) introduzca 0.
		 * La variable se inicializa en la linea 60, y se actualiza en la linea PONER LINEA
		 */
		while (opcion!=0)
		{
			
			switch (opcion)
			{
				case 1:
				/*
				 * El siguiente bucle,controlado por centinela, validará los datos de pintarCuadrado.
				 * Se realizará minimo una vez y se repetirá hasta que el usuario introduzca
				 * una 'a' ó 'z' o # y un numero impar entre 3 y 30 (inclusives).
				 */
				
					do
					{
						
							
						System.out.println(" Introduzca una letra del abecedario minuscula o #");
						caracterCuadrado=teclado.next().charAt(0); //Inicialización y actualización de VCB
						System.out.println("Introduzca un numero impar entre 3 y 30");
						numeroCuadrado=teclado.nextInt(); //Inicialización y actualización de VCB
						if (((caracterCuadrado=='a' || caracterCuadrado=='z') && caracterCuadrado!='#')
							|| ((numeroCuadrado<3 || numeroCuadrado>30) || numeroCuadrado%2==0))
							System.out.println("ERROR, introduce los dos datos validos");
					}
					while(((caracterCuadrado=='a' || caracterCuadrado=='z') && caracterCuadrado!='#')
							|| ((numeroCuadrado<3 || numeroCuadrado>30) || numeroCuadrado%2==0));
							
					
					System.out.println("En construccion");
					break;
					
				
				case 2:
					System.out.println("En construccion");
					break;
					
					
				case 3:
					//LeerNumeroJugadas
					/*
					 * El siguiente bucle,controlado por centinela, valida la entrada del numero de jugadas
					 * mediante la variable numeroJugadas.Minimo se entrará una vez, y se saldrá cuando el usuario
					 * introduzca un numero positivo mayor que 0.
					 * En jugadasOrdenador y jugadasUsuario, los palos se distribuiran:
					 * 		-1 a 3, figuras oros
					 * 		-4 as bastos
					 * 		-5 a 15 espadas
					 * 		-16= 2 de copas
					 * 		*resto de cartas no interesan
					 */
					do
					{		
						System.out.println("Introduce el numero de jugadas");
						numeroJugadas=teclado.nextInt();  //Inicialización Y actualización de la VCB
						if (numeroJugadas<=0)
							System.out.println("ERROR, introduce un numero valido");
					}
					while (numeroJugadas<=0);
					//Inicializamos para un posterior uso
					jugadas=0;
					empates=0;
					ganaUsuario=0;
					ganaOrdenador=0;
					
					for (jugadas=1;numeroJugadas>=jugadas;jugadas=jugadas+1)
					{
						//CalcularMostrarJugadas
						
						if (usuario==true) //usamos esta variable para controlar el ganador de la jugada anterior
						{
							jugadaUsuario=(int) (Math.random()*40+1);
							jugadaOrdenador=(int) (Math.random()*40+1);
						}
						else
						{
							jugadaOrdenador=(int) (Math.random()*40+1);
							jugadaUsuario=(int) (Math.random()*40+1);
						}
						
						
						if ((jugadaUsuario<=15 && jugadaOrdenador>=17) || jugadaOrdenador==16)
						{
							System.out.println("Gana el Usuario!");
							ganaUsuario=ganaUsuario+1;
							usuario=true;
						}
						else
						{
							if ((jugadaUsuario>=17 && jugadaOrdenador<=15) || jugadaUsuario==16)
							{
								System.out.println("Gana el Ordenador!");
								ganaOrdenador=ganaOrdenador+1;
								usuario=false;
							}
							else
							{
								System.out.println("La jugada es Empate");
								empates=empates+1;
							}
						}
					}					
					System.out.println("Numero de jugadas ganadas por el Usuario: "+ganaUsuario);
					System.out.println("Numero de jugadas ganadas por el Ordenador: "+ganaOrdenador);
					System.out.println("Numero de jugadas empates "+empates);
					if (ganaUsuario>ganaOrdenador)
						System.out.println("El ganador es el usuario");
					else
					{
						if (ganaUsuario<ganaOrdenador)
							System.out.println("El ganador es el ordenador");
						else
							System.out.println("El resultado total es empate");
					
					}
					break;
			}
			//MostrarMenuValidarDatos
			/*
			 * El siguiente bucle,controlado por centinela, valida la entrada del menu
			 * mediante la variable opcion.Minimo se entrará una vez, y se saldrá cuando el usuario
			 * introduzca 1,2 ó 3.
			 * 
			 */
			do
			{
				if (opcion>=4 || opcion<0)
					System.out.println("ERROR, introduce un numero valido");
				
				System.out.println("Introduzca 1 para ejecutar: PintarCuadrado");
				System.out.println("Introduzca 2 para ejecutar: NumeroColega");
				System.out.println("Introduzca 3 para ejecutar: CartaMagica");
				System.out.println("Introduzca 0 para salir");
				opcion=teclado.nextInt(); //Actualización de la VCB
			}
			while (opcion>=4 || opcion<0);
		}
	}
}

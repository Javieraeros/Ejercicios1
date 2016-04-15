package ejerciciosPrimerTrimestre;

/**Métodos de la clase:
 *
 *  ImprimirCaracter
 *  Minuscula
 */
public class FuncionesBoletin5 {
	
	/* 
	 * Interfaz Imprimir Caracter
	 * Cabecera:ImprimirCaracter (Entero numero, caracter caracter)
	 * Subprograma que imprime un carácter tantas veces como indique el numero
	 * Precondiciones:Número mayor que 0
	 * Entrada:Int numero paso por valor
	 *         char caracter paso por valor
	 * Salida:Ninguna, pero se pinta en pantalla
	 * Entrada/Salida:Ninguna
	 * Postcondiciones:Ninguna
	 */
	
	
	public static void ImprimirCaracter(int numero,char caracter) {
		int i;
		for (i=1;i<=numero;i++)
		{
			System.out.print(caracter);
		}
	}
	
	/*
	 * Interfaz Cambiar a Mayúsculas
	 * Cabecera:Mayuscula(caracter letra)
	 * Proceso:Subprograma que pasa de minúsculas a mayúsculas un carácter
	 * Precondición:Carácter letra
	 * Entrada:Ninguna
	 * Salida:Ninguna
	 * Entrada/salida:Caracter letra
	 * Postcondición:Caracter letra por referencia, ya en minúscula
	 */
	 
	 /*
	 * Interfaz ADAPTADA Cambiar a Mayúsculas 
	 * Cabecera:caracter Mayuscula(caracter letra)
	 * Proceso:Subprograma que pasa de mayúsculas a minúsculas un carácter
	 * Precondición:Carácter letra
	 * Entrada:char letra
	 * Salida:char minuscula
	 * Entrada/salida:Ninguna
	 * Postcondición:Caracter asociado al nombre, ya en minúscula
	 */
	public static char Minuscula(char letra){
		char minus;
		if ((int) letra>=97){
			minus=letra;
		}else{
			minus=(char) ((int) letra+32);
		}
		return (minus);
		
	}
	/*
	* Interfaz Factorial
	* Cabecera: entero Factorial(entero numero)
	* Proceso: Subprograma que calcula el factorial de un numero entero
	* Precondición: numero mayor o igual que 0
	* Entrada: Entero Numero
	* Salido: Entero Factorial
	* Postcondiciones: Entero asociado al nombre
	*/
	  
	//resguardo
	/*public static long Factorial(long numero){
		System.out.println("El subprograma factorial está en construccion");
		return (1);
	}*/
	
	/*
	* Interfaz Factorial
	* Cabecera: entero Factorial(entero numero)
	* Proceso: Subprograma que calcula el factorial de un numero entero
	* Precondición: numero mayor o igual que 0
	* Entrada: Entero Numero
	* Salido: Entero Factorial
	* Postcondiciones: Entero asociado al nombre
	*/
	public static long Factorial(long numero){
		long factorial=0;
		
		if (numero==0)
		factorial=1;
		else
		factorial=numero*Factorial(numero-1);
		
		return(factorial);
	}
}


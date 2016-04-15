package ejerciciosPrimerTrimestre;
//Piramide de tartaglia de Javi

public class MetodosJavi {
	/**
 * 			        Tartaglia
 * Comentario: va a pintar la piramide de tartaglia
 * Cabecera: void Tartaglia(int tamaniopiramide)
 * Precondiciones: el numero tiene que ser mayor que cero
 * Entradas:   tamaniopiramide ---- tipo entero --- formal/por valor
 * Salidas: no hay , solo se pinta por pantalla una pirmide
 * Poscondiciones: no hay 
 * */
	//resguardo
	//public static void Tartaglia(int tamaniopiramide){
		//System.out.println("Estamos trabajando en la construccion de Tartaglia "); 
	//}//fin  Tartaglia	
	
	public static void Tartaglia(int tamaniopiramide){
		int i,j,k;
		for (i=0;i<=tamaniopiramide;i++){
			for (j=0;j<=i;j++){
				System.out.print(combinatorio(i,j)+" ");
			}
			System.out.println();
		}	
	}
	/**              Combinatorio
	 * Comentario: Va a calcular el varlor de un número combinatorio, según la formula (WIKIPEDIA)
	 * Cabecera: long combinatorio(long numera, long denomina)
	 * precondiciones: ambos valores han de ser mayot que cero
	 * Entradas: numera----tipo long----paso por valor
	 * 			 denomina----tipo long---paso por valor
	 * Salidas: resul---- tipo long
	 * Postcondiciones: el resultado será asociado al nombre
	 */
	
	public static long combinatorio(long numera, long denomina){
		long aux,resul;
		aux=factorial(numera-denomina);
		aux=factorial(denomina)*aux;
		resul=factorial(numera)/aux;
		return (resul);
		
	}
	
	/*
	* Interfaz Factorial
	* Cabecera: long factorial(long numero)
	* Proceso: Subprograma que calcula el factorial de un numero entero
	* Precondición: numero mayor o igual que 0
	* Entrada: Entero Numero
	* Salido: Entero Factorial
	* Postcondiciones: Entero asociado al nombre
	*/
	public static long factorial(long numero){
		long resultado=1;
		
		if (numero==0)
		resultado=1;
		else
		resultado=numero*factorial(numero-1);
		
		return (resultado);
	}
}

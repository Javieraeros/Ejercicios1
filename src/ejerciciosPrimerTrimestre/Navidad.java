package ejerciciosPrimerTrimestre;
//Subprogramas Navidad

public class Navidad {

	/* 
	 * Interfaz Ejercicio 1
	 * Cabecera: int comprobarCaracter (char letra1,char letra2)
	 * Proceso Este subprograma devolverá un entero dependiendo si las letras introducidas son
	 * iguales, o la segunda anterior o posterior
	 * Precondiciones: Los caracteres tienen que ser letras
	 * Entrada: 2 caracteres
	 * Salida: 1 número
	 * Entrada/Salida: Nada
	 * Postcondiciones: 0 si las letras son iguales, -1 si la primera es anterior a la segunda y 1 si la primera es posterior
	 * 
	 */
	 
	//resguardo
	/*public int comprobarCaracter (char letra1,char letra2){
		System.out.println("Programa en construcción");
		return(1);
	}*/
	 
	public static int comprobarCaracter (char letra1,char letra2){
		int resultado;
		if (letra1==letra2){
			resultado=0;
		}
		else{
			if (letra1>letra2)
				resultado=1;
			else
				resultado=-1;
		}
		return(resultado);
	}
	/* 
	 * Interfaz ejercicio 2a
	 * Cabecera: int Mayuscula (char letra)
	 * Proceso Devolverá un valor numerico dependiendo de si una letra es mayúscula o no, o si es una letra válida
	 * Precondiciones: Ninguna
	 * Entrada: 1 letra
	 * Salida: 1 entero
	 * Entrada/Salida: Nada
	 * Postcondiciones: 1 si la letra es mayúscula, -1 si la letra es minúscula, 0 si no es una letra del alfabeto
	 */
	//Resguardo
	/*public static int Mayuscula (char letra){
		System.out.println("Programa en construcción");
		return(0);
	}*/
	
	public static int Mayuscula (char letra){
		int letraasci;
		int resultado;
		letraasci=(int) letra;
		if (letraasci<65 || letraasci>122)
			resultado=0;
		else{
			if (letraasci>=97)
				resultado=-1;
			else
			resultado=1;
		}
		return(resultado);
	}
	/* 
	 * Interfaz ejercicio 2b
	 * Cabecera: int Minuscula
	 * Proceso Devolverá un valor numérico dependiendo de, si es una letra valida, es minúscula o no
	 * Precondiciones:Ninguna
	 * Entrada:1 letra
	 * Salida:1 entero
	 * Entrada/Salida:Nada
	 * Postcondiciones:1 si al letra es minúscula, -1 si no lo es y 0 si no es un caracter valido
	 */
	//Resguardo
	/*public static int Minuscula (char letra){
		System.out.println("Programa en construcción");
		return(0);
	}*/
	
	public static int Minuscula (char letra){
		int resultado;
		resultado=-Mayuscula(letra);
		return(resultado);
	}
	 
	/* 
	 * Interfaz ejercicio 2c
	 * Cabecera: boolean Digito (int numero)
	 * Proceso Devolverá un valor booleano dependiendo de si el caracter introducido es un dígito entre 0 y 9 o no
	 * Precondiciones:Ninguna
	 * Entrada:Un carácter
	 * Salida:Un booleano
	 * Entrada/Salida:Nada
	 * Postcondiciones:Booleano asociado al nombre, True si es un dígito entre '0' y '9' false en caso contrario
	 */
	 
	//resguardo
	/*public static boolean Digito (char letra){
		return(true);
	}*/
	
	public static boolean Digito (char letra){
		boolean resultado;
		int aux;
		aux= (int) letra;
		if (aux<48 ||  aux>57){
			resultado=false;
		}else{
			resultado=true;
		}
		return(resultado);
	}
	/* 
	 * Interfaz ejercicio 2d
	 * Cabecera: boolean Puntuacion (char caracter)
	 * Proceso: Devolverá si un caracter es un símbolo de puntuación
	 * Precondiciones: Ninguna
	 * Entrada:1 caracter
	 * Salida:1 booleano
	 * Entrada/Salida:Nada
	 * Postcondiciones: True si es un signo de puntuación, False si no lo es
	 */
	//Resguardo
	/*public static boolean Puntuacion (char caracter){
		System.out.println("En construcción");
		return(true);
	}*/
	
	
	public static boolean Puntuacion (char caracter){
		boolean resultado;
		int aux;
		aux= (int) caracter;
		if ((aux>=0 && aux<=32) ||(aux>=48 && aux<=57) || (aux>=65 && aux<=90) || (aux>=97 && aux<=122))
			resultado=false;
		else
			resultado=true;
		return(resultado);
	}
	/* 
	 * Interfaz Ejercicio 3
	 * Cabecera: boolean Compuesto (int numero)
	 * Proceso Este subprograma nos dirá si un numero es compuesto o no,es decir, que NO es primo
	 * Precondiciones: Numero NATURAL mayor que 1
	 * Entrada:un número
	 * Salida:Un booleano
	 * Entrada/Salida:Nada
	 * Postcondiciones: True si el número es compuesto, False en caso contrario
	 */
	//resguardo
	/*public static boolean Compuesto (int numero){
		System.out.println("En construcción,picha");
		return(true);
	}*/

	public static boolean Compuesto (int numero){
		boolean resultado;
		int contador=0;
		int i;
		for (i=1;i<=numero;i++){
			if (numero%i==0)
				contador=contador+1;
		}
		if (contador>2)
			resultado=true;
		else
			resultado=false;
		return(resultado);
	}
	
	/* 
	 * Interfaz NumeroPerfecto
	 * Cabecera: boolean Perfecto (int numero)
	 * Proceso: Subprograma que devuelve si un número es igual a la suma de todos sus divisores(excepto él mismo)
	 * Precondiciones: Número natural diferente de 1
	 * Entrada:Un número
	 * Salida:Un booleano
	 * Entrada/Salida:Nada
	 * Postcondiciones:Booleano asociado al nombre
	 */
	//Resguardo
	/*public static boolean Perfecto (int numero){
		System.out.println("Subprograma en construcción");
		return(true);
	}*/
	
	public static boolean Perfecto(int numero){
		int i;
		boolean resultado;
		int acumulador=0;
		for (i=1;i<=numero-1;i++){
			if (numero%i==0){
				acumulador=acumulador+i;
			}
		}
		if (acumulador==numero)
			resultado=true;
		else
			resultado=false;
		return(resultado);
	}
	/* 
	 * Interfaz Semiperfecto
	 * Cabecera: boolean Semiperfecto (int numero)
	 * Proceso: Subprograma que calcula si un número es semiperfecto, es decir, si la suma de alguno de sus divisores da a sí mismo
	 * Precondiciones:Numero natural diferente de 1
	 * Entrada:Un número 
	 * Salida:Un booleano
	 * Entrada/Salida:Nada
	 * Postcondiciones:Booleano asociado al nombre
	 */
	//Resguardo
	/*public static boolean Semiperfecto (int numero){
		System.out.println("Pasa al siguiente Peicha");
		return(true);
	}*/
	
	public static boolean Semiperfecto (int numero){
		int i,j;
		boolean resultado=false;
		int acumulador=numero;
		for (i=numero/2;i>=1;i--){
			if (numero%i==0){
				acumulador=acumulador-i;
				if (acumulador<0)
					acumulador=acumulador+i;
				if (acumulador==0)
					resultado=true;
			}
		}
		return(resultado);
	}
	/* 
	 * Interfaz Ejercicio5
	 * Cabecera: boolean Friki (int numero)
	 * Proceso Subprograma que devolverá si la suma de los dígitos de un número es igual a 13 y si el número es
	 * 			múltiplo de 7
	 * Precondiciones:Ninguna
	 * Entrada:1 número
	 * Salida:1 booleano
	 * Entrada/Salida:Nada
	 * Postcondiciones:Booleano asociado al nombre, true si el número es friki, false en caso contrario
	 */
	//resguardo
	/*public static boolean Friki (int numero){
		return(true);
	}*/
	
	public static boolean Friki (int numero){
		boolean resultado;
		int aux=0;
		do{
			aux=aux+numero%10;
			numero=numero/10;
		}
		while (numero>0);
		if (aux==13 && numero%7==0)
			resultado=true;
		else
			resultado=false;
		return(resultado);
	}
	/* 
	 * Interfaz Ejercicio6
	 * Cabecera: void Rima (char numero)
	 * Proceso Subprograma que mostrara en pantalla una frase graciosa que rime con un número
	 * Precondiciones:Ninguna
	 * Entrada:Un carácter
	 * Salida:Nada, pinta en pantalla
	 * Entrada/Salida:Nada
	 * Postcondiciones:Ninguna
	 */
	//resguardo
	/*public static void Rima (char numero){
		System.out.println("En construcción");
	}*/
	
	public static void Rima (char numero){
		switch (numero){
			case '0':
				System.out.println("En la esquina te espero");
			break;
			case '1':
				System.out.println("Cervecita con Bruno");
			break;
			case '2':
				System.out.println("Cervecita para la Tos");
			break;
			case '3':
				System.out.println("Cervecita otra vez");
			break;
			case '4':
				System.out.println("Cervecita en el teatro");
			break;
			case '5':
				System.out.println("Cervecita que me hinco");
			break;
			case '6':
				System.out.println("Cervecita con el rey");
			break;
			case '7':
				System.out.println("Cervecita que te mete");
			break;
			case '8':
				System.out.println("Cervecita con chocho(altramuces)");
			break;
			case '9':
				System.out.println("Cervecita hasta que nieve");
			break;
			default:
				System.out.println("Introduce un carácter válido");
			break;
		}
	}
	
	/*				Interfaz COMPARACIONFECHAS
 * Cabecera: int comparacionFechas(int dia1,int mes1, int anyo1,int dia2,int mes2,int anyo2)
 * Proceso:Este programa devolverá 1 si la primera fecha es mayot que la segunda,0 si es igual y -1 si es menor
 * Precondiciones:Año mayor que 1582,mes entre 1 y 12, día congruente con el mes
 * Entradas:
 * 			-3 números enteros para la primera fecha: DIA/MES/AÑO
 * 			-3 números enteros para la segunda fecha: DIA/MES/AÑO
 * Salidas:1 número entero comparacion
 * POstcondiciones: comparacion asociado al nombre
 */
	//resguardo
	/*public static int comparacionFechas(int dia1,int mes1, int anyo1,int dia2,int mes2,int anyo2){
		System.out.println("Subprograma en construcción, posible error en la salida");
		return (1);
	}*/
	
	public static int comparacionFechas(int dia1,int mes1, int anyo1,int dia2,int mes2,int anyo2){
		int resultado;
		if (anyo1<anyo2 || (anyo1==anyo2 && mes1<mes2) || (anyo1==anyo2 && mes1==mes2 && dia1<dia2))
			resultado=1;
		else
			if (anyo1==anyo2 && mes1==mes2 && dia1==dia2)
				resultado=0;
			else
				resultado=-1;
		return (resultado);
	}
	
	/* 
	 * Interfaz  ejercicio 8
	 * Cabecera: boolean horaValida (int hora, int minutos, int segundos)
	 * Proceso Subprograma que recibe una hora y determina si es válida o no
	 * Precondiciones:Ninguna
	 * Entrada:3 números
	 * Salida:1 booleano
	 * Entrada/Salida:Nada
	 * Postcondiciones:Booleano asociado al nombre, true si la hora es válida, false en caso contrario
	 */
	
	//resguardo
	/*public static boolean horaValida (int hora,int minutos,int segundos){
		return(true);
	}*/
	
	public static boolean horaValida(int hora,int minutos,int segundos){
		boolean resultado;
		if (hora<0 || hora>24 || minutos<0 || minutos>=60 || segundos<0 || segundos>=60)
			resultado=false;
		else
			resultado=true;
		return(resultado);
	}
	
	/* 
	 * Interfaz ejercicio 9
	 * Cabecera: void conv24hAmPm (int ref.hora)
	 * Proceso Subprograma que convierte una hora en formato 24h a 12h
	 * Precondiciones:Ninguna
	 * Entrada:Nada
	 * Salida:Nada
	 * Entrada/Salida: Un entero
	 * Postcondiciones: Ninguna
	 */
	 
	
	/* 
	 * Interfaz ejercicio 9 ADAPTADO A JAVA
	 * Cabecera:int conv24hAmPm (int hora)
	 * Proceso Subprograma que conviernte una hora de formato 24h a 12h
	 * Precondiciones:Ninguna
	 * Entrada:Un entero
	 * Salida:Un entero
	 * Entrada/Salida:Nada
	 * Postcondiciones:Entero asociado al nombre, devolverá -1 en caso de error
	 */
	 
	//resguardo
	/*public static int conv24hAmPm (int hora){
		return (0);
	}*/
	
	public static int conv24hAmPm (int hora){
		int salida;
		if (hora>24 || hora <0)
			salida=-1;
		else{
			if (hora<13){
				if (hora==0)
					salida=12;
				else
					salida=hora;
			}
			else
				salida=hora-12;
		}
		return (salida);
	}
	 
	/* 
	 * Interfaz ejercicio 10
	 * Cabecera:boolean validarFecha (int,dia,int mes,int anio)
	 * Proceso Valida una fecha, tiene en cuenta años bisiestos
	 * Precondiciones:Ninguna
	 * Entrada:Un entero
	 * Salida:Un booleano
	 * Entrada/Salida:Nada
	 * Postcondiciones:Booleano asociado al nombre
	 */
	//resguardo
	/*public static boolean validarFecha (int dia, int mes,int anio){
		return(true);
	}*/
	 
	 
	public static boolean validarFecha (int dia, int mes,int anyo){
		boolean resultado;
		if (anyo<1582 || mes<1 || mes>12 || dia<1 || dia>31 || (dia>30 && (mes==4 || mes== 6 || mes==9 || mes==11)) ||
			(dia>28 && mes==2 && (anyo%4!=0 || (anyo%100==0 && anyo%400!=0))) || (dia>29 && mes==2))
			resultado=false;
		else
			resultado=true;
		return(resultado);
	}
	/* 
	 * Interfaz ejercicio 10
	 * Cabecera: int diasTranscurridos (int dia,int mes,int anyo,int dia2,int mes2,int anyo2)
	 * Proceso Subprograma que cuenta los días pasados entre una fecha y otra
	 * Precondiciones:Ninguna
	 * Entrada:6 enteros
	 * Salida:1 entero
	 * Entrada/Salida:Nada
	 * Postcondiciones:Salida asociada al nombre,se tendrá en cuenta los años bisiestos, devolverá -1 si las fechas no son validas
	 */
	//resguardo
	/*public static int diasTranscurridos (int dia,int mes,int anyo,int dia2,int mes2,int agno2){
		return(0);
	}*/
	
	public static int diasTranscurridos (int dia,int mes,int anyo,int dia2,int mes2,int anyo2){
		int resultado=0;
		int dia3,mes3,anyo3;
		if(validarFecha(dia,mes,anyo)==true && validarFecha(dia2,mes2,anyo2)==true){
			if (comparacionFechas(dia,mes,anyo,dia2,mes2,anyo2)==-1){
				dia3=dia; mes3=mes; anyo3=anyo;
				dia=dia2; mes=mes2; anyo=anyo2;
				dia2=dia3; mes2=mes3; anyo2=anyo3;
			}
			while(dia2!=dia || mes2!=mes || anyo2!=anyo){
				dia=dia+1;
				if (dia>31 || ((mes==4 || mes==6 || mes==9 || mes==11) && dia>30) || 
				(dia>28 && mes==2 && (anyo%4!=0 || (anyo%100==0 && anyo%400!=0))) 
				|| (dia>29 && mes==2)){
					mes=mes+1;
					dia=1;
					if (mes>12){
						anyo=anyo+1;
						mes=1;
					}
				}
			resultado=resultado+1;
			}
		}
		else
			resultado=-1;
		return(resultado);
	}
	
	/* 
	 * Interfaz ejercicio 12
	 * Cabecera: void relojArena (int numero, char letra)
	 * Proceso Subprograma que dibujará en pantalla un reloj de arena
	 * Precondiciones: Número impar entre 1 y 15
	 * Entrada:Un número
	 * 			una letra
	 * Salida:Nada, pinta en pantalla
	 * Entrada/Salida:
	 * Postcondiciones:Pintará ne pantalla el reloj
	 */
	//resguardo
	/*public static void relojArena (int numero, char letra){
		
	}*/
	
	public static void relojArena (int numero, char letra){
		int i,j,k;
		for (i=1;i<=numero;i++){
			if (i<=(numero+1)/2){
				for (j=1;j<i;j++){
					System.out.print(" ");
				}
				for (k=1;k<=numero+2-2*i;k++){
					System.out.print(letra);
				}
			}
			else{
				for (j=1;j<=numero-i;j++){
					System.out.print(" ");
				}
				for (k=1;k<=2*i-numero;k++){
					System.out.print(letra);
				}
			}
			System.out.println("");
		}
	}
	
	/* 
	 * Interfaz 
	 * Cabecera:
	 * Proceso
	 * Precondiciones:
	 * Entrada:
	 * Salida:
	 * Entrada/Salida:
	 * Postcondiciones:
	 */
	
	
}

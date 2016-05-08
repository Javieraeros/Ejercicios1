package ejerciciosPrimerTrimestre;
//Nombre de mi programa: Abs
/**
 *  Este programa devuelve el valor absoluto de un 
 * número leido por teclado.
 */
 /* Pseudocódigo generalizado:
 * Inicio
 * 	leerDatos
 * 	hacerCálculos
 * Fin
 */
import java.io.*;
import java.util.Scanner;
public class Abs
{
public static void main(String[] args)
 {
	 //declaraciónDeVariablesYOtrosObjetos
	 float numero,vabs;
	 Scanner teclado= new Scanner (System.in);
	 
	 //leerDatos
	 System.out.println("Introduce el número: ");
	 numero=teclado.nextFloat();
	 //hacerCálculos
	 
	 if (numero>=0)
	 vabs=numero;
	 else
	 vabs=-numero;
	 System.out.println("El número es: "+vabs);
	 teclado.close();
 }
}

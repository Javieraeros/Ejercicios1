package ejerciciosPrimerTrimestre;
//Nombre de mi programa:dia_semana
/**En este programa devolveremos el día de la semana
 * cuando el usuario introduzca un número del 1 al 7
 */
 /*Pseudocódigo generalizado
  * Inicio
  * 	obtenerDatos
  * 	hacerCalculos
  * Fin
  */
import java.util.Scanner;
public class diaSemana
{
	public static void main(String[] args)
	{
		//declararVariables
		int numero=0;
		Scanner teclado=new Scanner(System.in);
		//obtenerDatos
		System.out.print("Introduce el numero de la semana: ");
		numero=teclado.nextInt();
		//hacerCalculos
		if (numero==1)
		System.out.println("Lunes");
		else
			if (numero==2)
			System.out.println("Martes");
			else
				if (numero==3)
				System.out.println("Miercoles");
				else
					if (numero==4)
					System.out.println("Jueves");
					else
						if (numero==5)
						System.out.println("Viernes");
						else
							if (numero==6)
							System.out.println("Sabado");
							else
								if (numero==7)
								System.out.println("Domingo");
								else
								System.out.println("Introduce un numero del 1 al 7");
	}	
}

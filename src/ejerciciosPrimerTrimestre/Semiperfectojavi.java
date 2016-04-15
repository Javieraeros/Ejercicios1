package ejerciciosPrimerTrimestre;
/*
 * Semiperfectojavi.java
 * 
 * Copyright 2016 fjrodriguez <fjrodriguez@106-06>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */


public class Semiperfectojavi {
	
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
}


package ejerciciosPrimerTrimestre;



public class JaviEsElMejor {
	
/*Interfaz:
* signatura: void coordenadasVectorProductoVectorial(int coorXA, int coorYA, int coorZA, 
* 													 int coorXB, int coorYB, int coorZB)
* entradas: seis numeros enteros
* precondiciones: no hay
* salidas: no tiene, se muestra en pantalla el resultado
* postcondiciones: ninguna
*/
	
	public static void coordenadasVectorProductoVectorial (int coorXA, int coorYA, int coorZA,int coorXB, int coorYB, int coorZB) {
			int coorXC, coorYC,coorZC;
			coorXC=coorYA*coorZB-coorYB*coorZA;
			coorYC=coorZA*coorXB-coorZB*coorXA;
			coorZC=coorXA*coorYB-coorXB*coorYA;
			/*Sabemos que un subprograma no debe pintar en pantalla, pero por exigencias de
			 * la interfaz pintamos en pantalla y no devolvemos nada.
			 */
			 System.out.println("Las coordenadas de su vector son: " +coorXC+" "+coorYC+" "+coorZC);
			 return;
			
	}
}


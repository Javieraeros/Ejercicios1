package ejerciciosPrimerTrimestre;
//Ejercicio 13 Navidad

public class miChar{
	
	/*Determines if the specified character is a Unicode space character. A character is considered to be a space character if and only if 
	it is specified to be a space character by the Unicode Standard. This method returns true if the character's general category type is 
	any of the following:
	SPACE_SEPARATOR \u0020
	LINE_SEPARATOR \u2028
	PARAGRAPH_SEPARATOR \2029
	Note: This method cannot handle supplementary characters. To support all Unicode characters, including supplementary characters, 
	use the isSpaceChar(int) method.

	Parameters:
	ch - the character to be tested.
	Returns:
	true if the character is a space character; false otherwise.*/
	
	public static boolean isSpaceChar (char ch){
		boolean resultado;
		if (ch=='\u0020' || ch=='\u00a0' || ch=='\u1680' || ch=='\u2000' || ch=='\u2001' || ch=='\u2002' || 
			ch=='\u2003' || ch=='\u2004' || ch=='\u2005' || ch=='\u2006' || ch=='\u2007' || ch=='\u2008' || 
			ch=='\u2009' || ch=='\u200a' || ch=='\u202f' || ch=='\u205f' || ch=='\u3000')
			resultado=true;
		else
			resultado=false;
		return(resultado);
	}
	/*public static boolean isSpaceChar(int codePoint)
	Determines if the specified character (Unicode code point) is a Unicode space character. A character is considered to be a space character if and only if it is specified to be a space character by the Unicode Standard. This method returns true if the character's general category type is any of the following:
	SPACE_SEPARATOR
	LINE_SEPARATOR
	PARAGRAPH_SEPARATOR
	Parameters:
	codePoint - the character (Unicode code point) to be tested.
	Returns:
	true if the character is a space character; false otherwise.
	Since:
	1.5*/
	public static boolean isSpaceChar(int codePoint){
		boolean resultado;
		if (codePoint==32 || codePoint==8232 || codePoint==8233)
			resultado=true;
		else
			resultado=false;
		return(resultado);
	}
	
}

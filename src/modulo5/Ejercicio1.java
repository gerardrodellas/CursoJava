package modulo5;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese una cadena de caracteres a codificar");
		String strOriginal = sc.nextLine();
		String strMajuscula = strOriginal.toUpperCase();
		String strMurcielago = strOriginal.toUpperCase().replace('M' , '0' )
										  				.replace('U' , '1' )
										  				.replace('R' , '2' )
										  				.replace('C' , '3' )
										  				.replace('I' , '4' )
										  				.replace('E' , '5' )
										  				.replace('L' , '6' )
										  				.replace('A' , '7' )
										  				.replace('G' , '8' )
										  				.replace('O' , '9' );
		System.out.println("El texto original es: " + strOriginal);
		System.out.println("El texto en Mayusculas es: " + strMajuscula);
		System.out.println("El texto en Clave es: " + strMurcielago);
		
		int vocales = 0;
/*		for (int i=0; i < strOriginal.length(); i++ ) {
			if (strOriginal.charAt(strOriginal.))
		}
	*/		
			
										  
	
				            
		sc = null;

	}

}
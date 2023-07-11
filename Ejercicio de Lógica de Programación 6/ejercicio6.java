package EjerciciosLogica;
import java.util.Scanner;

public class ejercicio6 {
	public static void main(String[] args) {
		Scanner var1=new Scanner(System.in);
		System.out.println("Ingresa tu frase:");
		String frase = var1.nextLine();
		char[] letras = new char[frase.length()];
		char[] letrasInvertidas = new char[frase.length()];


		for (int i = 0; i < frase.length(); i++) {
		    letras[i] = frase.charAt(i);
		    letrasInvertidas[frase.length()-i-1]=letras[i];
		}

		String cadenaInvertida =new String(letrasInvertidas);
		System.out.println(cadenaInvertida);

		var1.close();
	}
}

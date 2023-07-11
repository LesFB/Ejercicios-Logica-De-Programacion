package EjerciciosLogica;
import java.util.HashMap; 
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ejercicio9 {
	  public static boolean validarLetras(String cadena) {
	        
	        String patron = "^[a-zA-Z]+$";
	        Pattern pattern = Pattern.compile(patron);
	        Matcher matcher = pattern.matcher(cadena);

	        
	        return matcher.matches();
	    }
	
	public static void main(String[] args) {
		HashMap<String,String> dic =new HashMap<String,String>();
		dic.put("gato", "cat");
		dic.put("perro", "dog");
		dic.put("pajaro", "bird");
		dic.put("ratón", "mouse");
		dic.put("perico", "parrot");
		dic.put("cabra", "goat");
		dic.put("ballena", "whale");
		dic.put("tiburón", "shark");
		dic.put("cerdo", "pig");
		dic.put("vaca", "cow");
		dic.put("sol", "sun");
		dic.put("pluma", "pen");
		dic.put("agua", "water");
		dic.put("viento", "wind");
		dic.put("luz", "light");
		dic.put("princesa", "princess");
		dic.put("taza", "cup");
		dic.put("carne", "meat");
		dic.put("lentes", "glasses");
		dic.put("vestido", "dress");
		
		Scanner scanner = new Scanner(System.in);
		boolean aux=true;
		
		do {
			System.out.println("Ingresa palabra: ");
			String palabra = scanner.nextLine();
			
			if(!validarLetras(palabra)) {
				System.out.println("La entrada debe ser una palabra");
				aux = true;
			}else {
				aux=false;
				if(dic.get(palabra)==null) {
					System.out.println("Esa palabra no se encontro en el diccionario :(");
				}else {
					System.out.println("La traducción de "+palabra+" es "+dic.get(palabra));
				}
			}
		}while(aux);
		
		
		scanner.close();
	}
}

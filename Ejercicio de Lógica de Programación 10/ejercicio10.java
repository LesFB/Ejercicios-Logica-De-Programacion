package EjerciciosLogica;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.Scanner;

public class ejercicio10 {
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
		dic.put("bolígrafo", "pen");
		dic.put("agua", "water");
		dic.put("viento", "wind");
		dic.put("luz", "light");
		dic.put("princesa", "princess");
		dic.put("taza", "cup");
		dic.put("carne", "meat");
		dic.put("lentes", "glasses");
		dic.put("vestido", "dress");
		
		String[]palabras = {"gato","perro","pajaro","ratón","perico","cabra","ballena","tiburón","cerdo","vaca","sol","pluma","agua","viento","luz","princesa","taza","carne","lentes","vestido"};
		//String[]palabrasRandom = new String [5];
		Scanner scanner = new Scanner(System.in);
		Set<Integer> numerosAleatorios = new HashSet<>();
        Random random = new Random();
        int puntos =0;
        
        while (numerosAleatorios.size() < 5) {
            int numeroAleatorio = random.nextInt(20); 
            
            numerosAleatorios.add(numeroAleatorio);
        }
        
   
        for (int numero : numerosAleatorios) {
        	System.out.println("Traduce "+palabras[numero]);
        	String aux = scanner.nextLine();
        	if (aux.equals(dic.get(palabras[numero]))) {
        		puntos++;
        	}
        }
        System.out.println("Tienes "+puntos+" palabras correctas");
        scanner.close();
	}
}

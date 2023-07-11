package EjerciciosLogica;

import java.util.*;

public class ejercicio8 {
	
	public static boolean checkPrime(int a) {
		boolean b = false;
		if (a==2 || a==3) {
			b = true;
		}
		for (int i=2;i<=(a/2);i++) {
			if (a%i == 0) {
				b= false;
				i=a;
			} else {
				b= true;
			}
		}
		 return b;
		}
	
	
	
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int[]arregloNumeros = new int[10];
		System.out.println("Ingresa números: ");
		int [] primos = new int [10],otros=new int [10];
		int contadorPrimos=0, contadorOtros=0;
		int[]newArreglo=new int [10];
				
		
		for(int i=0;i<10;i++) {
			int aux=scanner.nextInt();
			arregloNumeros[i]=aux;			
		}
		
		for(int j=0;j<10;j++) {
			if(checkPrime(arregloNumeros[j])) {
				primos[contadorPrimos]=arregloNumeros[j];
				contadorPrimos++;
			}else {
				otros[contadorOtros]=arregloNumeros[j];
				contadorOtros++;
			}
		}
		for(int k=0;k<contadorPrimos;k++) {
			newArreglo[k]=primos[k];
		}
		for(int l=0;l<contadorOtros;l++) {
			newArreglo[9-l]=otros[l];
		}
		
	
		System.out.println(Arrays.toString(newArreglo));
		scanner.close();
	}
	
}

import java.util.Iterator;
import java.util.Scanner;

public class FlujoDeDatosApp10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// Realiza una aplicación que nos pida un número de ventas a introducir, después nos 
		// pedirá tantas ventas por teclado como número de ventas se hayan indicado. Al final 
		// mostrara la suma de todas las ventas. Piensa que es lo que se repite y lo que no

		int numVentas;
		double sumaVentas = 0;
		
		System.out.println("Introduce el numero de ventas:");
		numVentas = teclado.nextInt();
		
		for (int i = 0; i <= numVentas; i++) {
			System.out.println("Introduce el beneficio de la venta " + i);
			sumaVentas+= teclado.nextDouble();
		}
		
		System.out.println("El beneficio total de todas las ventas es: " + sumaVentas);
		
		
	}

}

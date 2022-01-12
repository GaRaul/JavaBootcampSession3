import java.util.Scanner;

public class FlujoDeDatosApp12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// Escribe una aplicaci�n con un String que contenga una contrase�a cualquiera. Despu�s 
//		se te pedir� que introduzcas la contrase�a, con 3 intentos. Cuando aciertes ya no pedir� mas 
//		la contrase�a y mostrara un mensaje diciendo �Enhorabuena�. Piensa bien en la condici�n 
//		de salida (3 intentos y si acierta sale, aunque le queden intentos)
		
		String password = "java";
		int intentos = 3;
		String passIntroducida;
		boolean passCorrecta = false;
		
		do {
			System.out.println("Introduce la password");
			passIntroducida = teclado.next();
			if (passIntroducida.equals(password)) {
				passCorrecta = true;
				System.out.println("Enhorabuena");
			} else {
				intentos--;
			}
			
		} while (!passCorrecta && intentos > 0);
	}

}

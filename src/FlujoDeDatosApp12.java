import java.util.Scanner;

public class FlujoDeDatosApp12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// Escribe una aplicación con un String que contenga una contraseña cualquiera. Después 
//		se te pedirá que introduzcas la contraseña, con 3 intentos. Cuando aciertes ya no pedirá mas 
//		la contraseña y mostrara un mensaje diciendo “Enhorabuena”. Piensa bien en la condición 
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

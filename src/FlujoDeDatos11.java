import java.util.Scanner;

public class FlujoDeDatos11 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// Crea una aplicaci�n que nos pida un d�a de la semana y que nos diga si es un d�a laboral 
		// o no. Usa un switch para ello

		String dia;
		
		System.out.println("Introduce un dia de la semana");
		dia = teclado.next();
		
		switch (dia) {
		case "Lunes":
			System.out.println(dia + " es laboral");
			break;
		case "Martes":
			System.out.println(dia + " es laboral");
			break;

		case "Miercoles":
			System.out.println(dia + " es laboral");
			break;

		case "Jueves":
			System.out.println(dia + " es laboral");
			break;

		case "Viernes":
			System.out.println(dia + " es laboral");
			break;

		case "Sabado":
			System.out.println(dia + " no es laboral");
			break;

		case "Domingo":
			System.out.println(dia + " no es laboral");
			break;

		default:
			break;
		}
		
	}

}

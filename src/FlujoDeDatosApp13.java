import java.util.Scanner;

import javax.swing.JOptionPane;

public class FlujoDeDatosApp13 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// Crea una aplicación llamada CalculadoraInversa, nos pedirá 2 operandos (int)
		// y un signo
//		aritmético (String), según este último se realizara la operación correspondiente. Al final 
//		mostrara el resultado en un cuadro de dialogo.
//		Los signos aritméticos disponibles son:
//		+: suma los dos operandos.
//		-: resta los operandos.
//		*: multiplica los operandos.
//		/: divide los operandos, este debe dar un resultado con decimales (double)
//		^: 1º operando como base y 2º como exponente.
//		%: módulo, resto de la división entre operando1 y operando2

		int num1;
		int num2;
		String simbolo;
		double resultado = 0;

		System.out.println("Introduce el primer operando");
		num1 = teclado.nextInt();
		System.out.println("Introduce el segundo operando");
		num2 = teclado.nextInt();
		System.out.println("Introduce el simbolo aritmetico o escribe 'salir'");
		simbolo = teclado.next();

		switch (simbolo) {
		case "+":
			resultado = num1 + num2;
			break;
		case "-":
			resultado = num1 - num2;
			break;
		case "*":
			resultado = num1 * num2;
			break;
		case "/":
			resultado = num1 / num2;
			break;
		case "^":
			resultado = Math.pow(num1, num2);
			break;
		case "%":
			resultado = num1 % num2;
			break;
		default:
			System.out.println("Caracter incorrecto");
			break;
		}
		
		// JOptionPane.showMessageDialog(null, resultado);
		System.out.println("El resultado es: " + resultado);
		
	}

}

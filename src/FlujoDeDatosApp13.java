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
		num1 = Integer.valueOf(JOptionPane.showInputDialog("Introduce el primer operando"));
		num2 = Integer.valueOf(JOptionPane.showInputDialog("Introduce el segundo operando"));
		simbolo = JOptionPane.showInputDialog("Introduce el primer operando");

		
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
			JOptionPane.showMessageDialog(null, "Introduce un caracter valido");
			break;
		}
		
		JOptionPane.showMessageDialog(null, resultado);
		
	}

}

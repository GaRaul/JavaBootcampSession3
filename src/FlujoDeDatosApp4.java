import javax.swing.JOptionPane;
public class FlujoDeDatosApp4 {

	public static void main(String[] args) {
//		Haz una aplicaci�n que calcule el �rea de un circulo (pi*R2
//				). El radio se pedir� por teclado 
//				(recuerda pasar de String a double con Double.parseDouble). Usa la constante PI y el 
//				m�todo pow de Math.

		String radioString = JOptionPane.showInputDialog("Introduce el radio del circulo");
		double radio = Double.parseDouble(radioString);
		
		double area = Math.PI * Math.pow(radio, 2);
		
		JOptionPane.showMessageDialog(null, "El area del circulo es = " + area);

	}

}

import javax.swing.JOptionPane;

public class FlujoDeDatosApp6 {

	final static double IVA = 0.21;
	
	public static void main(String[] args) {
		// Lee un número por teclado que pida el precio de un producto (puede tener decimales) y 
		// calcule el precio final con IVA. El IVA sera una constante que sera del 21%

		String precioString = JOptionPane.showInputDialog("Introduce el precio del producto");
		double precio = Double.parseDouble(precioString);
		
		double precioFinal = precio + (precio * IVA);
		JOptionPane.showMessageDialog(null, "El precio final del producto es: " + precioFinal);
		
	}

}

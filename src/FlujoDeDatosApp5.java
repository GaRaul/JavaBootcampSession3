import javax.swing.JOptionPane;
public class FlujoDeDatosApp5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String numString = JOptionPane.showInputDialog("Introduce el numero");
		int num = Integer.parseInt(numString);
		
		if (num % 2 == 0) {
			JOptionPane.showMessageDialog(null, num + " SI es divisible entre 2");
		} else {
			JOptionPane.showMessageDialog(null, num + " NO es divisible entre 2");
		}
	}

}

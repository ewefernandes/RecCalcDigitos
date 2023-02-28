package view;
import javax.swing.JOptionPane;
import controller.Modulos;

public class Principal {
	public static void main (String [] args) {
		Modulos mod = new Modulos();
		int num=0;
		num = Integer.parseInt(JOptionPane.showInputDialog("Número: "));
		String[] v = Integer.toString(num).split("");
		int tam = v.length;
		int i=0;
		int digitos = mod.calcDigitos(v, tam, i);
		System.out.println(digitos);
	}
}

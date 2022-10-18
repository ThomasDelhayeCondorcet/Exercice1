package be.TD.Exercice1;

import javax.swing.JOptionPane;

public class Ex1 {

	public static void main(String[] args) {
		
		String nb1 = JOptionPane.showInputDialog(null, "Nombre 1");
		String nb2 = JOptionPane.showInputDialog(null, "Nombre 2");
		
		int a, b;
		try {
			a = Integer.valueOf(nb1);
			b = Integer.valueOf(nb2);
			
			switch (a>b ? 0 : 1 ) {
			case 0 -> JOptionPane.showMessageDialog(null, "Le plus grand est : " + a);
			case 1 -> JOptionPane.showMessageDialog(null, "Le plus grand est : " + b);
		}
			
		} catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, e);
		}
		
		
		
	}

}
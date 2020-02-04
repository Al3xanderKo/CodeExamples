import java.awt.Container;

import javax.swing.JFrame;

public class KruzniceTester {

	public static void main(String[] args) {
		JFrame okno = new JFrame();
		okno.setSize(800, 630);
		int sirkaOkna = okno.getWidth();
		int vyskaOkna = okno.getHeight();
		System.out.println(sirkaOkna + "  " + vyskaOkna);
		okno.setTitle("Kruznice");
		okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		okno.setVisible(true);
//		System.out.println(okno.getInsets());
		Kruznice komponenta = new Kruznice(sirkaOkna, vyskaOkna);
		okno.add(komponenta);

	}

}
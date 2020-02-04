import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

public class Kruznice extends JComponent {

	int sirkaOkna;
	int vyskaOkna;

	public Kruznice(int sirkaOkna, int vyskaOkna) {
		this.sirkaOkna = sirkaOkna;
		this.vyskaOkna = vyskaOkna;
	}

	public void paintComponent(Graphics grafickyKontext) {

		Graphics2D g2 = (Graphics2D) grafickyKontext;

		int osX = (sirkaOkna / 2) - 5; // okno 400 * 400 , polomer prvej kruznice 10px, zacentrovanie na stred -5 px
		int osY = (vyskaOkna / 2) - 5 - 15; // pomocou .getInsets som zistil velkost title boxu ktorý je 31px, pre
		// zacentrovanie po Y ose som odčital -15
		for (int i = 1; i < 13; i++) {

			Ellipse2D kruh = new Ellipse2D.Double(osX - (i * 10) / 2, osY - (i * 10) / 2, i * 10, i * 10);

			if (i % 2 == 0) {
				g2.setColor(Color.RED);
			} else {
				g2.setColor(Color.BLUE);
			}

			g2.draw(kruh);
		}

	}

}

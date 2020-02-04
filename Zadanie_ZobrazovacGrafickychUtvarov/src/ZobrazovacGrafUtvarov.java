import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

public class ZobrazovacGrafUtvarov extends JComponent {
	int typ;

	public ZobrazovacGrafUtvarov(int typ) {
		this.typ = typ;
	}

	public void paintComponent(Graphics grafickyKontext) {
		Graphics2D g2 = (Graphics2D) grafickyKontext;
		if (typ == 1) {

			for (int i = 3; i < 16; i++) {

				Rectangle stvorec = new Rectangle(0 + i * 10, 0 + i * 10, i * 10, i * 10);
				g2.draw(stvorec);
			}
		}

		if (typ == 2) {

			for (int i = 3; i < 16; i++) {

				Ellipse2D kruh = new Ellipse2D.Double(0 + i * 10, 0 + i * 10, i * 10, i * 10);
				g2.draw(kruh);
			}
		}
	}

}

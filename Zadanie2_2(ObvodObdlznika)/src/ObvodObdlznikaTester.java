import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

public class ObvodObdlznikaTester extends JComponent {

	public void paintComponent(Graphics grafickyKontext) {

		Graphics2D g2 = (Graphics2D) grafickyKontext;
		Rectangle obdlznik = new Rectangle(10, 10, 30, 40);
		double sirka = obdlznik.getWidth();
		double vyska = obdlznik.getHeight();
		double obvod = 2 * (vyska + sirka);
		System.out.println("Obvod obdlznika je :" + obvod + " px");
		g2.draw(obdlznik);
	}

}

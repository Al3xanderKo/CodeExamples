import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

public class ZobrazovacPrienikuObdlznikov extends JComponent {

	public void paintComponent(Graphics grafickyKontext) {

		Graphics2D g2 = (Graphics2D) grafickyKontext;
		Rectangle obdlznik1 = new Rectangle(10, 10, 30, 40);
		Rectangle obdlznik2 = new Rectangle(45, 10, 30, 40);

		Rectangle prienik = obdlznik1.intersection(obdlznik2);
		g2.draw(obdlznik1);
		g2.draw(obdlznik2);

		System.out.println(prienik);

		// konzola vypisala hodnoty width : -5 a height: -5 čo v tomto prípade znamená
		// že nedošlo k prieniku
	}

}
import javax.swing.JFrame;

public class NakresliPrienik {

	public static void main(String[] args) {
		JFrame okno = new JFrame();

		okno.setSize(300, 400);
		okno.setTitle("Prienik");
		okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		okno.setVisible(true);
		ZobrazovacPrienikuObdlznikov komponenta = new ZobrazovacPrienikuObdlznikov();
		okno.add(komponenta);

	}

}

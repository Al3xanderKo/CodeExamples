import javax.swing.JFrame;

public class ZobrazObdlznik {

	public static void main(String[] args) {
		JFrame okno = new JFrame();

		okno.setSize(300, 400);
		okno.setTitle("Obdlžnik");
		okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		okno.setVisible(true);
		ObvodObdlznikaTester komponenta = new ObvodObdlznikaTester();
		okno.add(komponenta);
		System.out.println(System.getProperty("java.home"));
	}

}

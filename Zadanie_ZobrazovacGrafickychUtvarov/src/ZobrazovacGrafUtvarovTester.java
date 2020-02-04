import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ZobrazovacGrafUtvarovTester {

	public static void main(String[] args) {
		JFrame okno = new JFrame();
		int vstup = Integer.parseInt(
				JOptionPane.showInputDialog("Zadaj 1 pre vykreslenie obdlznikov:\nZadaj 2 pre zobrazenie kruznic: "));
		okno.setSize(400, 400);
		okno.setTitle("Objekt");
		okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		okno.setVisible(true);
		ZobrazovacGrafUtvarov komponenta = new ZobrazovacGrafUtvarov(vstup);
		okno.add(komponenta);

	}

}
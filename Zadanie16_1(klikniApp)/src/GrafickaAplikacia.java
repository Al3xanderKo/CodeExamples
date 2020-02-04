import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GrafickaAplikacia {
	public static void main(String[] args) {
		JFrame frame = new JFrame("ActionListener pred prichodom Java8");

		JButton b = new JButton("Klikni");
		b.setBounds(140, 30, 80, 50);

		// TODO: dopln chybajuci iplementaciu handlera udalosti ActionEvent
		// pomocou anonymnej vnutornej triedy
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Klikol si na tlačítko!");
			}
		});

		frame.add(b);

		frame.setSize(400, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);
	}
}
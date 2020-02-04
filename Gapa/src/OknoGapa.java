import java.awt.*;
import javax.swing.*;

public class OknoGapa {

	private static void createWindow() {

		JFrame frame = new JFrame("Gapa GUI");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel textLabel = new JLabel("Som popisok gapy", SwingConstants.CENTER);
		textLabel.setPreferredSize(new Dimension(300, 100));
		frame.getContentPane().add(textLabel, BorderLayout.CENTER);

		// zobrazime okno
		frame.setLocationRelativeTo(null);
		frame.pack();
		frame.setVisible(true);

	}

	public static void main(String[] args) {

		createWindow();
	}
}

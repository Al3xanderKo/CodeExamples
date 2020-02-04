
//Imports are listed in full to show what's being used
//could just import javax.swing.* and java.awt.* etc..
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class GapaGui extends JFrame {
//Note: Typically the main method will be in a
//separate class. As this is a simple one class
//example it's all in the one class.
	public static void main(String[] args) {
		new GapaGui();
	}

	public GapaGui() {
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame guiFrame = new JFrame();
		guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		guiFrame.setTitle("Gapa v11-11-19");
		guiFrame.setSize(800, 400);
		guiFrame.setLocationRelativeTo(null);
//Options for the JComboBox
		String[] payOptions = { "operationPay", "operationReversal", "operationRevLast" };
//Options for the JList
		String[] termOptions = { "X1AKOGAPA1", "X1AKOGAPA2", "X1AKOGAPA3", "X1AKOGAPA4" };
//The first JPanel contains a JLabel and JCombobox

// definujem lavy panel 

		JPanel lavyPanel = new JPanel();
		JLabel payLbl = new JLabel("Zvol typ platby :", SwingConstants.LEFT);
		JComboBox payBox = new JComboBox(payOptions);
		lavyPanel.add(payLbl);
		lavyPanel.add(payBox);

//Create the second JPanel. Add a JLabel and JList and
//make use the JPanel is not visible.

		JLabel termLbl = new JLabel("Vyber si termId", SwingConstants.LEFT);
		JComboBox termBox = new JComboBox(termOptions);
		lavyPanel.add(termLbl);
		lavyPanel.add(termBox);
		lavyPanel.setPreferredSize(new Dimension(200, 200));
		lavyPanel.setVisible(true);

//vytvaram text output areafield
		Border border = BorderFactory.createLineBorder(Color.BLACK);
		JPanel pravyPanel = new JPanel();
		// prve riadky druhe kolonky
		JTextArea textZona = new JTextArea(40, 83);

		textZona.setLineWrap(true);
		textZona.setWrapStyleWord(true);
		Font f = new Font(Font.MONOSPACED, Font.PLAIN, 11);
		textZona.setFont(f);

		pravyPanel.add(textZona, BorderLayout.EAST);
		pravyPanel.setPreferredSize(new Dimension(588, 300));
		pravyPanel.setVisible(true);
		pravyPanel.setBorder(border);
		lavyPanel.setBorder(border);

		JButton posliPlatbu = new JButton("Pay!");
		lavyPanel.add(posliPlatbu);
		JButton zrusPlatbu = new JButton("Cancel!");
		lavyPanel.add(zrusPlatbu);
//The ActionListener class is used to handle the
//event that happens when the user clicks the button.
//As there is not a lot that needs to happen we can
//define an anonymous inner class to make the code simpler.
		posliPlatbu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {

				Date date = new Date();
				SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
				JsonKontainer jsonKontainer = new JsonKontainer();
				String zvolenyTerminal = termBox.getSelectedItem().toString();

				// allokacia
				SendUrlJson alokuj = new SendUrlJson(jsonKontainer.allocate_url,
						jsonKontainer.getAllocateJson(zvolenyTerminal));
				alokuj.posliJsonToUrl();
				textZona.append(formatter.format(date) + ":ALLOCATE Návratový kód: " + alokuj.resultCode
						+ "\n Popis kódu: " + alokuj.codeDescribtion + " Context ID: " + alokuj.contextId);

				//

				SendUrlJson pay = new SendUrlJson(jsonKontainer.paystart_url,
						jsonKontainer.getPayStartJson(alokuj.contextId));
				pay.posliJsonToUrl();
				textZona.append(formatter.format(date) + ": PAY Návratový kód: " + pay.resultCode + "\n Popis kódu: "
						+ pay.codeDescribtion + " Context ID: " + pay.contextId);

				// progress sa bude opakovat 10x s 2s timeoutom

				SendUrlJson progress = new SendUrlJson(jsonKontainer.progress_url,
						jsonKontainer.getReleaseJson(alokuj.contextId));
				for (int i = 0; i < 30; i++) {
					progress.posliJsonToUrl();
					// progress
					textZona.append(formatter.format(date) + ":PROGRES návratový kód: " + progress.resultCode
							+ "\n Popis kódu: " + progress.codeDescribtion + " Context ID: " + progress.contextId);
					if (alokuj.opCode == "TICKET") {
						break;
					}
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				if (alokuj.opCode == "TICKET") {
					SendUrlJson ticket = new SendUrlJson(jsonKontainer.ticket_url,
							jsonKontainer.getReleaseJson(alokuj.contextId));
					textZona.append(formatter.format(date) + ":TICKET návratový kód: " + progress.resultCode
							+ "\n Popis kódu: " + progress.codeDescribtion + " Context ID: " + progress.contextId);

				}

				zrusPlatbu.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent event) {

						Date date = new Date();
						SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

						// allokacia
						SendUrlJson release = new SendUrlJson(jsonKontainer.release_url,
								jsonKontainer.getReleaseJson(alokuj.contextId));
						release.posliJsonToUrl();
						textZona.append(formatter.format(date) + ":Release návratový kód: " + release.resultCode
								+ "\n Popis kódu: " + release.codeDescribtion + " Context ID: " + release.contextId);

					}
				});

			}
		});

//The JFrame uses the BorderLayout layout manager.
//Put the two JPanels and JButton in different areas.

		guiFrame.add(lavyPanel, BorderLayout.WEST);

		guiFrame.add(pravyPanel, BorderLayout.EAST);

//make sure the JFrame is visible

		guiFrame.setVisible(true);
	}
}

/**
   Program precita obsah vsetkych suborov a nasledne tento obsah 
   zapise do vysledneho suboru.
*/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class SpajacSuborov {
	public static void main(String[] args) throws IOException {

		if (args.length < 2) {
			System.out.println("SpajacSuborov.java subor1.txt subor2.txt subor3.txt vysledny_subor.txt");
			return;
		}

		String zlucovac = "";

		for (int i = 1; i < args.length; i++) {

			String nazovSuboru = args[i - 1];
			BufferedReader br = new BufferedReader(new FileReader(nazovSuboru));
			String nacitajSubor = br.readLine();
			zlucovac += "<Kapitola" + i + ">";
			while (nacitajSubor != null) { // čitame až kym nedojdeme k poslednemu riadku

				zlucovac += nacitajSubor + " ";
				nacitajSubor = br.readLine();

			}
			zlucovac += "</Kapitola" + i + ">";
			br.close();
		}
		PrintWriter vyslednySubor = new PrintWriter(args[args.length - 1]);// posledny argument bude vysledny subor
		vyslednySubor.println(zlucovac);
		vyslednySubor.flush();
		vyslednySubor.close();

	}
}
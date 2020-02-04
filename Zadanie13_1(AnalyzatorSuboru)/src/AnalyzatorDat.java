import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

// D:\Eclipse\Alexworkspace\Zadanie12_1(AnalyzatorSuboru)\src\textak.txt
public class AnalyzatorDat {
	public static void main(String[] args) throws IOException {
		System.out.println("Nazov suboru: ");
		Scanner vstup = new Scanner(System.in);
		String nazovSuboru = vstup.nextLine();
		Statistiky statistiky = new Statistiky();
		FileReader citacSuboru = new FileReader(nazovSuboru);
		Scanner vstupneData = new Scanner(citacSuboru);
		statistiky.citaj(vstupneData);

		System.out.println("Pocet znakov: " + statistiky.getPocetZnakov());
		System.out.println("Pocet slov: " + statistiky.getPocetSlov());
		System.out.println("Pocet riadkov: " + statistiky.getPocetRiadkov());

		vstupneData.close();
		vstup.close();
	}
}

/**
 * Trieda sluzi na vytvaranie statistik na zaklade obsahu suboru.
 */

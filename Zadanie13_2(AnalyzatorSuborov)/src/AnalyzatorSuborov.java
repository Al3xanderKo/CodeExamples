import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

//D:\Eclipse\Alexworkspace\Zadanie12_1(AnalyzatorSuboru)\src\textak.txt
public class AnalyzatorSuborov {
	public static void main(String[] args) {
		System.out.println("Nazov suboru: ");
		Scanner vstup = new Scanner(System.in);
		StatistikySuboru statistiky = new StatistikySuboru();

		boolean nacitavanieUkoncene = false;

		while (!nacitavanieUkoncene) {

			String nazovSuboru = vstup.nextLine();
			FileReader citacSuboru;
			try {
				citacSuboru = new FileReader(nazovSuboru);
				Scanner vstupneData = new Scanner(citacSuboru);
				statistiky.citaj(vstupneData);
			} catch (FileNotFoundException e) {
				System.out.println("Cesta nieje validna alebo subor neexistuje !");
				nacitavanieUkoncene = true;

			}

		}
		System.out.println("Pocet znakov: " + statistiky.getPocetZnakov());
		System.out.println("Pocet slov: " + statistiky.getPocetSlov());
		System.out.println("Pocet riadkov: " + statistiky.getPocetRiadkov());

		vstup.close();
	}
}

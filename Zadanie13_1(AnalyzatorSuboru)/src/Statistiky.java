import java.util.Scanner;

public class Statistiky {
	// TODO: sem pride vas kod
	int pocetZnakov;
	int pocetSlov;
	int pocetRiadkov;

	/**
	 * Vytvara objekt statistiky.
	 */
	public Statistiky() {

	}

	/**
	 * Sprocesuje obsah suboru a nasledne vypocita potrebne statistiky (pocet znkov,
	 * pocet slov a pocet riadkov).
	 * 
	 * @param vstupneData vstupne data na sprocesovanie
	 */
	public void citaj(Scanner vstupneData) {

		int cRiadku = 1;
		while (vstupneData.hasNextLine()) {
			String riadok = vstupneData.nextLine();
			System.out.println("Riadok" + cRiadku + ": " + riadok);
			cRiadku++;
			pocetRiadkov++;
			String[] zoznamSlov = riadok.split("\\s+"); // s+ v jave reprezentuje medzeru
			pocetSlov += zoznamSlov.length;

			int dlzkaRiadku = riadok.length();
			for (int i = 0; i < dlzkaRiadku; i++) {
				pocetZnakov++;
			}

		}

	}

	/**
	 * Vrati pocet znakov v subore.
	 * 
	 * @return pocet znakov v subore
	 */
	public int getPocetZnakov() {
		return pocetZnakov; // 17 s medzerami , 14bez
							// 39 s medzerami , 35bez
							// 19 s medzerami , 17bez
							// D:\Eclipse\Alexworkspace\Zadanie12_1(AnalyzatorSuboru)\src\textak.txt
	}

	/**
	 * Vrati pocet slov v subore.
	 * 
	 * @return pocet slov v subore
	 */
	public int getPocetSlov() {
		return pocetSlov;
		// TODO: sem pride vas kod
	}

	/**
	 * Vrati pocet riadkov v subore.
	 * 
	 * @return pocet riadkov v subore
	 */
	public int getPocetRiadkov() {
		return pocetRiadkov;

	}
}
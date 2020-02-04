/**
 * Trieda generuje vsetky faktory (delitele) daneho cisla.
 */
public class FaktorGenerator {
	/**
	 * Vytvara objekt triedy FaktorGenerator, ktory pouzijeme na ziskanie faktorov
	 * (delitelov) daneho cisla
	 * 
	 * @param cislo z ktorého chceme zistit počet delitelov
	 */

	int cislo;
	boolean existujeFaktor;
	int faktor;
	int zvysCislo = 0;

	public FaktorGenerator(int cislo) {
		this.cislo = cislo;
	}

	// TODO: doplnit dokumentacny komentar
	public boolean existujeDalsiFaktor() {

		zvysCislo++; // počitadlo ktoré zvyšuje počiatočnú hodnotu "i" v cykle for, každým použitím
						// metody existujeDalsiFaktor.
		for (int i = zvysCislo; i <= cislo; i++) {

			if (cislo % i == 0) {
				existujeFaktor = true;
				faktor = i;
				break;
			} else {
				zvysCislo++;
			}
		}

		if (zvysCislo >= cislo) {
			existujeFaktor = false;
			System.out.println("Posledný delitel alebo maximálny počet delitelov !");
		}
		System.out.print("Existuje daľší deliteľ?: ");
		return existujeFaktor;
	}

	public int dalsiFaktor() {
		System.out.print("Faktor: ");
		return faktor;

	}
}
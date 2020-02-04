
import java.util.Arrays;
import java.util.Scanner;

/**
 * Tabulka ktora sluzi na vyhladavanie v telefonnom zozname.
 */
public class VyhladavaciaTabulka {
	BinarySearchTree b = new BinarySearchTree();
	int pocetRiadkov;
	String[] zaznamy;
	String obsahVstupu = "";
	Osoba osoba;

	/**
	 * Vytvara novy objekt vyhladavacej tabulky.
	 */
	public VyhladavaciaTabulka() {
		// TODO: dopln chybajucu implementaciu
	}

	/**
	 * Cita dvojice kluc/hodnota.
	 * 
	 * @param scanner
	 */
	public void nacitaj(Scanner scanner) {

		while (scanner.hasNextLine()) {

			String riadok = scanner.nextLine();
			pocetRiadkov++;
			obsahVstupu += riadok + "\n";

		}
		// vytvorim objekt osoba , kazdy druhy riadok bude tel cislo osoby,
		String[] zaznamy = obsahVstupu.split("\\r?\\n"); // line separator telzoznam.txt

		for (int i = 0, g = 1; i <= zaznamy.length && g <= zaznamy.length; i += 2, g += 2) {

			Osoba osoba = new Osoba(zaznamy[i], zaznamy[g]);

			System.out.println(osoba.toString());
			b.put(zaznamy[i], osoba); // ak odkomentujem tento riadok dostanem null pointer exeption
			// chcem pridať záznam do binnary tree BinarySearchTree b = new
			// BinarySearchTree();
		}

	}

	/**
	 * Vyhlada zaznam v tabulke.
	 * 
	 * @param meno kluc podla ktoreho hladame
	 * @return hodnotu prisluchajucu k danemu klucu, ak sa hodnota nenajde vrati
	 *         hodnotu null
	 */
	public String vyhladajMeno(String meno) {
		// Osoba nalez = b.get(meno);
		// return nalez.getTelCislo();
		return "";

	}

	/**
	 * Vyhladava zaznam v tabulke.
	 * 
	 * @param telefon hodnota podla ktorej hladame
	 * @return kluc prisluchajuci k danej hodnote, alebo hodnotu null ak sa dany
	 *         kluc nenasiel
	 */
	public String vyhladajCislo(String telefon) {
		// TODO: dopln chybajucu implementaciu
		return null;
	}
}
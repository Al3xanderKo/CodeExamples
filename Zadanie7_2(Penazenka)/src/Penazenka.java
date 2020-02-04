import java.util.ArrayList;

/**
 * Penazenka pozostava z kolekcie minci.
 */
public class Penazenka {
	String nazovMince = "";
	private ArrayList<String> mince;

	/**
	 * Vytvara prazdnu penazenku.
	 */
	public Penazenka() {
		mince = new ArrayList<String>();
	}

	/**
	 * Prida mincu do penazenky.
	 * 
	 * @param nazovMince nazov mince
	 */
	public void pridajMincu(String nazovMince) {
		this.nazovMince = nazovMince;
		mince.add(nazovMince);

	}

	/**
	 * Vrati retazcovu reprezentaciu stavu penazenky.
	 * 
	 * @return retazcovu reprezentaciu stavu penazenky vo formate:
	 *         "Penazenka[nazovMince1, nazovMince2, nazovMince3, ...]"
	 */
	public String toString()

	{

		return "Nase hodnoty: Penazenka" + mince.toString();

	}

}
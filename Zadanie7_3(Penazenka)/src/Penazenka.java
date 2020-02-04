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
		// TODO: vasa implementacia pride sem
	}

	/**
	 * Vrati retazcovu reprezentaciu stavu penazenky.
	 * 
	 * @return retazcovu reprezentaciu stavu penazenky vo formate:
	 *         "Penazenka[nazovMince1, nazovMince2, nazovMince3, ...]"
	 */
	public String toString()

	{
//		System.out.print("Nase hodnoty: Penazenka");
		return mince.toString();

	}

	public boolean jeObsahovoTotoznaS(Penazenka inaPenazenka) {

		// TODO Auto-generated method stub
		if (mince.toString().length() == inaPenazenka.toString().length()) {
			System.out.println(mince + " porovnávam s: " + inaPenazenka);
			return true;
		}
		System.out.println(mince + " porovnávam s: " + inaPenazenka);
		return false;
	}

}
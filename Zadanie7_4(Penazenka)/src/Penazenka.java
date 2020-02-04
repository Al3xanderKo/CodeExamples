import java.util.ArrayList;
import java.util.Collections;

/**
 * Penazenka pozostava z kolekcie minci.
 */
public class Penazenka {
	String nazovMince = "";
	private ArrayList<String> mince;
//	int velkostPola;
//	boolean x;

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

	public String toString()

	{

		return mince.toString();

	}

//  zakomentovany prvy spôsob
//	public boolean jeObsahovoTotoznaS(Penazenka penazenka1, Penazenka penazenka2) {
//
//		int velkostPola1 = penazenka1.mince.size();
//		int velkostPola2 = penazenka2.mince.size();
//		// kontrola premennych velkostPola
//		// System.out.println(velkostPola1);
//		// System.out.println(velkostPola2);
//
//		// Zoradime si zoznam mincí
//		Collections.sort(penazenka1.mince);
//		Collections.sort(penazenka2.mince);
//
//		// budeme porovnávať jednotlivé indexy len ak sa velkosti poli budu rovnať
//		if (velkostPola1 == velkostPola2) {
//			for (int j = 0; j < velkostPola1; j++) {
//				if (penazenka1.mince.get(j) == penazenka2.mince.get(j)) {
//					System.out.println(
//							penazenka1.mince.get(j) + " porovnavam s " + penazenka2.mince.get(j) + " na indexe " + j);
//					System.out.println("hodnoty su zhodne");
//					x = true;
//				} else {
//					System.out.println(
//							penazenka1.mince.get(j) + " porovnavam s " + penazenka2.mince.get(j) + " na indexe " + j);
//					System.out.println("hodnoty niesu zhodne");
//					x = false;
//					break;
//				}
//
//			}
//
//		}
//		return x;
//	}
	public boolean jeObsahovoTotoznaS(Penazenka dalsiaPenazenka) {
		return mince.containsAll(dalsiaPenazenka.mince) && dalsiaPenazenka.mince.containsAll(mince);
	}
}

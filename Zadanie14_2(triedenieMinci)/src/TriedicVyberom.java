
/**
 * trieda je zodpovedna za triedenie cisiel ulozenych v datovej strukture pole
 */

public class TriedicVyberom {

	private Minca[] mince;

	public TriedicVyberom(Minca[] nezotriedeneMince) {
		this.mince = nezotriedeneMince;
	}

	/**
	 * triedi pole dat
	 */
	public void zotried() {
		for (int i = 0; i < mince.length; i++) {
			int minIndex = najdiIndexNajmensiehoPrvkuOdIndexu(i); // vyhlada najmensi i-ty prvok na nezotriedenej casti
																	// pola
			vymenPrvky(minIndex, i); // vymeni prvky na danych indexoch
		}
	}

	/**
	 * vyhlada a vrati index najmensieho prvku na nezotriedenej casti pola od daneho
	 * indexu
	 * 
	 * @param index - pociatocna pozicia vyhladavania
	 * @return index najmensieho prvku
	 */
	private int najdiIndexNajmensiehoPrvkuOdIndexu(int index) {
		int indexMinPrvku = index;

		for (int i = index + 1; i < mince.length; i++) {
			if (mince[i].getHodnota() < mince[indexMinPrvku].getHodnota()) { // toto znamnienko riesi < od najmensieho >
																				// od najvecsieho
				indexMinPrvku = i;
			}
		}

		return indexMinPrvku;
	}

	/**
	 * vymeni prvky na indexoch i a j
	 * 
	 * @param i index prveho prvku na vymenu
	 * @param j index druheho prvku na vymenu
	 */
	private void vymenPrvky(int i, int j) {
		// vymienac hodnot
		double zalohaHodnota = mince[i].getHodnota();
		mince[i].setHodnota(mince[j].getHodnota());
		mince[j].setHodnota(zalohaHodnota);
		// vymienac nazvov
		String zalohaNazov = mince[i].getNazov();
		mince[i].setNazov(mince[j].getNazov());
		mince[j].setNazov(zalohaNazov);

	}

}

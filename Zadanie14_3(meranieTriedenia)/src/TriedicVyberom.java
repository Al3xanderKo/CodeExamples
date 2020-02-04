
/**
 * trieda je zodpovedna za triedenie cisiel ulozenych v datovej strukture pole
 */

public class TriedicVyberom {

	private int[] data;

	public TriedicVyberom(int[] nezotriedenePole) {
		this.data = nezotriedenePole;
	}

	/**
	 * triedi pole dat
	 */
	public void zotried() {
		for (int i = 0; i < data.length; i++) {
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

		for (int i = index + 1; i < data.length; i++) {
			if (data[i] < data[indexMinPrvku]) { // od najvecsieho
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
		int zaloha = data[i];
		data[i] = data[j];
		data[j] = zaloha;

	}

}

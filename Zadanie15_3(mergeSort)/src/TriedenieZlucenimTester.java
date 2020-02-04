import java.util.Arrays;

/**
 * Program testuje nerekurzivny algoritmus zlucenim (merge sort).
 */
public class TriedenieZlucenimTester {
	public static void main(String[] args) {
		int[] cisla = new int[16];
		for (int i = 0; i < 16; i++) {
			cisla[i] = 100 - (8 - i) * (8 - i);
		}
		TriedicZlucenim triedic = new TriedicZlucenim(cisla);
		triedic.zotried();
		System.out.println("Zotriedene hodnoty:" + Arrays.toString(cisla));
		System.out.println("Ocakavane hodnoty: [36, 51, 51, 64, 64, 75, 75, 84, 84, 91, 91, 96, 96, 99, 99, 100]");
	}
}
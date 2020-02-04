import java.util.Arrays;

/**
 * Program testuje algoritmus triedenia vyberom.
 */
public class TriedenieVyberomTester {
	public static void main(String[] args) {
		int[] data = new int[10];
		for (int i = 0; i < 10; i++) {
			data[i] = 100 - (i - 5) * (i - 5);
		}

		TriedicVyberom triedic = new TriedicVyberom(data);
		triedic.zotried();

		System.out.println("Zotriedene pole:    " + Arrays.toString(data));
		System.out.println("Ocakavany vysledok: [100, 99, 99, 96, 96, 91, 91, 84, 84, 75]");
	}
}
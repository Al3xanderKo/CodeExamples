import java.util.Arrays;

public class TriedenieZlucenimTester {

	public static void main(String[] args) {
		String[] values = { "Programovanie", "v", "Jave", "nas", "bavi" };
		TriedenieZlucenim.triedenieZlucenim(values, 0, values.length - 1);
		System.out.println("Zoradene: " + Arrays.toString(values));
		System.out.println("Ocakavany vystup: [Jave, Programovanie, bavi, nas, v]");
	}
}


import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class shuffleArray {

	private static Random generator = new Random();

	public static int[] zamiesaj(int[] pole) {

		// cyklus pre zamiešanie pola
		for (int i = 0; i < pole.length; i++) {
			int randomIndexToSwap = generator.nextInt(pole.length);
			int temp = pole[randomIndexToSwap];
			pole[randomIndexToSwap] = pole[i];
			pole[i] = temp;
		}
		return pole;
	}

}

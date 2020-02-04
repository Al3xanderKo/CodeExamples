
import java.util.Random;

public class PoleUtil {

	private static Random generator = new Random();

	public static int[] vygenerujPoleCisel(int velkost, int rozsah) {

		int[] pole = new int[velkost];

		for (int i = 0; i < pole.length; i++) {
			pole[i] = generator.nextInt(rozsah) + 1;
		}

		return pole;
	}

}


import java.util.Random;

public class PoleUtil {

	private static Random generator = new Random();

	public static Integer[] vygenerujPoleCisel(int velkost, int rozsah) {

		Integer[] pole = new Integer[velkost];

		for (int i = 0; i < pole.length; i++) {
			pole[i] = generator.nextInt(rozsah) + 1;
		}

		return pole;
	}

}

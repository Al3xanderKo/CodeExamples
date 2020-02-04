/**
 * Program testuje triedu Pokladna.
 */
public class PokladnaTester {

	public static void main(String[] args) {
		final double HODNOTA_1_EURA = 1.0;
		final double HODNOTA_50_CENTOV = 0.50;
		final double HODNOTA_20_CENTOV = 0.20;
		final double HODNOTA_10_CENTOV = 0.10;
		final double HODNOTA_5_CENTOV = 0.05;
		final double HODNOTA_2_CENTOV = 0.02;
		final double HODNOTA_1_CENTU = 0.01;

		Pokladna pokladna = new Pokladna();
		pokladna.nacitajTovar(2.59);
		pokladna.nacitajTovar(6.99);

		// TOVAR ZA 9.58
		Minca[] typyMinci = new Minca[] { new Minca(HODNOTA_1_EURA, "euro"),
				new Minca(HODNOTA_50_CENTOV, "padesiatcentov"), new Minca(HODNOTA_20_CENTOV, "dvadsatcentov"),
				new Minca(HODNOTA_10_CENTOV, "desatcentov"), new Minca(HODNOTA_5_CENTOV, "patcentov"),
				new Minca(HODNOTA_2_CENTOV, "dvacenty"), new Minca(HODNOTA_1_CENTU, "jedencent")

		};
//        System.out.println(typyMinci[0].getHodnotaMince());
		pokladna.prijmiHotovost(9, typyMinci[0]);
		pokladna.prijmiHotovost(1, typyMinci[1]);
		pokladna.prijmiHotovost(1, typyMinci[2]);

		// PRIJALI SME 9.7 , výdavok 0.12 , 1x10CENT 1X2CENT
		int[] ocakavanyVydavok = { 0, 0, 0, 1, 0, 1, 0 };
		pokladna.getVydavok();
		for (int i = 0; i < typyMinci.length; i++) {
			Minca m = typyMinci[i];
			int vydavok = pokladna.dajVydavok(m);
			System.out.println(m.getNazov() + ": " + vydavok);
			System.out.println("Ocakavana hodnota: " + ocakavanyVydavok[i]);
		}
	}
}
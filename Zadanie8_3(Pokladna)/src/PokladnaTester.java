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
		final double HODNOTA_500_EUROVKY = 500.0;
		final double HODNOTA_200_EUROVKY = 200.0;
		final double HODNOTA_100_EUROVKY = 100.0;
		final double HODNOTA_50_EUROVKY = 50.0;
		final double HODNOTA_20_EUROVKY = 20.0;
		final double HODNOTA_10_EUROVKY = 10.0;
		final double HODNOTA_5_EUROVKY = 5.00;

		Pokladna pokladna = new Pokladna();
		pokladna.nacitajTovar(2.59);
		pokladna.nacitajTovar(6.99);
		pokladna.nacitajTovar(100);
		// tovar za 109.58
		Eur[] typyEur = new Eur[] { new Eur(HODNOTA_500_EUROVKY, "patstoeur"),
				new Eur(HODNOTA_200_EUROVKY, "dvestoeur"), new Eur(HODNOTA_100_EUROVKY, "stoeur"),
				new Eur(HODNOTA_50_EUROVKY, "patdesiateur"), new Eur(HODNOTA_20_EUROVKY, "dvadsateur"),
				new Eur(HODNOTA_10_EUROVKY, "desateur"), new Eur(HODNOTA_5_EUROVKY, "pateur"),
				new Eur(HODNOTA_1_EURA, "euro"), new Eur(HODNOTA_50_CENTOV, "patdesiatcentov"),
				new Eur(HODNOTA_20_CENTOV, "dvadsatcentov"), new Eur(HODNOTA_10_CENTOV, "desatcentov"),
				new Eur(HODNOTA_5_CENTOV, "patcentov"), new Eur(HODNOTA_2_CENTOV, "dvacenty"),
				new Eur(HODNOTA_1_CENTU, "jedencent")

		};

		pokladna.prijmiHotovost(1, typyEur[0]);
		pokladna.prijmiHotovost(1, typyEur[1]);
		pokladna.prijmiHotovost(9, typyEur[7]);
		pokladna.prijmiHotovost(1, typyEur[8]);
		pokladna.prijmiHotovost(1, typyEur[9]);
		// prijali sme 709.70
		int[] ocakavanyVydavok = { 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0 };
		// vydavok 600.12
		pokladna.getVydavok();
		for (int i = 0; i < typyEur.length; i++) {
			Eur m = typyEur[i];
			int vydavok = pokladna.dajVydavok(m);
			System.out.println(m.getNazovEur() + ": " + vydavok);
			System.out.println("Ocakavana hodnota: " + ocakavanyVydavok[i]);
		}
	}
}
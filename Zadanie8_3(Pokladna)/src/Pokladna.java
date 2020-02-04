
public class Pokladna {
	private double celkovaSumaNaskenovanychTovarov;
	private double sumaPenaziPrijataOdZakaznika;
	double vydavok = 0;

	public void nacitajTovar(double cenaTovaru) {
		celkovaSumaNaskenovanychTovarov += cenaTovaru;
	}

	public void prijmiHotovost(int pocetEur, Eur eura) {
		double hodnotaEura = eura.getHodnotaEur();

		sumaPenaziPrijataOdZakaznika += pocetEur * hodnotaEura;

	}

	public double getVydavok() {

		vydavok = sumaPenaziPrijataOdZakaznika - celkovaSumaNaskenovanychTovarov;
		return vydavok;
	}

	public int dajVydavok(Eur m) {

		double hodnotaEur = m.getHodnotaEur();
		vydavok = Math.round(vydavok * 100.0) / 100.0; // chcem aby cisla boli zaokrulene na 2 desatinne miesta za
														// ciarkou.

		if (vydavok >= hodnotaEur) {
			vydavok = vydavok - hodnotaEur;
			return 1;
		}

		else {
			return 0;
		}

	}

}

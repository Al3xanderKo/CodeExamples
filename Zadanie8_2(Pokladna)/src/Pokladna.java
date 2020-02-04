
public class Pokladna {
	private double celkovaSumaNaskenovanychTovarov;
	private double sumaPenaziPrijataOdZakaznika;
	double vydavok = 0;

	public void nacitajTovar(double cenaTovaru) {
		celkovaSumaNaskenovanychTovarov += cenaTovaru;
	}

	public void prijmiHotovost(int pocetMinci, Minca minca) {
		double hodnotaMince = minca.getHodnotaMince();
		sumaPenaziPrijataOdZakaznika += pocetMinci * hodnotaMince;

	}

	public double getVydavok() {

		vydavok = sumaPenaziPrijataOdZakaznika - celkovaSumaNaskenovanychTovarov;
		return vydavok;
	}

	public int dajVydavok(Minca m) {

		double hodnotaMince = m.getHodnotaMince();
		vydavok = Math.round(vydavok * 100.0) / 100.0; // chcem aby boli len 2 desatinne cisla za ciarkou

		if (vydavok >= hodnotaMince) {
			vydavok = vydavok - hodnotaMince;
			return 1;
		}

		else {
			return 0;
		}

	}

}

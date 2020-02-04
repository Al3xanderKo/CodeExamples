
public class Pokladna {
	private double celkovaSumaNaskenovanychTovarov;
	private double sumaPenaziPrijataOdZakaznika;

	public void nacitajTovar(double cenaTovaru) {
		celkovaSumaNaskenovanychTovarov += cenaTovaru;
	}

	public void prijmiHotovost(int pocetMinci, Minca minca) {
		double hodnotaMince = minca.getHodnotaMince();
		sumaPenaziPrijataOdZakaznika += pocetMinci * hodnotaMince;

	}

	public double datVydavok() {
		double vydavok = sumaPenaziPrijataOdZakaznika - celkovaSumaNaskenovanychTovarov;
		return vydavok;
	}

}

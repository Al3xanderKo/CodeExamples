
public class Pokladna {
	private double celkovaSumaNaskenovanychTovarov;
	private double sumaPenaziPrijataOdZakaznika;
	private int pocetNaskenovanychTovarov;
	// konštanty pre mince
	final double HODNOTA_1_EUROVEJ_MINCE = 1.0;
	final double HODNOTA_50_CENTOVIEK = 0.5;
	final double HODNOTA_20_CENTOVIEK = 0.20;
	final double HODNOTA_10_CENTOVIEK = 0.10;
	final double HODNOTA_5_CENTOVIEK = 0.05;
	final double HODNOTA_2_CENTOVIEK = 0.02;
	final double HODNOTA_1_CENTOVIEK = 0.01;
	// konštatny pre potraviny
	final double MLIEKO = 2;
	final double CHLIEB = 1.65;
	final double ROZKY = 0.05;
	final double TASKA = 0.08;

	public Pokladna() {
		celkovaSumaNaskenovanychTovarov = 0;
		pocetNaskenovanychTovarov = 0;
		sumaPenaziPrijataOdZakaznika = 0;
	}

	public void naskenujTovar(double cenaTovaru) {
		celkovaSumaNaskenovanychTovarov += cenaTovaru;
		/**
		 * Vytvoril som si metody pre jednoduchšie naskenovanie množstva potravin
		 */
	}

	public void naskenujMlieko(double PMLIEKO) {
		celkovaSumaNaskenovanychTovarov += MLIEKO * PMLIEKO;
		pocetNaskenovanychTovarov += PMLIEKO;
	}

	public void naskenujChlieb(double PCHLIEB) {
		celkovaSumaNaskenovanychTovarov += CHLIEB * PCHLIEB;
		pocetNaskenovanychTovarov += PCHLIEB;

	}

	public void naskenujRozky(double PROZKY) {
		celkovaSumaNaskenovanychTovarov += ROZKY * PROZKY;
		pocetNaskenovanychTovarov += PROZKY;

	}

	public void naskenujTasku(double PTASKA) {
		celkovaSumaNaskenovanychTovarov += TASKA * PTASKA;
		pocetNaskenovanychTovarov += PTASKA;

	}

	/**
	 * Jedna metoda obsahujúca všetky mince
	 * 
	 * @param pocetKusov
	 */
	public void prijatHotovost(int pocetEur, int pocetPatdesiatcentoviek, int pocetDvadsatcentoviek,
			int pocetDesatcentoviek, int pocetPatcentoviek, int pocetDvojcentoviek, int pocetCentoviek) {
		sumaPenaziPrijataOdZakaznika += pocetEur * HODNOTA_1_EUROVEJ_MINCE;
		sumaPenaziPrijataOdZakaznika += pocetPatdesiatcentoviek * HODNOTA_50_CENTOVIEK;
		sumaPenaziPrijataOdZakaznika += pocetDvadsatcentoviek * HODNOTA_20_CENTOVIEK;
		sumaPenaziPrijataOdZakaznika += pocetDesatcentoviek * HODNOTA_10_CENTOVIEK;
		sumaPenaziPrijataOdZakaznika += pocetPatcentoviek * HODNOTA_5_CENTOVIEK;
		sumaPenaziPrijataOdZakaznika += pocetDvojcentoviek * HODNOTA_2_CENTOVIEK;
		sumaPenaziPrijataOdZakaznika += pocetCentoviek * HODNOTA_1_CENTOVIEK;
	}

	/**
	 * vytvorili sme si 7 metód pre príjem 7 rôznych mincí s parametrom poetKusov
	 * pomocou ktorého nastavujeme napr počet 50centových mincí
	 * 
	 * @param pocetKusov
	 */
	public void prijmyEura(int pocetEur) {
		sumaPenaziPrijataOdZakaznika += pocetEur * HODNOTA_1_EUROVEJ_MINCE;
	}

	public void prijmy50Centovky(int pocetPatdesiatcentoviek) {
		sumaPenaziPrijataOdZakaznika += pocetPatdesiatcentoviek * HODNOTA_50_CENTOVIEK;
	}

	public void prijmy20Centovky(int pocetDvadsatcentoviek) {
		sumaPenaziPrijataOdZakaznika += pocetDvadsatcentoviek * HODNOTA_20_CENTOVIEK;
	}

	public void prijmy10Centovky(int pocetDesatcentoviek) {
		sumaPenaziPrijataOdZakaznika += pocetDesatcentoviek * HODNOTA_10_CENTOVIEK;
	}

	public void prijmy5Centovky(int pocetPatcentoviek) {
		sumaPenaziPrijataOdZakaznika += pocetPatcentoviek * HODNOTA_5_CENTOVIEK;
	}

	public void prijmy2Centovky(int pocetDvojcentoviek) {
		sumaPenaziPrijataOdZakaznika += pocetDvojcentoviek * HODNOTA_2_CENTOVIEK;
	}

	public void prijmyCentovky(int pocetCentoviek) {
		sumaPenaziPrijataOdZakaznika += pocetCentoviek * HODNOTA_1_CENTOVIEK;
	}

	public double vydajVydavok() {
		double vydavok = sumaPenaziPrijataOdZakaznika - celkovaSumaNaskenovanychTovarov;
		return vydavok;

	}

	/**
	 * Metoda ukonciNakup vynuluje inštančné premenné na pôvodnú hodnotu.
	 */
	public void ukonciNakup() {
		celkovaSumaNaskenovanychTovarov = 0;
		sumaPenaziPrijataOdZakaznika = 0;
		pocetNaskenovanychTovarov = 0;
	}

	public double getCelkovaSumaNaskenovanychTovarov() {
		return celkovaSumaNaskenovanychTovarov;
	}

	public double getSumaPenaziPrijataOdZakaznika() {
		return sumaPenaziPrijataOdZakaznika;
	}

	public int getPocetTovarov() {
		return pocetNaskenovanychTovarov;
	}

}
